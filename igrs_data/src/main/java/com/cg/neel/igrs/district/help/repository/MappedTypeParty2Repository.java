/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.DistrictAccessBean;
import com.cg.neel.igrs.district.help.TehsilAccessBean;
import com.cg.neel.igrs.district.help.VillageAccessBean;
import com.cg.neel.igrs.district.help.YearAccessBean;

/**
 * @author User
 *
 */
@NoRepositoryBean
public interface MappedTypeParty2Repository<T extends CommonParty2DetailsAccessBean> extends JpaRepository<T, Long>{
	
	@Query(value = "SELECT p.partyName,p.fileid FROM kawardhaparty2 p " +
	           "WHERE p.fileid IN (SELECT d.fileid FROM kawardhadeed d " +
	           "INNER JOIN kawardhaproperty prop " +
	           "WHERE d.yearAccessBean_Sno = :year AND d.districtAccessBean_Sno = :district AND prop.tehsilAccessBean_Sno = :tehsil AND prop.villageAccessBean_Sno = :village)",nativeQuery = true)
	    List<T> findKawardhaParty2ByMethod(
	    		YearAccessBean year,
	             TehsilAccessBean tehsil,
	            VillageAccessBean village,
	            DistrictAccessBean district);

	 

}
