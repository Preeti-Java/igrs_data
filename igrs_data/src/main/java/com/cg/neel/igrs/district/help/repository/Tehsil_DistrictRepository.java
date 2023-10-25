package com.cg.neel.igrs.district.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.Tehsil_District;

@Repository
public interface Tehsil_DistrictRepository extends JpaRepository<Tehsil_District, Long>{

	/**
	 * @param districtId
	 * @return Tehsil_District List
	 */
	@Query(value = "Select * from tehsil_district where District_Sno = :districtId",nativeQuery = true)
	List<Tehsil_District> findByDistrictId(String districtId);

}
