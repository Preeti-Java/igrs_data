/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.SRLocationAccessBean;

/**
 * @author User
 *
 */
@Repository
public interface SRLocationRepository extends JpaRepository<SRLocationAccessBean, Long>{


}
