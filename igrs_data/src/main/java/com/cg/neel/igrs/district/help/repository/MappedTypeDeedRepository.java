/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.neel.igrs.district.common.CommonDeedAccessBean;



/**
 * @author Preeti
 * 
 *
 */
@Transactional
public interface MappedTypeDeedRepository<T extends CommonDeedAccessBean> extends JpaRepository<T, Long>{

	
	
}
