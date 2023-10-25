/**
 * 
 */
package com.cg.neel.igrs.district.help;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cg.neel.igrs.district.help.repository.MappedTypeDeedRepository;
import com.cg.neel.igrs.district.help.repository.MappedTypeParty1Repository;
import com.cg.neel.igrs.district.help.repository.MappedTypeParty2Repository;
import com.cg.neel.igrs.district.help.repository.MappedTypePropertyRepository;
import com.cg.neel.igrs.district.repository.BalodDeedRepository;
import com.cg.neel.igrs.district.repository.BalodParty1Repository;
import com.cg.neel.igrs.district.repository.BalodParty2Repository;
import com.cg.neel.igrs.district.repository.BalodPropertyRepository;
import com.cg.neel.igrs.district.repository.BalodaBazarDeedRepository;
import com.cg.neel.igrs.district.repository.BalodaBazarParty1Repository;
import com.cg.neel.igrs.district.repository.BalodaBazarParty2Repository;
import com.cg.neel.igrs.district.repository.BalodaBazarPropertyRepository;
import com.cg.neel.igrs.district.repository.BastarDeedRepository;
import com.cg.neel.igrs.district.repository.BastarParty1Repository;
import com.cg.neel.igrs.district.repository.BastarParty2Repository;
import com.cg.neel.igrs.district.repository.BastarPropertyRepository;
import com.cg.neel.igrs.district.repository.BemetaraDeedRepository;
import com.cg.neel.igrs.district.repository.BemetaraParty1Repository;
import com.cg.neel.igrs.district.repository.BemetaraParty2Repository;
import com.cg.neel.igrs.district.repository.BemetaraPropertyRepository;
import com.cg.neel.igrs.district.repository.BilaspurDeedRepository;
import com.cg.neel.igrs.district.repository.BilaspurParty1Repository;
import com.cg.neel.igrs.district.repository.BilaspurParty2Repository;
import com.cg.neel.igrs.district.repository.BilaspurPropertyRepository;
import com.cg.neel.igrs.district.repository.DantewadaDeedRepository;
import com.cg.neel.igrs.district.repository.DantewadaParty1Repository;
import com.cg.neel.igrs.district.repository.DantewadaParty2Repository;
import com.cg.neel.igrs.district.repository.DantewadaPropertyRepository;
import com.cg.neel.igrs.district.repository.DhamtariDeedRepository;
import com.cg.neel.igrs.district.repository.DhamtariParty1Repository;
import com.cg.neel.igrs.district.repository.DhamtariParty2Repository;
import com.cg.neel.igrs.district.repository.DhamtariPropertyRepository;
import com.cg.neel.igrs.district.repository.DurgDeedRepository;
import com.cg.neel.igrs.district.repository.DurgParty1Repository;
import com.cg.neel.igrs.district.repository.DurgParty2Repository;
import com.cg.neel.igrs.district.repository.DurgPropertyRepository;
import com.cg.neel.igrs.district.repository.GariyabandDeedRepository;
import com.cg.neel.igrs.district.repository.GariyabandParty1Repository;
import com.cg.neel.igrs.district.repository.GariyabandParty2Repository;
import com.cg.neel.igrs.district.repository.GariyabandPropertyRepository;
import com.cg.neel.igrs.district.repository.JanjgirChampaDeedRepository;
import com.cg.neel.igrs.district.repository.JanjgirChampaParty1Repository;
import com.cg.neel.igrs.district.repository.JanjgirChampaParty2Repository;
import com.cg.neel.igrs.district.repository.JanjgirChampaPropertyRepository;
import com.cg.neel.igrs.district.repository.JashpurDeedRepository;
import com.cg.neel.igrs.district.repository.JashpurParty1Repository;
import com.cg.neel.igrs.district.repository.JashpurParty2Repository;
import com.cg.neel.igrs.district.repository.JashpurPropertyRepository;
import com.cg.neel.igrs.district.repository.KankerDeedRepository;
import com.cg.neel.igrs.district.repository.KankerParty1Repository;
import com.cg.neel.igrs.district.repository.KankerParty2Repository;
import com.cg.neel.igrs.district.repository.KankerPropertyRepository;
import com.cg.neel.igrs.district.repository.KawardhaDeedRepository;
import com.cg.neel.igrs.district.repository.KawardhaParty1Repository;
import com.cg.neel.igrs.district.repository.KawardhaParty2Repository;
import com.cg.neel.igrs.district.repository.KawardhaPropertyRepository;
import com.cg.neel.igrs.district.repository.KorbaDeedRepository;
import com.cg.neel.igrs.district.repository.KorbaParty1Repository;
import com.cg.neel.igrs.district.repository.KorbaParty2Repository;
import com.cg.neel.igrs.district.repository.KorbaPropertyRepository;
import com.cg.neel.igrs.district.repository.KoriyaDeedRepository;
import com.cg.neel.igrs.district.repository.KoriyaParty1Repository;
import com.cg.neel.igrs.district.repository.KoriyaParty2Repository;
import com.cg.neel.igrs.district.repository.KoriyaPropertyRepository;
import com.cg.neel.igrs.district.repository.MahasamundDeedRepository;
import com.cg.neel.igrs.district.repository.MahasamundParty1Repository;
import com.cg.neel.igrs.district.repository.MahasamundParty2Repository;
import com.cg.neel.igrs.district.repository.MahasamundPropertyRepository;
import com.cg.neel.igrs.district.repository.MungeliDeedRepository;
import com.cg.neel.igrs.district.repository.MungeliParty1Repository;
import com.cg.neel.igrs.district.repository.MungeliParty2Repository;
import com.cg.neel.igrs.district.repository.MungeliPropertyRepository;
import com.cg.neel.igrs.district.repository.RaigarhDeedRepository;
import com.cg.neel.igrs.district.repository.RaigarhParty1Repository;
import com.cg.neel.igrs.district.repository.RaigarhParty2Repository;
import com.cg.neel.igrs.district.repository.RaigarhPropertyRepository;
import com.cg.neel.igrs.district.repository.RaipurDeedRepository;
import com.cg.neel.igrs.district.repository.RaipurParty1Repository;
import com.cg.neel.igrs.district.repository.RaipurParty2Repository;
import com.cg.neel.igrs.district.repository.RaipurPropertyRepository;
import com.cg.neel.igrs.district.repository.RajnandgaonDeedRepository;
import com.cg.neel.igrs.district.repository.RajnandgaonParty1Repository;
import com.cg.neel.igrs.district.repository.RajnandgaonParty2Repository;
import com.cg.neel.igrs.district.repository.RajnandgaonPropertyRepository;
import com.cg.neel.igrs.district.repository.SargujaDeedRepository;
import com.cg.neel.igrs.district.repository.SargujaParty1Repository;
import com.cg.neel.igrs.district.repository.SargujaParty2Repository;
import com.cg.neel.igrs.district.repository.SargujaPropertyRepository;
import com.cg.neel.igrs.exceptions.CommonRepositoryNullPointerException;

