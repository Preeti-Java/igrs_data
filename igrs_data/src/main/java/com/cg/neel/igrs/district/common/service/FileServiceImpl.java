/**
 * 
 */
package com.cg.neel.igrs.district.common.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.neel.igrs.district.help.RepositoryFileIdFactory;
import com.cg.neel.igrs.exceptions.SearchingCredentialException;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfGState;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.RandomAccessFileOrArray;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Preeti
 * @Des this service search all the data related of igrs_data base
 *
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class FileServiceImpl implements FileService{
	
	private static final String FILE_CODE = "filecode";
	private static final String DISTRICT = "district";
	private static final String PDF_EXTENSION = ".pdf";
	
	//Bean and Repo
	private static final String FILEID_REPO = "FileIdRepository";
	
	//Method
	private static final String FIND_LOCATION_BY_FILE_ID = "findLocationByFileId";
	
	//Error
	private static final String FILE_LOCATION_IS_EMPTY = "File location is empty";
	private static final String PDF_NOT_FOUND_IN_LOCATION = "PDF not found in location";
	private static final String PDF_HAVE_NO_BYTE = "pdf have no byte";
	private static final String SOMETHING_ISSUE = "Something Issue";
	
	
	
	private final RepositoryFileIdFactory repositoryFileIdFactory;

	@Override
	public ResponseEntity<byte[]> getFirstPageForPreview(Map<String, String> map,HttpServletRequest request, HttpServletResponse response) {
		
		String filecode = map.get(FILE_CODE);
		String district = map.get(DISTRICT);
		
		//Get location for file
		Object location = getLocationOfFile(filecode,district);
		
		if(location == null)
			throw new SearchingCredentialException(FILE_LOCATION_IS_EMPTY);
		
		File file= new File(location.toString() + filecode + PDF_EXTENSION);
		if(!file.exists())
			throw new SearchingCredentialException(PDF_NOT_FOUND_IN_LOCATION);
		
		String webLocation = request.getServletContext().getRealPath("/") +"staticResources/pdfs/";
		
		//Create a copy in web-location + Split PDF and get 1st page
		File isCopyCreated = copyInWebLocation(file,webLocation,filecode);
		
		//convert file into byte[]
		byte[] pdfData = convertFileIntoByteArray(isCopyCreated);
		
		HttpHeaders headers = setHttpHeaders(file.getName());
		
		//set Response HttpHeaders
		return new ResponseEntity<>(pdfData, headers, HttpStatus.OK);
 }

	/**
	 * @param file
	 * @param webLocation
	 * @param filecode 
	 * @return
	 */
	private File copyInWebLocation(File file, String webLocation, String filecode) {
		// copy PDF file in to static resource
		
		File staticFilePath = new File(webLocation);
		if (!staticFilePath.exists())
			staticFilePath.mkdirs();

		String staticFile = webLocation + file.getName();

		Path copy = null;
		try {
			copy = Files.copy(file.toPath(), new File(staticFile).toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// file
		if(copy == null)
			 throw new SearchingCredentialException("Pdf copy is not created");
	    File webLocationFile = copy.toFile();
	    
	    if(!webLocationFile.exists())
	    	throw new SearchingCredentialException("Pdf copy is not created");
	    
	    try {
			PDDocument document = PDDocument.load(webLocationFile);
			// Splitter Class
	        Splitter splitting = new Splitter();
	  
	        // Splitting the pages into multiple PDFs
	        PDDocument Page = splitting.split(document).get(0);
	        
	        String pdfNew =  webLocation  + filecode + "@1.pdf";
	  
	        Page.save(pdfNew);
	        
	        //Add water-marks on PDF
	        addWaterMarks(webLocation,filecode);
	        
	        Page.close();
	        document.close();
	        
	        if(new File(pdfNew).exists())
	        	return new File(pdfNew);
	        
	     
	        
	       
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		return webLocationFile;
		
	}

	/**
	 * @param filecode 
	 * @param webLocation 
	 * @return 
	 * 
	 */
	private String addWaterMarks(String webLocation, String file) {
		String waterMarkedPath=webLocation;
		PdfReader pdfReader = null;
		try {
			pdfReader = new PdfReader(new RandomAccessFileOrArray(webLocation+file+"@1.pdf"),null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Document document=new Document();
		PdfWriter pdfWriter = null;
		try {
			pdfWriter = PdfWriter.getInstance(document,new FileOutputStream(webLocation+file));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		} 
		document.setPageSize(pdfReader.getPageSize(1));
		document.open();
		PdfContentByte pdfContent=pdfWriter.getDirectContent();
		PdfImportedPage page=null;
		Font font=new Font(Font.HELVETICA,25);
		Phrase waterMark=new Phrase("Only For Default Purpose",font);
		PdfGState pdfGS=new PdfGState();
		pdfGS.setFillOpacity(0.5f);
		for(int i=1;i<=pdfReader.getNumberOfPages();i++)
		{
			page=pdfWriter.getImportedPage(pdfReader,i);
			pdfContent.addTemplate(page,0.0F,0.0F);
			pdfContent.saveState();
			pdfContent.setGState(pdfGS);
			ColumnText.showTextAligned(pdfContent,Element.ALIGN_CENTER,waterMark,297,470,45);
			pdfContent.restoreState();
			if(i!=pdfReader.getNumberOfPages())
				document.setPageSize(pdfReader.getPageSize(i+1));
			document.newPage();
		}
		document.close();
		pdfReader.close();
		return waterMarkedPath;
	}

	/**
	 * @param pdfData
	 * @param fileName 
	 * @return HttpHeaders
	 */
	private HttpHeaders setHttpHeaders(String fileName) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_PDF);
		httpHeaders.setContentDispositionFormData(fileName, fileName);
		httpHeaders.setCacheControl("must-revalidate, post-check=0, pre-check=0");
		return httpHeaders;
	}

	/**
	 * @param file
	 * @return byte[]
	 */
	private byte[] convertFileIntoByteArray(File file) {
		byte[] pdfData = {};
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			try {
				pdfData = new byte[fileInputStream.available()];
				while (fileInputStream.read(pdfData) == -1) {
					throw new SearchingCredentialException(PDF_HAVE_NO_BYTE);
				}
			} catch (IOException e) {
				throw new SearchingCredentialException(SOMETHING_ISSUE + e);
			}
			fileInputStream.close();
			
		} catch (FileNotFoundException e) {
			throw new SearchingCredentialException(SOMETHING_ISSUE + e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return pdfData;
	}

	/**
	 * @param filecode
	 * @param district
	 * @return location of file
	 */
	private Object getLocationOfFile(String fileCode, String districtName) {
		//Get repository by district
		Repository<?, ?> repository = repositoryFileIdFactory.getFileIdRepository(districtName +FILEID_REPO);
		
		// Build the method name dynamically (e.g., findByYear_SnoAndDistrict_Sno)
        String methodName = FIND_LOCATION_BY_FILE_ID;
        
        Method m = null;
		try {
			m = repository.getClass().getMethod(methodName,String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} 

        // Invoke the method on the repository instance (not on the repository class)
		Object result1 = new Object();
		try {
			if(m != null) 
				result1 = m.invoke(repository,fileCode);
		           
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
		
		return result1;
	}
	
	
	
}
