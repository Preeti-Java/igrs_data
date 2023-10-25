package com.cg.neel.igrs.district.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.RegistrationDistrict_District;

@Repository
public interface RegistrationDistrict_DistrictRepository extends JpaRepository<RegistrationDistrict_District, Long> {

	/**
	 * @param districtId
	 * @return RegistrationDistrict_District List
	 */
	@Query(value = "Select * from registrationdistrict_district where District_Sno = :districtId",nativeQuery = true)
	List<RegistrationDistrict_District> findByDistrictId(String districtId);

	
}
