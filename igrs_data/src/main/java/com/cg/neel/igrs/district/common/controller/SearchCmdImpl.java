/**
 * 
 */
package com.cg.neel.igrs.district.common.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.neel.igrs.district.common.service.GlobalSearchService;
import com.cg.neel.igrs.district.common.service.SearchService;
import com.cg.neel.igrs.exceptions.SearchingCredentialException;
import com.cg.neel.igrs.globalbean.GlobalSearchAccessBean;

/**
 * @author Preeti
 * @Des this service search all the data related of igrs_data database
 */

@RestController
@RequestMapping("/search")
public class SearchCmdImpl implements SearchCmd{
	
	private static final String DISTRICT_ID = "districtId";
	private static final String Q = "q";
	
	//Dropdown Data case
	private static final String DOCUMENT_TYPE = "documentType";
	private static final String REGISTRATION_DISTRICT = "registrationDistrict";
	private static final String SR_LOCATION = "sRLocation";
	private static final String REVENUE_DISTRICT = "revenueDistrict";
	private static final String TEHSIL =  "tehsil";
	private static final String VILLAGE_NAME = "villageName";
	
	//Error
	private static final String SOMETHING_ISSUE = "Something Issue";

	
	
	@Autowired
	private SearchService searchService;
	
	@Autowired
	private GlobalSearchService globalSearchService;

	@Override
	public ResponseEntity<List<Map<String,String>>> getOwnerList(final Map<String, String> map) {
		if(map.isEmpty())
			return ResponseEntity.ok().body(null);
		List<Map<String,String>> responseData = searchService.getOwnerList(map);
		return ResponseEntity.ok().body(responseData);
	}

	@Override
	public ResponseEntity<List<Map<String, String>>> paramSearch(Map<String, String> map) {
		// Check Map key have value
		boolean allValuesValid = map.values().stream().allMatch(value -> value != null && !value.isEmpty());
		if(!allValuesValid)
			throw new SearchingCredentialException(SOMETHING_ISSUE);
		// Check  key
		String districtId = map.get(DISTRICT_ID);
		String key = map.get(Q);
		List<Map<String,String>> responseData = dropdownDataByKey(key,districtId);
		return ResponseEntity.ok().body(responseData);
	}

	/**
	 * @param key
	 * @param districtId 
	 * @return list of data
	 */
	private List<Map<String, String>> dropdownDataByKey(String key, String districtId) {
		switch(key) {
			case DOCUMENT_TYPE:
				return  searchService.getDocumentType(key);
			case REGISTRATION_DISTRICT:
				return  searchService.getRegistrationDistrict(key,districtId);
			case SR_LOCATION:
				return  searchService.getSRLocation(key,districtId);
			case REVENUE_DISTRICT:
				return  searchService.getRevenueDistrict(key,districtId);
			case TEHSIL:
				return  searchService.getTehsil(key,districtId);
			case VILLAGE_NAME:
				return  searchService.getVillageName(key,districtId);
			default:
			  throw new  SearchingCredentialException(SOMETHING_ISSUE);
		}
	}

	@Override
	public ResponseEntity<List<Map<String, String>>> advanceSearch(GlobalSearchAccessBean data) {
		 List<Map<String,String>> responseData = globalSearchService.globalSearch(data);
		return ResponseEntity.ok().body(responseData);
	}

	@Override
	public ResponseEntity<Map<String, String>> partyDetails(String fileCode) {
		Map<String,String> responseData = searchService.getPartyDetails(fileCode);
		return ResponseEntity.ok().body(responseData);
	}

	
}
