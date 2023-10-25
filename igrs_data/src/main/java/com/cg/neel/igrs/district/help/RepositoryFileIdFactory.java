/**
 * 
 */
package com.cg.neel.igrs.district.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.neel.igrs.district.fileid.repository.BalodFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.BalodaBazarFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.BastarFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.BemetaraFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.BilaspurFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.DantewadaFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.DhamtariFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.DurgFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.GariyabandFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.JanjgirChampaFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.JashpurFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.KankerFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.KawardhaFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.KorbaFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.KoriyaFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.MahasamundFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.MappedTypeFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.MungeliFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.RaigarhFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.RaipurFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.RajnandgaonFileIdRepository;
import com.cg.neel.igrs.district.fileid.repository.SargujaFileIdRepository;

/**
 * @author User
 *
 */

@Component
public class RepositoryFileIdFactory {

	@Autowired
	private BalodaBazarFileIdRepository balodaBazarFileIdRepository;
	@Autowired
	private BalodFileIdRepository balodFileIdRepository;
	@Autowired
	private BastarFileIdRepository bastarFileIdRepository;
	@Autowired
	private BemetaraFileIdRepository bemetaraFileIdRepository;
	@Autowired
	private BilaspurFileIdRepository bilaspurFileIdRepository;
	@Autowired
	private DantewadaFileIdRepository dantewadaFileIdRepository;
	@Autowired
	private DhamtariFileIdRepository dhamtariFileIdRepository;
	@Autowired
	private DurgFileIdRepository durgFileIdRepository;
	@Autowired
	private GariyabandFileIdRepository gariyabandFileIdRepository;
	@Autowired
	private JanjgirChampaFileIdRepository janjgirChampaFileIdRepository;
	@Autowired
	private JashpurFileIdRepository jashpurFileIdRepository;
	@Autowired
	private KankerFileIdRepository kankerFileIdRepository;
	@Autowired
	private KawardhaFileIdRepository kawardhaFileIdRepository;
	@Autowired
	private KorbaFileIdRepository korbaFileIdRepository;
	@Autowired
	private KoriyaFileIdRepository koriyaFileIdRepository;
	@Autowired
	private MahasamundFileIdRepository mahasamundFileIdRepository;
	@Autowired
	private MungeliFileIdRepository mungeliFileIdRepository;
	@Autowired
	private RaigarhFileIdRepository raigarhFileIdRepository;
	@Autowired
	private RaipurFileIdRepository raipurFileIdRepository;
	@Autowired
	private RajnandgaonFileIdRepository rajnandgaonFileIdRepository;
	@Autowired
	private SargujaFileIdRepository sargujaFileIdRepository;

	public MappedTypeFileIdRepository<?> getFileIdRepository(String type) {
		switch (type) {
		case "BalodaBazarFileIdRepository":
			return balodaBazarFileIdRepository;
		case "BalodabazarFileIdRepository":
			return balodaBazarFileIdRepository;
		case "BalodFileIdRepository":
			return balodFileIdRepository;
		case "BastarFileIdRepository":
			return bastarFileIdRepository;
		case "BemetaraFileIdRepository":
			return bemetaraFileIdRepository;
		case "BilaspurFileIdRepository":
			return bilaspurFileIdRepository;
		case "DantewadaFileIdRepository":
			return dantewadaFileIdRepository;
		case "DhamtariFileIdRepository":
			return dhamtariFileIdRepository;
		case "DurgFileIdRepository":
			return durgFileIdRepository;
		case "GariyabandFileIdRepository":
			return gariyabandFileIdRepository;
		case "JanjgirChampaFileIdRepository":
			return janjgirChampaFileIdRepository;
		case "JashpurFileIdRepository":
			return jashpurFileIdRepository;
		case "KankerFileIdRepository":
			return kankerFileIdRepository;
		case "KawardhaFileIdRepository":
			return kawardhaFileIdRepository;
		case "KorbaFileIdRepository":
			return korbaFileIdRepository;
		case "KoriyaFileIdRepository":
			return koriyaFileIdRepository;
		case "MahasamundFileIdRepository":
			return mahasamundFileIdRepository;
		case "MungeliFileIdRepository":
			return mungeliFileIdRepository;
		case "RaigarhFileIdRepository":
			return raigarhFileIdRepository;
		case "RaipurFileIdRepository":
			return raipurFileIdRepository;
		case "RajnandgaonFileIdRepository":
			return rajnandgaonFileIdRepository;
		case "SargujaFileIdRepository":
			return sargujaFileIdRepository;
		default:
			throw new IllegalArgumentException("Invalid repository type: " + type);
		}
	}


}
