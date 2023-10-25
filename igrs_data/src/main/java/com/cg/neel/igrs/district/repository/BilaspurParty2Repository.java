package com.cg.neel.igrs.district.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.BilaspurParty2AccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeParty2Repository;

@Repository
public interface BilaspurParty2Repository extends MappedTypeParty2Repository<BilaspurParty2AccessBean>{

	@Query(value = "SELECT * FROM Bilaspurparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Bilaspurdeed d " + "INNER JOIN Bilaspurproperty prop "
			+ "WHERE d.yearAccessBean_Sno = :year AND d.districtAccessBean_Sno = :district AND prop.tehsilAccessBean_Sno = :tehsil AND prop.villageAccessBean_Sno = :village)", nativeQuery = true)
	List<BilaspurParty2AccessBean> findByMethod(Long year, Long tehsil, Long village,
			Long district);
	
	@Query(value = "SELECT * FROM Bilaspurparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Bilaspurdeed d " + "INNER JOIN Bilaspurproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND prop.khasra = :khasra)", nativeQuery = true)
	List<BilaspurParty2AccessBean> findByKhasraMethod(Long district, String khasra);
	
	@Query(value = "SELECT * FROM Bilaspurparty2 p "
			+ "WHERE p.fileid IN (SELECT d.fileid FROM Bilaspurdeed d " + "INNER JOIN Bilaspurproperty prop "
			+ "WHERE d.districtAccessBean_Sno = :district AND d.dateOfRegistration =:dateOfRegistration AND prop.tehsilAccessBean_Sno = :tehsil)", nativeQuery = true)
	List<BilaspurParty2AccessBean> findByDateAndTehsilMethod(Long district, Long tehsil,String dateOfRegistration);
	
}
