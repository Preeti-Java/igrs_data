/**
 * 
 */
package com.cg.neel.igrs.district.common.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import com.cg.neel.igrs.district.common.CommonDeedAccessBean;
import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.common.CommonPropertyAccessBean;
import com.cg.neel.igrs.district.help.DistrictAccessBean;
import com.cg.neel.igrs.district.help.DocumentTypeAccessBean;
import com.cg.neel.igrs.district.help.RegistrationDistrict_District;
import com.cg.neel.igrs.district.help.RepositoryFactory;
import com.cg.neel.igrs.district.help.RepositoryFileIdFactory;
import com.cg.neel.igrs.district.help.RevenueDistrict_District;
import com.cg.neel.igrs.district.help.SRLocation_District;
import com.cg.neel.igrs.district.help.TehsilAccessBean;
import com.cg.neel.igrs.district.help.Tehsil_District;
import com.cg.neel.igrs.district.help.VillageAccessBean;
import com.cg.neel.igrs.district.help.Village_District;
import com.cg.neel.igrs.district.help.YearAccessBean;
import com.cg.neel.igrs.district.help.repository.DistrictRepository;
import com.cg.neel.igrs.district.help.repository.DocumentTypeRepository;
import com.cg.neel.igrs.district.help.repository.RegistrationDistrict_DistrictRepository;
import com.cg.neel.igrs.district.help.repository.RevenueDistrict_DistrictRepository;
import com.cg.neel.igrs.district.help.repository.SrLocation_DistirctRepository;
import com.cg.neel.igrs.district.help.repository.TehsilRepository;
import com.cg.neel.igrs.district.help.repository.Tehsil_DistrictRepository;
import com.cg.neel.igrs.district.help.repository.VillageRepository;
import com.cg.neel.igrs.district.help.repository.Village_DistrictRepository;
import com.cg.neel.igrs.district.help.repository.YearRepository;
import com.cg.neel.igrs.exceptions.SearchingCredentialException;
import com.cg.neel.igrs.utils.DataUtils;

/**
 * @author Preeti	
 * @Des this service search all the data related of igrs_data base
 *
 */
@Service
public class SearchServiceImpl implements SearchService{
	
	@Autowired
	private DataUtils dataUtils;
	
	@Autowired
	private TehsilRepository tehsilRepository;
	
	@Autowired
	private YearRepository yearRepository;
	
	@Autowired
	private VillageRepository villageRepository;
	
	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private RepositoryFactory repositoryFactory;
	
	@Autowired
	private RepositoryFileIdFactory repositoryFileIdFactory;
	
	@Autowired
	private DocumentTypeRepository documentTypeRepository;
	
	@Autowired
	private RegistrationDistrict_DistrictRepository registrationDistrictDistrictRepository;
	
	@Autowired
	private RevenueDistrict_DistrictRepository revenueDistrictDistrictRepository;
	
	@Autowired
	private SrLocation_DistirctRepository srLocationDistirctRepository;
	
	@Autowired
	private Village_DistrictRepository villageDistrictRepository;
	
	@Autowired
	private Tehsil_DistrictRepository tehsilDistrictRepository;
	
	//Bean and Repo
	private static final String PARTY2_REPO = "Party2Repository";
	private static final String FILEID_REPO = "FileIdRepository";
	private static final String DEED_BEAN = "DeedAccessBean";
	private static final String PARTY2_BEAN = "Party2AccessBean";
	private static final String PROPERTY_BEAN = "PropertyAccessBean";
	
	//PARAM NAME
	private static final String DISTRICT_ID = "districtId";
	private static final String KHASRA_NO = "khasraNo";
	private static final String DATE = "date";
	private static final String TEHSIL_ID = "tehsilId";
	private static final String VILLAGE_ID = "villageId";
	private static final String YEAR_ID = "yearId";
	private static final String FILE_ID = "fileid";
	private static final String DOCUMENT_TYPE = "documentType";
	private static final String OWNER_NAME = "ownerName";
	private static final String OWNER_NAME_HINDI = "ownerNameHindi";
	private static final String RELATIVE_NAME = "relativeName";
	private static final String RELATIVE_NAME_HINDI = "relativeNameHindi";
	private static final String VILLAGE_NAME = "villageName";
	private static final String VILLAGE_NAME_HINDI = "villageNameHindi";
	private static final String DISTRICT = "district";
	private static final String SUB_DISTRICT = "subDistrict";
	
