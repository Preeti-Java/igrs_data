/**
 * 
 */
package com.cg.neel.igrs.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.neel.igrs.district.help.SubDistrictCodeAccessBean;
import com.cg.neel.igrs.district.help.repository.SubDistrictCodeRepository;

/**
 * @author Preeti
 * @Des For reused method 
 *
 */
@Component
public class DataUtils {
	
	@Autowired
	private SubDistrictCodeRepository subDistrictCodeRepository;
	

	/**
	 * @param fileCode - fileId
	 * @return District Name
	 */
	public String districtNameByFileId(String fileCode) {
		//Extract english word from fileID
		String code = firstNumericValue(fileCode);
		
		//find from database
		SubDistrictCodeAccessBean subDistrictCodeAccessBean = subDistrictCodeRepository.findByCode(code);
		return subDistrictCodeAccessBean.getSubDistrictAccessBean().getDistrictAccessBean().getEnglish();
	}
	
	private String firstNumericValue(String str1) {
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < str1.length(); i++) {
			 if (Character.isAlphabetic(str1.charAt(i)))
				 str.append(str1.charAt(i));
			
		}
		return str.toString();

	}
	
}
	
