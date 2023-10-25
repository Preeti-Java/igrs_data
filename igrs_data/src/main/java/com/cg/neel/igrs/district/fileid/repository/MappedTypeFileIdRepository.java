/**
 * 
 */
package com.cg.neel.igrs.district.fileid.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;


/**
 * @author Preeti
 * 
 *
 */
@Transactional
public interface MappedTypeFileIdRepository<T extends CommonFileIdAccessBean> extends JpaRepository<T, Long>{
	
	
	T findByFileId(String fileId);
	
	@Query(value = "Select u.location from #{#entityName} u where u.fileId = ?1")
	String findLocationByFileId(String fileId);
	
}
