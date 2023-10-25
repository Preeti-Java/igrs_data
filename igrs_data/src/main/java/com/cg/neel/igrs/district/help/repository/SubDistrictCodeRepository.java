package com.cg.neel.igrs.district.help.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.SubDistrictCodeAccessBean;

@Repository
public interface SubDistrictCodeRepository extends JpaRepository<SubDistrictCodeAccessBean,Long>{

	/**
	 * @param code
	 * @return
	 */
	SubDistrictCodeAccessBean findByCode(String code);

}