	private static final String ID = "id";
	private static final String ENGLISH = "english";
	private static final String HINDI = "hindi";
	
	private static final String FIND_BY_FILE_ID = "findByFileId";
	private static final String FIND_BY_METHOD = "findByMethod";
	private static final String FIND_BY_KHASRA_METHOD = "findByKhasraMethod";
	private static final String FIND_BY_DATE_AND_TEHSIL_METHOD = "findByDateAndTehsilMethod";
	
	private static final String MISSING_VALUE = "Missing value";
	
	
	//3 Type of Search
	// District + Tehsil + Village +Year
	// District + KhasraNo
	// District + DOR
	@Override
	public List<Map<String,String>> getOwnerList(Map<String, String> map) {
		List<Map<String,String>> list = new ArrayList<>();
		int mapSize = map.size();
		//Map  have 4 parameter => First Search
		if(mapSize == 4)
			list = searchDistrictAndTehsilAndVillageAndYear(map);
		//Map  have 2 parameter  => Second Search
		if(mapSize == 2)
			list = searchDistrictAndKhasraNo(map);
		//Map  have 3 parameter => DOR Search
		if(mapSize == 3)
			list = searchDistrictAndDORAndTehsil(map);
		return list;
	}

	/**
	 * @param map
	 * @return
	 */
	private List<Map<String, String>> searchDistrictAndDORAndTehsil(Map<String, String> map) {

		// Check Map key have value
		boolean allValuesValid = map.values().stream().allMatch(value -> value != null && !value.isEmpty());
		if(!allValuesValid)
			throw new SearchingCredentialException(MISSING_VALUE);
		String districtId = map.get(DISTRICT_ID);
		String dateOfRegistration = map.get(DATE);
		String tehsilId = map.get(TEHSIL_ID);
		
		//Search Year Object for DistrictDeedDetails by yearId and districtId from Year Bean
		DistrictAccessBean districtAccessBean = districtRepository.getBySno(Long.parseLong(districtId));
		
		//Table Name
		String districtName = districtAccessBean.getEnglish();
		
		//Get Objects Of DistrictParty2
		 List<CommonParty2DetailsAccessBean> commonParty2DetailsList = findPartyName3(districtAccessBean,dateOfRegistration,tehsilId,districtName);

		 if(commonParty2DetailsList == null)
			 throw new SearchingCredentialException();
		 //Create Map only fileid and partyname
		 return  convert(commonParty2DetailsList);
	
	}

