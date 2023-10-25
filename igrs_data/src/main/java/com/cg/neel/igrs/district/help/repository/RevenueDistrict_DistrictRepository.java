package com.cg.neel.igrs.district.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.RevenueDistrict_District;


@Repository
public interface RevenueDistrict_DistrictRepository extends JpaRepository<RevenueDistrict_District, Long> {

	/**
	 * @param districtId
	 * @return
	 */
	@Query(value = "Select * from revenuedistrict_district where District_Sno = :districtId",nativeQuery = true)
	List<RevenueDistrict_District> findByDistrictId(String districtId);

}
