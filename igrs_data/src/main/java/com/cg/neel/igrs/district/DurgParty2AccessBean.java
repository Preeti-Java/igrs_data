package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;

@Entity
@Table(name = "DurgParty2")
public class DurgParty2AccessBean extends CommonParty2DetailsAccessBean{

	/**
	 * @param sno
	 * @param fileId
	 * @param aadharPan2
	 * @param partyName2
	 * @param partyName2Hindi
	 * @param relativeName2
	 * @param relativeName2Hindi
	 * @param partyType2AccessBean
	 */
	public static DurgParty2AccessBean of(String fileId, String aadharPan2,
			String partyName2, String partyName2Hindi, String relativeName2, String relativeName2Hindi, PartyType2AccessBean partyType2AccessBean
			) {
		
		DurgParty2AccessBean durgParty2AccessBean = new DurgParty2AccessBean();
		durgParty2AccessBean.setFileId(fileId);
		durgParty2AccessBean.setAadharPan2(aadharPan2);
		durgParty2AccessBean.setPartyName2(partyName2);
		durgParty2AccessBean.setPartyName2Hindi(partyName2Hindi);
		durgParty2AccessBean.setPartyType2AccessBean(partyType2AccessBean);
		durgParty2AccessBean.setRelativeName2(relativeName2);
		durgParty2AccessBean.setRelativeName2Hindi(relativeName2Hindi);
		
		return durgParty2AccessBean;
	}

}