	/**
	 * @param districtAccessBean
	 * @param dateOfRegistration
	 * @param tehsil
	 * @param districtName
	 * @return
	 */
	private <S extends CommonParty2DetailsAccessBean>  List<S> findPartyName3(DistrictAccessBean districtAccessBean,
			String dateOfRegistration, String tehsil, String districtName) {

		//Get Repo by DistrictName
		Repository<?, ?> repository = repositoryFactory.getParty2Repository(districtName +PARTY2_REPO);
		// Build the method name dynamically (e.g., findByYear_SnoAndDistrict_Sno)
        String methodName = FIND_BY_DATE_AND_TEHSIL_METHOD;
        
        Method m = null;
		try {
			m = repository.getClass().getMethod(methodName,Long.class,Long.class,String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} 

        // Invoke the method on the repository instance (not on the repository class)
		Object result1 = new Object();
		try {
			if(m != null)
				result1 = m.invoke(repository,districtAccessBean.getSno().toString(),Long.parseLong(tehsil),dateOfRegistration);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}  
	    List<S> result = (List<S>) result1;
		
		return result;
	
	}

	/**
	 * @param map
	 * @return
	 */
	private List<Map<String, String>> searchDistrictAndKhasraNo(Map<String, String> map) {
		// Check Map key have value
		boolean allValuesValid = map.values().stream().allMatch(value -> value != null && !value.isEmpty());
		if(!allValuesValid)
			throw new SearchingCredentialException(MISSING_VALUE);
		String districtId = map.get(DISTRICT_ID);
		String khasraNo = map.get(KHASRA_NO);
		
		//Search Year Object for DistrictDeedDetails by yearId and districtId from Year Bean
		DistrictAccessBean districtAccessBean = districtRepository.getBySno(Long.parseLong(districtId));
		
		//Table Name
		String districtName = districtAccessBean.getEnglish();
		
		//Get Objects Of DistrictParty2
		 List<CommonParty2DetailsAccessBean> commonParty2DetailsList = findPartyName2(districtAccessBean,khasraNo,districtName);

		 if(commonParty2DetailsList == null)
			 throw new SearchingCredentialException();
		 //Create Map only fileid and partyname
		 return  convert(commonParty2DetailsList);
	}

	/**
	 * @param districtAccessBean
	 * @param khasraNo
	 * @param districtName
	 * @return
	 */
	private <S extends CommonParty2DetailsAccessBean> List<S> findPartyName2(DistrictAccessBean districtAccessBean, String khasraNo,
			String districtName) {

		//Get Repo by DistrictName
		Repository<?, ?> repository = repositoryFactory.getParty2Repository(districtName +PARTY2_REPO);
		// Build the method name dynamically (e.g., findByYear_SnoAndDistrict_Sno)
        String methodName = FIND_BY_KHASRA_METHOD;
        
        Method m = null;
		try {
			m = repository.getClass().getMethod(methodName,Long.class,String.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} 

        // Invoke the method on the repository instance (not on the repository class)
	    Object result1 = new Object();
		try {
		if(m != null) 
			result1 = m.invoke(repository,districtAccessBean.getSno().toString(),khasraNo);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}  
	    List<S> result = (List<S>) result1;
		
		return result;
	}

	/**
	 * @param map
	 * @return
	 */
	private List<Map<String,String>> searchDistrictAndTehsilAndVillageAndYear(Map<String, String> map) {
		// Check Map key have value
		boolean allValuesValid = map.values().stream().allMatch(value -> value != null && !value.isEmpty());
		if(!allValuesValid)
			throw new SearchingCredentialException(MISSING_VALUE);
		String districtId = map.get(DISTRICT_ID);
		String tehsilId = map.get(TEHSIL_ID);
		String villageId = map.get(VILLAGE_ID);
		String yearId = map.get(YEAR_ID);
		
		//Search Year Object for DistrictDeedDetails by yearId and districtId from Year Bean
		YearAccessBean yearAccessBean= yearRepository.getBySno(Long.parseLong(yearId));
		DistrictAccessBean districtAccessBean = districtRepository.getBySno(Long.parseLong(districtId));
		TehsilAccessBean tehsilAccessBean = tehsilRepository.getBySno(Long.parseLong(tehsilId));
		VillageAccessBean villageAccessBean = villageRepository.getBySno(Long.parseLong(villageId));
		
		//Table Name
		String districtName = districtAccessBean.getEnglish();
		
		//Get Objects Of DistrictParty2
		 List<CommonParty2DetailsAccessBean> commonParty2DetailsList = findDistrictDeedByYearAndDistrict(tehsilAccessBean,villageAccessBean,yearAccessBean,districtAccessBean,districtName);

		 if(commonParty2DetailsList == null)
			 throw new SearchingCredentialException();
		 //Create Map only fileid and partyname
		 return  convert(commonParty2DetailsList);
	}


	/**
	 * @param commonParty2DetailsList 
	 * @return
	 */
	private List<Map<String, String>> convert(List<CommonParty2DetailsAccessBean> commonParty2DetailsList) {
		 //Create Map only fileid and partyname
		 List<Map<String,String>> party2List = new ArrayList<>();
		 
		for(CommonParty2DetailsAccessBean data: commonParty2DetailsList) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(FILE_ID, data.getFileId());
			mapData.put(ENGLISH, data.getPartyName2());
			mapData.put(HINDI, data.getPartyName2Hindi());
			party2List.add(mapData);
		}
		
		Collections.sort(party2List, new Comparator<Map<String,String>>() {
			@Override
			public int compare(Map<String, String> o1, Map<String, String> o2) {
				String map1 = o1.get(ENGLISH);
				String map2 = o2.get(ENGLISH);
				
				return map1.compareToIgnoreCase(map2);
			}
		});
		return party2List;
	}

	/**
	 * @param villageAccessBean 
	 * @param tehsilAccessBean 
	 * @param yearAccessBean
	 * @param districtAccessBean
	 * @param districtName 
	 * @return CommonDeedAccessBean
	 */
	private <S extends CommonParty2DetailsAccessBean> List<S> findDistrictDeedByYearAndDistrict(TehsilAccessBean tehsilAccessBean, VillageAccessBean villageAccessBean, YearAccessBean yearAccessBean,
			DistrictAccessBean districtAccessBean, String districtName) {
		//Table name
		
		
		
		//Get Repo by DistrictName
		Repository<?, ?> repository = repositoryFactory.getParty2Repository(districtName +PARTY2_REPO);
		// Build the method name dynamically (e.g., findByYear_SnoAndDistrict_Sno)
       String methodName = FIND_BY_METHOD;
        
        Method m = null;
		try {
			m = repository.getClass().getMethod(methodName,Long.class,Long.class,Long.class,Long.class);
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} 

        // Invoke the method on the repository instance (not on the repository class)
		Object result1 = new Object();
		 List<S> result = null ;
		try {
			if(m != null) 
				result1 = m.invoke(repository,yearAccessBean.getSno(),tehsilAccessBean.getSno(),villageAccessBean.getSno(),districtAccessBean.getSno());
		            result = new ArrayList<>();
		            
		            if(result1 instanceof Iterable<?>) {
		            	Iterable<?> iterable = (Iterable<?>) result1;
		            	for(Object element : iterable) {
		            		  if (element instanceof CommonParty2DetailsAccessBean) {
		            			result.add((S) element);
		            		}
		            	}
		            }
		           
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
		
		return result;
	}


	@Override
	public List<Map<String, String>> getDocumentType(String key) {
		return convertDocumentType(documentTypeRepository.findAll());
	}
	
	/**
	 * @param DocumentTypeAccessBean List 
	 * @return List<Map<String, String>>
	 */
	private List<Map<String, String>> convertDocumentType(List<DocumentTypeAccessBean> lists) {
		 //Create Map 
		 List<Map<String,String>> documentType = new ArrayList<>();
		 
		for(DocumentTypeAccessBean data: lists) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(ID, data.getSno().toString());
			mapData.put(ENGLISH, data.getEnglish());
			mapData.put(HINDI, data.getHindi());
			documentType.add(mapData);
		}
		
		Collections.sort(documentType, new Comparator<Map<String,String>>() {
			@Override
			public int compare(Map<String, String> o1, Map<String, String> o2) {
				String map1 = o1.get(ENGLISH);
				String map2 = o2.get(ENGLISH);
				
				return map1.compareToIgnoreCase(map2);
			}
		});
	
		return documentType;
	}
	


	@Override
	public List<Map<String, String>> getRegistrationDistrict(String key, String districtId) {
		return convertRegistrationDistrict(registrationDistrictDistrictRepository.findByDistrictId(districtId));
	}
	
	/**
	 * @param RegistrationDistrictAccessBean List 
	 * @return List<Map<String, String>>
	 */
	private List<Map<String, String>> convertRegistrationDistrict(List<RegistrationDistrict_District> lists) {
		 //Create Map 
		 List<Map<String,String>> registrationDistricts = new ArrayList<>();
		 
		for(RegistrationDistrict_District data: lists) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(ID, data.getRegistrationDistrictAccessBean().getSno().toString());
			mapData.put(ENGLISH, data.getRegistrationDistrictAccessBean().getEnglish());
			mapData.put(HINDI, data.getRegistrationDistrictAccessBean().getHindi());
			registrationDistricts.add(mapData);
		}
		return registrationDistricts;
	}

