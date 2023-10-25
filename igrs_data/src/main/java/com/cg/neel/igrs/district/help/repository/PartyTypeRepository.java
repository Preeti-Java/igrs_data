/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.PartyTypeAccessBean;

/**
 * @author User
 *
 */
@Repository
public interface PartyTypeRepository extends JpaRepository<PartyTypeAccessBean, Long>{

}
