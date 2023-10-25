/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.cg.neel.igrs.district.common.CommonPropertyAccessBean;

/**
 * @author User
 *
 */
@NoRepositoryBean
public interface MappedTypePropertyRepository<T extends CommonPropertyAccessBean> extends JpaRepository<T, Long>{
	


	 

}