	@Override
	public List<Map<String, String>> getSRLocation(String key, String districtId) {
		return convertSRLocation(srLocationDistirctRepository.findByDistrictId(districtId));
	}
	
	/**
	 * @param SRLocation List 
	 * @return List<Map<String, String>>
	 */
	private List<Map<String, String>> convertSRLocation(List<SRLocation_District> lists) {
		 //Create Map 
		 List<Map<String,String>> srLocations = new ArrayList<>();
		 
		for(SRLocation_District data: lists) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(ID, data.getSrLocationAccessBean().getSno().toString());
			mapData.put(ENGLISH, data.getSrLocationAccessBean().getEnglish());
			mapData.put(HINDI, data.getSrLocationAccessBean().getHindi());
			srLocations.add(mapData);
		}
		return srLocations;
	}

	@Override
	public List<Map<String, String>> getTehsil(String key, String districtId) {
		return convertTehsil(tehsilDistrictRepository.findByDistrictId(districtId));
	}

	/**
	 * @param TehsilAccessBean List 
	 * @return List<Map<String, String>>
	 */
	private List<Map<String, String>> convertTehsil(List<Tehsil_District> lists) {
		 //Create Map 
		 List<Map<String,String>> tehsils = new ArrayList<>();
		 
		for(Tehsil_District data: lists) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(ID, data.getTehsilAccessBean().getSno().toString());
			mapData.put(ENGLISH, data.getTehsilAccessBean().getEnglish());
			mapData.put(HINDI, data.getTehsilAccessBean().getHindi());
			tehsils.add(mapData);
		}
		
		Collections.sort(tehsils, new Comparator<Map<String,String>>() {
			@Override
			public int compare(Map<String, String> o1, Map<String, String> o2) {
				String map1 = o1.get(ENGLISH);
				String map2 = o2.get(ENGLISH);
				
				return map1.compareToIgnoreCase(map2);
			}
		});
		return tehsils;
	}
	
	@Override
	public List<Map<String, String>> getVillageName(String key, String districtId) {
		return convertVillageName(villageDistrictRepository.findByDistrictId(districtId));
	}

	/**
	 * @param Village List 
	 * @return List<Map<String, String>>
	 */
	private List<Map<String, String>> convertVillageName(List<Village_District> lists) {
		 //Create Map 
		 List<Map<String,String>> villages = new ArrayList<>();
		 
		for(Village_District data: lists) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(ID, data.getVillageAccessBean().getSno().toString());
			mapData.put(ENGLISH, data.getVillageAccessBean().getEnglish());
			mapData.put(HINDI, data.getVillageAccessBean().getHindi());
			villages.add(mapData);
		}
		
		Collections.sort(villages, new Comparator<Map<String,String>>() {
			@Override
			public int compare(Map<String, String> o1, Map<String, String> o2) {
				String map1 = o1.get(ENGLISH);
				String map2 = o2.get(ENGLISH);
				
				return map1.compareToIgnoreCase(map2);
			}
		});
		return villages;
	}
	
	@Override
	public List<Map<String, String>> getRevenueDistrict(String key, String districtId) {
		return convertRevenueDistrict(revenueDistrictDistrictRepository.findByDistrictId(districtId));
	}

	/**
	 * @param RevenueDistrict
	 * @return List<Map<String, String>>
	 */
	private List<Map<String, String>> convertRevenueDistrict(List<RevenueDistrict_District> lists) {
		 //Create Map 
		 List<Map<String,String>> revenueDistricts = new ArrayList<>();
		 
		for(RevenueDistrict_District data: lists) {
			Map<String,String> mapData = new HashMap<>();
			mapData.put(ID, data.getRevenueDistrictAccessBean().getSno().toString());
			mapData.put(ENGLISH, data.getRevenueDistrictAccessBean().getEnglish());
			mapData.put(HINDI, data.getRevenueDistrictAccessBean().getHindi());
			revenueDistricts.add(mapData);
		}
		return revenueDistricts;
	}

	@Override
	public Map<String, String> getPartyDetails(String fileCode) {
		//Find District by file special code
		String districtName = dataUtils.districtNameByFileId(fileCode);
		
		//Get Data
		return findPartyDetailsByFileId(districtName,fileCode);
	}

	/**
	 * @param fileid
	 * @param districtName 
	 * @return data  
	 */
	private  Map<String,String> findPartyDetailsByFileId(String districtName, String fileCode) {
		
		 Map<String,String> data = new HashMap<>();
		
		//Get Repo by DistrictName
		Repository<?, ?> repository = repositoryFileIdFactory.getFileIdRepository(districtName +FILEID_REPO);
		// Build the method name dynamically (e.g., findByYear_SnoAndDistrict_Sno)
        String methodName = FIND_BY_FILE_ID;
        
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
		      
			if(result1.getClass().getDeclaredFields() != null) {
				Field[] fields = result1.getClass().getDeclaredFields();
				data = getDataByAccessBean(fields,result1);
			}
		           
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		} 
		
		return data;
	}

	/**
	 * @param result1 
	 * @param field 
	 * @return 
	 * 
	 */
	private Map<String, String> getDataByAccessBean(Field[] fields, Object result1) {
		
		Map<String,String> map = new HashMap<>();
		for (Field field : fields) {
			if (!Modifier.isPublic(field.getModifiers())) {
				field.setAccessible(true);
			}
			try {
				Object obj = field.get(result1);
				// Check if the field is contains named "DeedAccessBean"
				if (field.getName().contains(DEED_BEAN) &&  (obj instanceof CommonDeedAccessBean)) {
					map.putAll(getCommonDeedByObj(obj));
					
				}
				// Check if the field is contains named "Party2AccessBean"
				if (field.getName().contains(PARTY2_BEAN) &&  (obj instanceof CommonParty2DetailsAccessBean)) {
					map.putAll(getCommonParty2DetalsByObj(obj));
					
				}
				// Check if the field is contains named "PropertyAccessBean"
				if (field.getName().contains(PROPERTY_BEAN) &&  (obj instanceof CommonPropertyAccessBean)) {
					map.putAll(getCommonPropertyByObj(obj));
					
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	/**
	 * @param obj
	 * @return
	 */
	private Map<String, String> getCommonPropertyByObj(Object obj) {
		Map<String,String> map = new HashMap<>();
		
		CommonPropertyAccessBean commonPropertyAccessBean = (CommonPropertyAccessBean) obj;
		map.put(KHASRA_NO, commonPropertyAccessBean.getKhasra());
		if(commonPropertyAccessBean.getVillageAccessBean() != null)
			map.put(VILLAGE_NAME, commonPropertyAccessBean.getVillageAccessBean().getEnglish());
		if(commonPropertyAccessBean.getVillageAccessBean() != null)
			map.put(VILLAGE_NAME_HINDI, commonPropertyAccessBean.getVillageAccessBean().getHindi());
	
		return map;
	}

	/**
	 * @param obj
	 * @return
	 */
	private Map<String, String> getCommonDeedByObj(Object obj) {
		Map<String,String> map = new HashMap<>();
		
		CommonDeedAccessBean commonDeedAccessBean = (CommonDeedAccessBean) obj;
		if(commonDeedAccessBean.getDocumentTypeAccessBean() != null)
			map.put(DOCUMENT_TYPE, commonDeedAccessBean.getDocumentTypeAccessBean().getEnglish());
		if(commonDeedAccessBean.getDistrictAccessBean() != null)
			map.put(DISTRICT, commonDeedAccessBean.getDistrictAccessBean().getEnglish());
		if(commonDeedAccessBean.getSubDistrictAccessBean() != null)
			map.put(SUB_DISTRICT, commonDeedAccessBean.getSubDistrictAccessBean().getEnglish());
		
		return map;
	}

	/**
	 * @param obj
	 * @return
	 */
	private Map<String, String> getCommonParty2DetalsByObj(Object obj) {
		Map<String,String> map = new HashMap<>();
		
		CommonParty2DetailsAccessBean commonParty2DetailsAccessBean = (CommonParty2DetailsAccessBean) obj;
		map.put(OWNER_NAME, commonParty2DetailsAccessBean.getPartyName2());
		map.put(OWNER_NAME_HINDI, commonParty2DetailsAccessBean.getPartyName2Hindi());
		map.put(RELATIVE_NAME, commonParty2DetailsAccessBean.getRelativeName2());
		map.put(RELATIVE_NAME_HINDI, commonParty2DetailsAccessBean.getRelativeName2Hindi());
		
		return map;
	}
	
	
}
