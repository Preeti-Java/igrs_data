package com.cg.neel.igrs.district.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.Village_District;

@Repository
public interface Village_DistrictRepository extends JpaRepository<Village_District, Long>{

	/**
	 * @param districtId
	 * @return Village_District List
	 */
	@Query(value = "Select * from village_district where District_Sno = :districtId",nativeQuery = true)
	List<Village_District> findByDistrictId(String districtId);



}
