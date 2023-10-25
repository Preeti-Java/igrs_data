/**
 * 
 */
package com.cg.neel.igrs.district.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

/**
 * @author User
 *
 */

@Component
public class RepositoryFactory {

	@Autowired
	private BalodaBazarDeedRepository balodaBazarDeedRepository;
	@Autowired
	private BalodaBazarParty1Repository balodaBazarParty1Repository;
	@Autowired
	private BalodaBazarParty2Repository balodaBazarParty2Repository;

	@Autowired
	private BalodaBazarPropertyRepository balodaBazarPropertyRepository;
	@Autowired
	private BalodDeedRepository balodDeedRepository;
	@Autowired
	private BalodParty1Repository balodParty1Repository;
	@Autowired
	private BalodParty2Repository balodParty2Repository;

	@Autowired
	private BalodPropertyRepository balodPropertyRepository;
	@Autowired
	private BastarDeedRepository bastarDeedRepository;
	@Autowired
	private BastarParty1Repository bastarParty1Repository;
	@Autowired
	private BastarParty2Repository bastarParty2Repository;
	@Autowired
	private BastarPropertyRepository bastarPropertyRepository;
	@Autowired
	private BemetaraDeedRepository bemetaraDeedRepository;
	@Autowired
	private BemetaraParty1Repository bemetaraParty1Repository;
	@Autowired
	private BemetaraParty2Repository bemetaraParty2Repository;
	@Autowired
	private BemetaraPropertyRepository bemetaraPropertyRepository;
	@Autowired
	private BilaspurDeedRepository bilaspurDeedRepository;
	@Autowired
	private BilaspurParty1Repository bilaspurParty1Repository;
	@Autowired
	private BilaspurParty2Repository bilaspurParty2Repository;
	@Autowired
	private BilaspurPropertyRepository bilaspurPropertyRepository;
	@Autowired
	private DantewadaDeedRepository dantewadaDeedRepository;
	@Autowired
	private DantewadaParty1Repository dantewadaParty1Repository;
	@Autowired
	private DantewadaParty2Repository dantewadaParty2Repository;
	@Autowired
	private DantewadaPropertyRepository dantewadaPropertyRepository;
	@Autowired
	private DhamtariDeedRepository dhamtariDeedRepository;
	@Autowired
	private DhamtariParty1Repository dhamtariParty1Repository;
	@Autowired
	private DhamtariParty2Repository dhamtariParty2Repository;
	@Autowired
	private DhamtariPropertyRepository dhamtariPropertyRepository;
	@Autowired
	private DurgDeedRepository durgDeedRepository;
	@Autowired
	private DurgParty1Repository durgParty1Repository;
	@Autowired
	private DurgParty2Repository durgParty2Repository;
	@Autowired
	private DurgPropertyRepository durgPropertyRepository;
	@Autowired
	private GariyabandDeedRepository gariyabandDeedRepository;
	@Autowired
	private GariyabandParty1Repository gariyabandParty1Repository;
	@Autowired
	private GariyabandParty2Repository gariyabandParty2Repository;
	@Autowired
	private GariyabandPropertyRepository gariyabandPropertyRepository;
	@Autowired
	private JanjgirChampaDeedRepository janjgirChampaDeedRepository;
	@Autowired
	private JanjgirChampaParty1Repository janjgirChampaParty1Repository;
	@Autowired
	private JanjgirChampaParty2Repository janjgirChampaParty2Repository;
	@Autowired
	private JanjgirChampaPropertyRepository janjgirChampaPropertyRepository;
	@Autowired
	private JashpurDeedRepository jashpurDeedRepository;
	@Autowired
	private JashpurParty1Repository jashpurParty1Repository;
	@Autowired
	private JashpurParty2Repository jashpurParty2Repository;
	@Autowired
	private JashpurPropertyRepository jashpurPropertyRepository;
	@Autowired
	private KankerDeedRepository kankerDeedRepository;
	@Autowired
	private KankerParty1Repository kankerParty1Repository;
	@Autowired
	private KankerParty2Repository kankerParty2Repository;
	@Autowired
	private KankerPropertyRepository kankerPropertyRepository;
	@Autowired
	private KawardhaDeedRepository kawardhaDeedRepository;
	@Autowired
	private KawardhaParty1Repository kawardhaParty1Repository;
	@Autowired
	private KawardhaParty2Repository kawardhaParty2Repository;
	@Autowired
	private KawardhaPropertyRepository kawardhaPropertyRepository;
	@Autowired
	private KorbaDeedRepository korbaDeedRepository;
	@Autowired
	private KorbaParty1Repository korbaParty1Repository;
	@Autowired
	private KorbaParty2Repository korbaParty2Repository;
	@Autowired
	private KorbaPropertyRepository korbaPropertyRepository;
	@Autowired
	private KoriyaDeedRepository koriyaDeedRepository;
	@Autowired
	private KoriyaParty1Repository koriyaParty1Repository;
	@Autowired
	private KoriyaParty2Repository koriyaParty2Repository;
	@Autowired
	private KoriyaPropertyRepository koriyaPropertyRepository;
	@Autowired
	private MahasamundDeedRepository mahasamundDeedRepository;
	@Autowired
	private MahasamundParty1Repository mahasamundParty1Repository;
	@Autowired
	private MahasamundParty2Repository mahasamundParty2Repository;
	@Autowired
	private MahasamundPropertyRepository mahasamundPropertyRepository;
	@Autowired
	private MungeliDeedRepository mungeliDeedRepository;
	@Autowired
	private MungeliParty1Repository mungeliParty1Repository;
	@Autowired
	private MungeliParty2Repository mungeliParty2Repository;
	@Autowired
	private MungeliPropertyRepository mungeliPropertyRepository;
	@Autowired
	private RaigarhDeedRepository raigarhDeedRepository;
	@Autowired
	private RaigarhParty1Repository raigarhParty1Repository;
	@Autowired
	private RaigarhParty2Repository raigarhParty2Repository;
	@Autowired
	private RaigarhPropertyRepository raigarhPropertyRepository;
	@Autowired
	private RaipurDeedRepository raipurDeedRepository;
	@Autowired
	private RaipurParty1Repository raipurParty1Repository;
	@Autowired
	private RaipurParty2Repository raipurParty2Repository;
	@Autowired
	private RaipurPropertyRepository raipurPropertyRepository;
	@Autowired
	private RajnandgaonDeedRepository rajnandgaonDeedRepository;
	@Autowired
	private RajnandgaonParty1Repository rajnandgaonParty1Repository;
	@Autowired
	private RajnandgaonParty2Repository rajnandgaonParty2Repository;
	@Autowired
	private RajnandgaonPropertyRepository rajnandgaonPropertyRepository;
	@Autowired
	private SargujaDeedRepository sargujaDeedRepository;
	@Autowired
	private SargujaParty1Repository sargujaParty1Repository;
	@Autowired
	private SargujaParty2Repository sargujaParty2Repository;
	@Autowired
	private SargujaPropertyRepository sargujaPropertyRepository;

