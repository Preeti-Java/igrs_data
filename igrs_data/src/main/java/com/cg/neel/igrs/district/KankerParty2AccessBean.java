package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;

@Entity
@Table(name = "KankerParty2")
public class KankerParty2AccessBean extends CommonParty2DetailsAccessBean{

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
	public static KankerParty2AccessBean of(String fileId, String aadharPan2,
			String partyName2, String partyName2Hindi, String relativeName2, String relativeName2Hindi, PartyType2AccessBean partyType2AccessBean
			) {
		
		KankerParty2AccessBean kankerParty2AccessBean = new KankerParty2AccessBean();
		kankerParty2AccessBean.setFileId(fileId);
		kankerParty2AccessBean.setAadharPan2(aadharPan2);
		kankerParty2AccessBean.setPartyName2(partyName2);
		kankerParty2AccessBean.setPartyName2Hindi(partyName2Hindi);
		kankerParty2AccessBean.setPartyType2AccessBean(partyType2AccessBean);
		kankerParty2AccessBean.setRelativeName2(relativeName2);
		kankerParty2AccessBean.setRelativeName2Hindi(relativeName2Hindi);
		
		return kankerParty2AccessBean;
	}

}
