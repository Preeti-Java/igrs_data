package com.cg.neel.igrs.district.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.SRLocation_District;

@Repository
public interface SrLocation_DistirctRepository extends JpaRepository<SRLocation_District, Long>{

	/**
	 * @param districtId
	 * @return SRLocation_District List
	 */
	@Query(value = "Select * from srlocation_district where District_Sno = :districtId",nativeQuery = true)
	List<SRLocation_District> findByDistrictId(String districtId);

}
