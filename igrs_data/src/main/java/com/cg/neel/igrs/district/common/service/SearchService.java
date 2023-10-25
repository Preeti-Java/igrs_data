/**
 * 
 */
package com.cg.neel.igrs.district.common.service;

import java.util.List;
import java.util.Map;

/**
 * @author User
 *
 */
public interface SearchService {

	/**
	 * @param map
	 * @return ownerList
	 */
	List<Map<String,String>> getOwnerList(Map<String, String> map);

	/**
	 * @param key
	 * @return List Document Type
	 */
	List<Map<String, String>> getDocumentType(String key);

	/**
	 * @param key
	 * @param districtId 
	 * @return list Regsitration district
	 */
	List<Map<String, String>> getRegistrationDistrict(String key, String districtId);

	/**
	 * @param key
	 * @param districtId 
	 * @return list sr location
	 */
	List<Map<String, String>> getSRLocation(String key, String districtId);

	/**
	 * @param key
	 * @param districtId 
	 * @return list tehsil
	 */
	List<Map<String, String>> getTehsil(String key, String districtId);

	/**
	 * @param key
	 * @param districtId 
	 * @return List villageName
	 */
	List<Map<String, String>> getVillageName(String key, String districtId);

	/**
	 * @param key
	 * @param districtId
	 * @return
	 */
	List<Map<String, String>> getRevenueDistrict(String key, String districtId);

	/**
	 * @param fileCode
	 * @return
	 */
	Map<String, String> getPartyDetails(String fileCode);


}
