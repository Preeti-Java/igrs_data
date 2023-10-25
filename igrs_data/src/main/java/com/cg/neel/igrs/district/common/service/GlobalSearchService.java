/**
 * 
 */
package com.cg.neel.igrs.district.common.service;

import java.util.List;
import java.util.Map;

import com.cg.neel.igrs.globalbean.GlobalSearchAccessBean;

/**
 * @author User
 *
 */
public interface GlobalSearchService {


	/**
	 * @param data
	 * @return
	 */
	List<Map<String, String>> globalSearch(GlobalSearchAccessBean data);


}