/**
 * @author Preeti
 *
 */

@Service
public class RepositoryFactory2 {
	
	private static final String COMMON_REPO_NOT_FOUND_ERROR = "Common Repository is null for district : ";

	@Autowired
	private ApplicationContext applicationContext;
	
	private Map<String, MappedTypeDeedRepository<?>> repoDeedMap = null;
	
	private Map<String, MappedTypePropertyRepository<?>> repoTypeMap = null;
	
	private Map<String, MappedTypeParty1Repository<?>> repoParty1Map = null;
	
	private Map<String, MappedTypeParty2Repository<?>> repoParty2Map = null;
	
	
	public MappedTypeDeedRepository<?> getDeedRepository(String district) throws CommonRepositoryNullPointerException {

		MappedTypeDeedRepository<?> commonRepo = getAllDeedRepo().get(district);
		 if(commonRepo==null)
			 throw new CommonRepositoryNullPointerException(COMMON_REPO_NOT_FOUND_ERROR+district);
		 return commonRepo;
	}

	// all  repository map with district name
	private Map<String, MappedTypeDeedRepository<?>> getAllDeedRepo() {

		if (repoDeedMap != null) {
			return repoDeedMap;
		}

		Map<String, MappedTypeDeedRepository<?>> map = new HashMap<>();
		map.put("BalodDeed", applicationContext.getBean(BalodDeedRepository.class));
		map.put("BalodaBazarDeed", applicationContext.getBean(BalodaBazarDeedRepository.class));
		map.put("BastarDeed", applicationContext.getBean(BastarDeedRepository.class));
		map.put("BemetaraDeed", applicationContext.getBean(BemetaraDeedRepository.class));
		map.put("BilaspurDeed", applicationContext.getBean(BilaspurDeedRepository.class));
		map.put("DantewadaDeed", applicationContext.getBean(DantewadaDeedRepository.class));
		map.put("DhamtariDeed", applicationContext.getBean(DhamtariDeedRepository.class));
		map.put("DurgDeed", applicationContext.getBean(DurgDeedRepository.class));
		map.put("GariyabandDeed", applicationContext.getBean(GariyabandDeedRepository.class));
		map.put("JanjgirChampaDeed", applicationContext.getBean(JanjgirChampaDeedRepository.class));
		map.put("JashpurDeed", applicationContext.getBean(JashpurDeedRepository.class));
		map.put("KankerDeed", applicationContext.getBean(KankerDeedRepository.class));
		map.put("KawardhaDeed", applicationContext.getBean(KawardhaDeedRepository.class));
		map.put("KorbaDeed", applicationContext.getBean(KorbaDeedRepository.class));
		map.put("KoriyaDeed", applicationContext.getBean(KoriyaDeedRepository.class));
		map.put("MahasamundDeed", applicationContext.getBean(MahasamundDeedRepository.class));
		map.put("MungeliDeed", applicationContext.getBean(MungeliDeedRepository.class));
		map.put("RaigarhDeed", applicationContext.getBean(RaigarhDeedRepository.class));
		map.put("RaipurDeed", applicationContext.getBean(RaipurDeedRepository.class));
		map.put("RajnandgaonDeed", applicationContext.getBean(RajnandgaonDeedRepository.class));
		map.put("SargujaDeed", applicationContext.getBean(SargujaDeedRepository.class));

		return map;
	}

