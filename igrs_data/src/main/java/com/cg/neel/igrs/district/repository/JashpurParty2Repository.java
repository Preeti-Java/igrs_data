package com.cg.neel.igrs.district.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.JashpurParty2AccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeParty2Repository;

@Repository
public interface JashpurParty2Repository extends MappedTypeParty2Repository<JashpurParty2AccessBean>{

	@Query(value = "SELECT * FROM Jashpurparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Jashpurdeed d " + "INNER JOIN Jashpurproperty prop "
			+ "WHERE d.yearAccessBean_Sno = :year AND d.districtAccessBean_Sno = :district AND prop.tehsilAccessBean_Sno = :tehsil AND prop.villageAccessBean_Sno = :village)", nativeQuery = true)
	List<JashpurParty2AccessBean> findByMethod(Long year, Long tehsil, Long village,
			Long district);
	
	@Query(value = "SELECT * FROM Jashpurparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Jashpurdeed d " + "INNER JOIN Jashpurproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND prop.khasra = :khasra)", nativeQuery = true)
	List<JashpurParty2AccessBean> findByKhasraMethod(Long district, String khasra);
	
	@Query(value = "SELECT * FROM Jashpurparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Jashpurdeed d " + "INNER JOIN Jashpurproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND d.dateOfRegistration =:dateOfRegistration AND prop.tehsilAccessBean_Sno = :tehsil)", nativeQuery = true)
	List<JashpurParty2AccessBean> findByDateAndTehsilMethod(Long district, Long tehsil,String dateOfRegistration);
	
}
