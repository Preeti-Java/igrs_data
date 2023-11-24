/**
 * 
 */
package com.cg.neel.igrs.district.common.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.neel.igrs.district.common.service.FileService;
import com.cg.neel.igrs.exceptions.SearchingCredentialException;
import com.cg.neel.igrs.utils.UserUtils;

/**
 * @author Preeti
 * @Des this service search all the data related of igrs_data database
 */

@RestController
@RequestMapping("/file")
public class FileCmdImpl implements FileCmd{
	
	//Error
	private static final String SOMETHING_ISSUE = "Something Issue";
	
	@Autowired
	private FileService fileService;

	@Override
	public ResponseEntity<byte[]> getPreview(Map<String, String> map, HttpServletRequest request,
			HttpServletResponse response) {
		//check map key have values
		boolean check = map.values().stream().allMatch(value -> value!= null && !value.isEmpty());
		if(!check)
			throw new SearchingCredentialException(SOMETHING_ISSUE);
		return fileService.getFirstPageForPreview(map,request,response);
	}

	@Override
	public ResponseEntity<byte[]> downloadDeed(Map<String, String> map, HttpServletRequest request,
			HttpServletResponse response) {
		//check map key have values
		boolean check = map.values().stream().allMatch(value -> value!= null && !value.isEmpty());
		if(!check)
			throw new SearchingCredentialException(SOMETHING_ISSUE);
		//Get User-Id
		Long userId = UserUtils.getUserDetails();
		return fileService.downloadDeed(map,userId);
	}
	
	
	
}
