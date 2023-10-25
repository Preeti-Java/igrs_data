/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;



/**
 * @author Preeti
 * 
 *
 */
@Transactional
public interface MappedTypeFileIdRepository<T extends CommonFileIdAccessBean> extends JpaRepository<T, Long>{

	
	
}
