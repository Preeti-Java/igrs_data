/**
 * 
 */
package com.cg.neel.igrs.district.common.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.neel.igrs.globalbean.GlobalSearchAccessBean;

/**
 * @author Preeti
 *
 */
@RequestMapping("/default")
public interface SearchCmd {
	
	@GetMapping("/ownerList")
	public ResponseEntity<List<Map<String,String>>> getOwnerList(@RequestParam final Map<String,String> map);
	
	@GetMapping("/param")
	public ResponseEntity<List<Map<String,String>>> paramSearch(@RequestParam final Map<String,String> map);
	
	@PostMapping("/advance")
	public ResponseEntity<List<Map<String,String>>> advanceSearch(@RequestBody final GlobalSearchAccessBean data);
	
	@PostMapping("/partyDetails")
	public ResponseEntity<Map<String,String>> partyDetails(@RequestParam final String fileCode);
	
}
