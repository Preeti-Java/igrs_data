/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.RevenueDistrictAccessBean;

/**
 * @author User
 *
 */
@Repository
public interface RevenueDistrictRepository extends JpaRepository<RevenueDistrictAccessBean, Long>{


}
