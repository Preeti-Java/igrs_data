/**
 * 
 */
package com.cg.neel.igrs.district.common.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Preeti
 *
 */
@RequestMapping("/default")
public interface FileCmd {
	
	@GetMapping(   )
	public ResponseEntity<byte[]> getPreview(@RequestParam final Map<String,String> map,
			HttpServletRequest request,
			HttpServletResponse response);
	
	@GetMapping("/download")
	public ResponseEntity<byte[]> downloadDeed(@RequestParam final Map<String,String> map,
			HttpServletRequest request,
			HttpServletResponse response
			);
	
	
}
