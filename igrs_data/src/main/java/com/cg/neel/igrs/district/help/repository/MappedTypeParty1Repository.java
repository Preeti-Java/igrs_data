/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.cg.neel.igrs.district.common.CommonParty1DetailsAccessBean;

/**
 * @author User
 *
 */
@NoRepositoryBean
public interface MappedTypeParty1Repository<T extends CommonParty1DetailsAccessBean> extends JpaRepository<T, Long>{
	


	 

}