	public MappedTypeDeedRepository<?> getDeedRepository(String type) {
		switch (type) {
		case "BalodaBazarDeedRepository":
			return balodaBazarDeedRepository;
		case "BalodDeedRepository":
			return balodDeedRepository;
		case "BastarDeedRepository":
			return bastarDeedRepository;
		case "BemetaraDeedRepository":
			return bemetaraDeedRepository;
		case "BilaspurDeedRepository":
			return bilaspurDeedRepository;
		case "DantewadaDeedRepository":
			return dantewadaDeedRepository;
		case "DhamtariDeedRepository":
			return dhamtariDeedRepository;
		case "DurgDeedRepository":
			return durgDeedRepository;
		case "GariyabandDeedRepository":
			return gariyabandDeedRepository;
		case "JanjgirChampaDeedRepository":
			return janjgirChampaDeedRepository;
		case "JashpurDeedRepository":
			return jashpurDeedRepository;
		case "KankerDeedRepository":
			return kankerDeedRepository;
		case "KawardhaDeedRepository":
			return kawardhaDeedRepository;
		case "KorbaDeedRepository":
			return korbaDeedRepository;
		case "KoriyaDeedRepository":
			return koriyaDeedRepository;
		case "MahasamundDeedRepository":
			return mahasamundDeedRepository;
		case "MungeliDeedRepository":
			return mungeliDeedRepository;
		case "RaigarhDeedRepository":
			return raigarhDeedRepository;
		case "RaipurDeedRepository":
			return raipurDeedRepository;
		case "RajnandgaonDeedRepository":
			return rajnandgaonDeedRepository;
		case "SargujaDeedRepository":
			return sargujaDeedRepository;
		default:
			throw new IllegalArgumentException("Invalid repository type: " + type);
		}
	}