	public MappedTypePropertyRepository<?> getPropertyRepository(String district) throws CommonRepositoryNullPointerException {

		MappedTypePropertyRepository<?> commonRepo = getAllPropertyRepo().get(district);
		 if(commonRepo==null)
			 throw new CommonRepositoryNullPointerException(COMMON_REPO_NOT_FOUND_ERROR+district);
		 return commonRepo;
	}

	// all district repository map with district name
	private Map<String, MappedTypePropertyRepository<?>> getAllPropertyRepo() {

		if (repoTypeMap != null) {
			return repoTypeMap;
		}

		Map<String, MappedTypePropertyRepository<?>> map = new HashMap<>();
		map.put("BalodProperty", applicationContext.getBean(BalodPropertyRepository.class));
		map.put("BalodaBazarProperty", applicationContext.getBean(BalodaBazarPropertyRepository.class));
		map.put("BastarProperty", applicationContext.getBean(BastarPropertyRepository.class));
		map.put("BemetaraProperty", applicationContext.getBean(BemetaraPropertyRepository.class));
		map.put("BilaspurProperty", applicationContext.getBean(BilaspurPropertyRepository.class));
		map.put("DantewadaProperty", applicationContext.getBean(DantewadaPropertyRepository.class));
		map.put("DhamtariProperty", applicationContext.getBean(DhamtariPropertyRepository.class));
		map.put("DurgProperty", applicationContext.getBean(DurgPropertyRepository.class));
		map.put("GariyabandProperty", applicationContext.getBean(GariyabandPropertyRepository.class));
		map.put("JanjgirChampaProperty", applicationContext.getBean(JanjgirChampaPropertyRepository.class));
		map.put("JashpurProperty", applicationContext.getBean(JashpurPropertyRepository.class));
		map.put("KankerProperty", applicationContext.getBean(KankerPropertyRepository.class));
		map.put("KawardhaProperty", applicationContext.getBean(KawardhaPropertyRepository.class));
		map.put("KorbaProperty", applicationContext.getBean(KorbaPropertyRepository.class));
		map.put("KoriyaProperty", applicationContext.getBean(KoriyaPropertyRepository.class));
		map.put("MahasamundProperty", applicationContext.getBean(MahasamundPropertyRepository.class));
		map.put("MungeliProperty", applicationContext.getBean(MungeliPropertyRepository.class));
		map.put("RaigarhProperty", applicationContext.getBean(RaigarhPropertyRepository.class));
		map.put("RaipurProperty", applicationContext.getBean(RaipurPropertyRepository.class));
		map.put("RajnandgaonProperty", applicationContext.getBean(RajnandgaonPropertyRepository.class));
		map.put("SargujaProperty", applicationContext.getBean(SargujaPropertyRepository.class));

		return map;
	}
	
	
	public MappedTypeParty1Repository<?> getParty1Repository(String district) throws CommonRepositoryNullPointerException {

		MappedTypeParty1Repository<?> commonRepo = getAllParty1Repo().get(district);
		 if(commonRepo==null)
			 throw new CommonRepositoryNullPointerException(COMMON_REPO_NOT_FOUND_ERROR+district);
		 return commonRepo;
	}

