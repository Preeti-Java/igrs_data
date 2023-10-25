/**
 * 
 */
package com.cg.neel.igrs.district.common.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;

/**
 * @author User
 *
 */
public interface FileService {

	/**
	 * @param map
	 * @param response 
	 * @param request 
	 */
	ResponseEntity<byte[]> getFirstPageForPreview(Map<String, String> map, HttpServletRequest request, HttpServletResponse response);


}
