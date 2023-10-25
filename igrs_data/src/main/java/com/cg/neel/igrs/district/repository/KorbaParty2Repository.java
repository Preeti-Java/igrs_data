package com.cg.neel.igrs.district.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.KorbaParty2AccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeParty2Repository;

@Repository
public interface KorbaParty2Repository extends MappedTypeParty2Repository<KorbaParty2AccessBean>{

	@Query(value = "SELECT * FROM Korbaparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Korbadeed d " + "INNER JOIN Korbaproperty prop "
			+ "WHERE d.yearAccessBean_Sno = :year AND d.districtAccessBean_Sno = :district AND prop.tehsilAccessBean_Sno = :tehsil AND prop.villageAccessBean_Sno = :village)", nativeQuery = true)
	List<KorbaParty2AccessBean> findByMethod(Long year, Long tehsil, Long village,
			Long district);
	
	@Query(value = "SELECT * FROM Korbaparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Korbadeed d " + "INNER JOIN Korbaproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND prop.khasra = :khasra)", nativeQuery = true)
	List<KorbaParty2AccessBean> findByKhasraMethod(Long district, String khasra);
	
	@Query(value = "SELECT * FROM Korbaparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Korbadeed d " + "INNER JOIN Korbaproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND d.dateOfRegistration =:dateOfRegistration AND prop.tehsilAccessBean_Sno = :tehsil)", nativeQuery = true)
	List<KorbaParty2AccessBean> findByDateAndTehsilMethod(Long district, Long tehsil,String dateOfRegistration);
	
}
