package com.cg.neel.igrs.district.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.SargujaParty2AccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeParty2Repository;

@Repository
public interface SargujaParty2Repository extends MappedTypeParty2Repository<SargujaParty2AccessBean>{

	@Query(value = "SELECT * FROM Sargujaparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Sargujadeed d " + "INNER JOIN Sargujaproperty prop "
			+ "WHERE d.yearAccessBean_Sno = :year AND d.districtAccessBean_Sno = :district AND prop.tehsilAccessBean_Sno = :tehsil AND prop.villageAccessBean_Sno = :village)", nativeQuery = true)
	List<SargujaParty2AccessBean> findByMethod(Long year, Long tehsil, Long village,
			Long district);
	
	@Query(value = "SELECT * FROM Sargujaparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Sargujadeed d " + "INNER JOIN Sargujaproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND prop.khasra = :khasra)", nativeQuery = true)
	List<SargujaParty2AccessBean> findByKhasraMethod(Long district, String khasra);
	
	@Query(value = "SELECT * FROM Sargujaparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Sargujadeed d " + "INNER JOIN Sargujaproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND d.dateOfRegistration =:dateOfRegistration AND prop.tehsilAccessBean_Sno = :tehsil)", nativeQuery = true)
	List<SargujaParty2AccessBean> findByDateAndTehsilMethod(Long district, Long tehsil,String dateOfRegistration);
	
}
	