	public MappedTypeParty1Repository<?> getParty1Repository(String type) {
		switch (type) {
		case "BalodaBazarParty1Repository":
			return balodaBazarParty1Repository;
		case "BalodParty1Repository":
			return balodParty1Repository;
		case "BastarParty1Repository":
			return bastarParty1Repository;
		case "BemetaraParty1Repository":
			return bemetaraParty1Repository;
		case "BilaspurParty1Repository":
			return bilaspurParty1Repository;
		case "DantewadaParty1Repository":
			return dantewadaParty1Repository;
		case "DhamtariParty1Repository":
			return dhamtariParty1Repository;
		case "DurgParty1Repository":
			return durgParty1Repository;
		case "GariyabandParty1Repository":
			return gariyabandParty1Repository;
		case "JanjgirChampaParty1Repository":
			return janjgirChampaParty1Repository;
		case "JashpurParty1Repository":
			return jashpurParty1Repository;
		case "KankerParty1Repository":
			return kankerParty1Repository;
		case "KawardhaParty1Repository":
			return kawardhaParty1Repository;
		case "KorbaParty1Repository":
			return korbaParty1Repository;
		case "KoriyaParty1Repository":
			return koriyaParty1Repository;
		case "MahasamundParty1Repository":
			return mahasamundParty1Repository;
		case "MungeliParty1Repository":
			return mungeliParty1Repository;
		case "RaigarhParty1Repository":
			return raigarhParty1Repository;
		case "RaipurParty1Repository":
			return raipurParty1Repository;
		case "RajnandgaonParty1Repository":
			return rajnandgaonParty1Repository;
		case "SargujaParty1Repository":
			return sargujaParty1Repository;
		default:
			throw new IllegalArgumentException("Invalid repository type: " + type);
		}
	}

	public MappedTypeParty2Repository<?> getParty2Repository(String type) {
		switch (type) {
		case "BalodaBazarParty2Repository":
			return balodaBazarParty2Repository;
		case "BalodParty2Repository":
			return balodParty2Repository;
		case "BastarParty2Repository":
			return bastarParty2Repository;
		case "BemetaraParty2Repository":
			return bemetaraParty2Repository;
		case "BilaspurParty2Repository":
			return bilaspurParty2Repository;
		case "DantewadaParty2Repository":
			return dantewadaParty2Repository;
		case "DhamtariParty2Repository":
			return dhamtariParty2Repository;
		case "GariyabandParty2Repository":
			return gariyabandParty2Repository;
		case "JanjgirChampaParty2Repository":
			return janjgirChampaParty2Repository;
		case "JashpurParty2Repository":
			return jashpurParty2Repository;
		case "KankerParty2Repository":
			return kankerParty2Repository;
		case "KawardhaParty2Repository":
			return kawardhaParty2Repository;
		case "KorbaParty2Repository":
			return korbaParty2Repository;
		case "KoriyaParty2Repository":
			return koriyaParty2Repository;
		case "MahasamundParty2Repository":
			return mahasamundParty2Repository;
		case "MungeliParty2Repository":
			return mungeliParty2Repository;
		case "RaigarhParty2Repository":
			return raigarhParty2Repository;
		case "RaipurParty2Repository":
			return raipurParty2Repository;
		case "RajnandgaonParty2Repository":
			return rajnandgaonParty2Repository;
		case "SargujaParty2Repository":
			return sargujaParty2Repository;
		case "DurgParty2Repository":
			return durgParty2Repository;
		default:
			throw new IllegalArgumentException("Invalid repository type: " + type);
		}
	}

	public MappedTypePropertyRepository<?> getPropertyRepository(String type) {
		switch (type) {

		case "BalodaBazarPropertyRepository":
			return balodaBazarPropertyRepository;
		case "BalodPropertyRepository":
			return balodPropertyRepository;
		case "BastarPropertyRepository":
			return bastarPropertyRepository;
		case "BemetaraPropertyRepository":
			return bemetaraPropertyRepository;
		case "BilaspurPropertyRepository":
			return bilaspurPropertyRepository;
		case "DantewadaPropertyRepository":
			return dantewadaPropertyRepository;
		case "DhamtariPropertyRepository":
			return dhamtariPropertyRepository;
		case "DurgPropertyRepository":
			return durgPropertyRepository;
		case "GariyabandPropertyRepository":
			return gariyabandPropertyRepository;
		case "JanjgirChampaPropertyRepository":
			return janjgirChampaPropertyRepository;
		case "JashpurPropertyRepository":
			return jashpurPropertyRepository;
		case "KankerPropertyRepository":
			return kankerPropertyRepository;
		case "KawardhaPropertyRepository":
			return kawardhaPropertyRepository;
		case "KorbaPropertyRepository":
			return korbaPropertyRepository;
		case "KoriyaPropertyRepository":
			return koriyaPropertyRepository;
		case "MahasamundPropertyRepository":
			return mahasamundPropertyRepository;
		case "MungeliPropertyRepository":
			return mungeliPropertyRepository;
		case "RaigarhPropertyRepository":
			return raigarhPropertyRepository;
		case "RaipurPropertyRepository":
			return raipurPropertyRepository;
		case "RajnandgaonPropertyRepository":
			return rajnandgaonPropertyRepository;
		case "SargujaPropertyRepository":
			return sargujaPropertyRepository;
		default:
			throw new IllegalArgumentException("Invalid repository type: " + type);
		}
	}

}