	// all  repository map with district name
	private Map<String, MappedTypeParty1Repository<?>> getAllParty1Repo() {

		if (repoParty1Map != null) {
			return repoParty1Map;
		}

		Map<String, MappedTypeParty1Repository<?>> map = new HashMap<>();
		map.put("BalodParty1", applicationContext.getBean(BalodParty1Repository.class));
		map.put("BalodaBazarParty1", applicationContext.getBean(BalodaBazarParty1Repository.class));
		map.put("BastarParty1", applicationContext.getBean(BastarParty1Repository.class));
		map.put("BemetaraParty1", applicationContext.getBean(BemetaraParty1Repository.class));
		map.put("BilaspurParty1", applicationContext.getBean(BilaspurParty1Repository.class));
		map.put("DantewadaParty1", applicationContext.getBean(DantewadaParty1Repository.class));
		map.put("DhamtariParty1", applicationContext.getBean(DhamtariParty1Repository.class));
		map.put("DurgParty1", applicationContext.getBean(DurgParty1Repository.class));
		map.put("GariyabandParty1", applicationContext.getBean(GariyabandParty1Repository.class));
		map.put("JanjgirChampaParty1", applicationContext.getBean(JanjgirChampaParty1Repository.class));
		map.put("JashpurParty1", applicationContext.getBean(JashpurParty1Repository.class));
		map.put("KankerParty1", applicationContext.getBean(KankerParty1Repository.class));
		map.put("KawardhaParty1", applicationContext.getBean(KawardhaParty1Repository.class));
		map.put("KorbaParty1", applicationContext.getBean(KorbaParty1Repository.class));
		map.put("KoriyaParty1", applicationContext.getBean(KoriyaParty1Repository.class));
		map.put("MahasamundParty1", applicationContext.getBean(MahasamundParty1Repository.class));
		map.put("MungeliParty1", applicationContext.getBean(MungeliParty1Repository.class));
		map.put("RaigarhParty1", applicationContext.getBean(RaigarhParty1Repository.class));
		map.put("RaipurParty1", applicationContext.getBean(RaipurParty1Repository.class));
		map.put("RajnandgaonParty1", applicationContext.getBean(RajnandgaonParty1Repository.class));
		map.put("SargujaParty1", applicationContext.getBean(SargujaParty1Repository.class));

		return map;
	}

	public MappedTypeParty2Repository<?> getParty2Repository(String district) throws CommonRepositoryNullPointerException {

		MappedTypeParty2Repository<?> commonRepo = getAllParty2Repo().get(district);
		 if(commonRepo==null)
			 throw new CommonRepositoryNullPointerException(COMMON_REPO_NOT_FOUND_ERROR+district);
		 return commonRepo;
	}

	// all district repository map with district name
	private Map<String, MappedTypeParty2Repository<?>> getAllParty2Repo() {

		if (repoParty2Map != null) {
			return repoParty2Map;
		}

		Map<String, MappedTypeParty2Repository<?>> map = new HashMap<>();
		map.put("BalodParty2", applicationContext.getBean(BalodParty2Repository.class));
		map.put("BalodaBazarParty2", applicationContext.getBean(BalodaBazarParty2Repository.class));
		map.put("BastarParty2", applicationContext.getBean(BastarParty2Repository.class));
		map.put("BemetaraParty2", applicationContext.getBean(BemetaraParty2Repository.class));
		map.put("BilaspurParty2", applicationContext.getBean(BilaspurParty2Repository.class));
		map.put("DantewadaParty2", applicationContext.getBean(DantewadaParty2Repository.class));
		map.put("DhamtariParty2", applicationContext.getBean(DhamtariParty2Repository.class));
		map.put("DurgParty2", applicationContext.getBean(DurgParty2Repository.class));
		map.put("GariyabandParty2", applicationContext.getBean(GariyabandParty2Repository.class));
		map.put("JanjgirChampaParty2", applicationContext.getBean(JanjgirChampaParty2Repository.class));
		map.put("JashpurParty2", applicationContext.getBean(JashpurParty2Repository.class));
		map.put("KankerParty2", applicationContext.getBean(KankerParty2Repository.class));
		map.put("KawardhaParty2", applicationContext.getBean(KawardhaParty2Repository.class));
		map.put("KorbaParty2", applicationContext.getBean(KorbaParty2Repository.class));
		map.put("KoriyaParty2", applicationContext.getBean(KoriyaParty2Repository.class));
		map.put("MahasamundParty2", applicationContext.getBean(MahasamundParty2Repository.class));
		map.put("MungeliParty2", applicationContext.getBean(MungeliParty2Repository.class));
		map.put("RaigarhParty2", applicationContext.getBean(RaigarhParty2Repository.class));
		map.put("RaipurParty2", applicationContext.getBean(RaipurParty2Repository.class));
		map.put("RajnandgaonParty2", applicationContext.getBean(RajnandgaonParty2Repository.class));
		map.put("SargujaParty2", applicationContext.getBean(SargujaParty2Repository.class));

		return map;
	}

}
