/**
 * 
 */
package com.cg.neel.igrs.district.common.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.cg.neel.igrs.district.common.CommonDeedAccessBean;
import com.cg.neel.igrs.district.common.CommonParty1DetailsAccessBean;
import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.common.CommonPropertyAccessBean;
import com.cg.neel.igrs.district.help.DistrictAccessBean;
import com.cg.neel.igrs.district.help.RepositoryFactory2;
import com.cg.neel.igrs.district.help.repository.DistrictRepository;
import com.cg.neel.igrs.district.help.repository.MappedTypeDeedRepository;
import com.cg.neel.igrs.exceptions.CommonRepositoryNullPointerException;
import com.cg.neel.igrs.globalbean.GlobalSearchAccessBean;

/**
 * @author Preeti
 * @Des this service search all the data related of igrs_data base
 *
 */
@Service
public class GlobalSearchServiceImpl implements GlobalSearchService{
	
	@Autowired
	private DistrictRepository districtRepository;
	
	@Autowired
	private RepositoryFactory2 repositoryFactory2;
	
	@Override
	public List<Map<String, String>> globalSearch(GlobalSearchAccessBean data) {
		
		//Get Data
		CommonDeedAccessBean commonDeedAccessBean = data.getCommonDeed();
		CommonPropertyAccessBean commonPropertyAccessBean = data.getCommonProperty();
		CommonParty1DetailsAccessBean commonParty1DetailsAccessBean = data.getCommonParty1();
		
		CommonParty2DetailsAccessBean commonParty2DetailsAccessBean = data.getCommonParty2();
		
		List<CommonDeedAccessBean> commonDeedDataList = new ArrayList<>();
		//Find table Name 
		String districtName;
		
		if(commonDeedAccessBean != null) {
			 districtName = findDistrictName(commonDeedAccessBean);
			
			 try {
				commonDeedDataList = getCommonDeedData(commonDeedAccessBean,districtName);
			} catch (CommonRepositoryNullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return Collections.emptyList();
	}

	/**
	 * @param commonDeedAccessBean
	 * @return District Name
	 */
	private String findDistrictName(CommonDeedAccessBean commonDeedAccessBean) {
		// Check District Name
		Long districtSno = commonDeedAccessBean.getDistrictAccessBean().getSno();

		// From database name of district
		DistrictAccessBean districtAccessBean = districtRepository.getBySno(districtSno);
		// TableName
		return districtAccessBean.getEnglish();
	}

	/**
	 * @param commonDeedAccessBean
	 * @param districtName 
	 * @return FileId List
	 * @throws CommonRepositoryNullPointerException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	private <S extends CommonDeedAccessBean> List<CommonDeedAccessBean> getCommonDeedData(CommonDeedAccessBean commonDeedAccessBean, String districtName) throws CommonRepositoryNullPointerException{
		
		S entity = null ;
		 // Get the repository bean using the repository factory
	    MappedTypeDeedRepository<?> mappedTypeDeedRepository = repositoryFactory2.getDeedRepository(districtName);
	    
	    ExampleMatcher matcher = ExampleMatcher.matching()
	    		.withIgnoreCase()
	    		.withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
	    
	    //Dynamic Exclude fields with null or empty values
	    Example<CommonDeedAccessBean> example = Example.of(commonDeedAccessBean, matcher);

	  //  Optional<?> l = mappedTypeDeedRepository.findAll(example);
	 

	   

		List<CommonDeedAccessBean> result = null;
		return result;
	}
	
	
}
