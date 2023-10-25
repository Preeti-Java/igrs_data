/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.VillageAccessBean;

/**
 * @author User
 *
 */
@Repository
public interface VillageRepository extends JpaRepository<VillageAccessBean, Long>{

	/**
	 * @param sno
	 * @return VillageAccessBean
	 */
	VillageAccessBean getBySno(long sno);


}
