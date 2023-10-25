package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;

@Entity
@Table(name = "DhamtariParty2")
public class DhamtariParty2AccessBean extends CommonParty2DetailsAccessBean {

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
	public static DhamtariParty2AccessBean of(String fileId, String aadharPan2,
			String partyName2, String partyName2Hindi, String relativeName2, String relativeName2Hindi, PartyType2AccessBean partyType2AccessBean
			) {
		
		DhamtariParty2AccessBean dhamtariParty2AccessBean = new DhamtariParty2AccessBean();
		dhamtariParty2AccessBean.setFileId(fileId);
		dhamtariParty2AccessBean.setAadharPan2(aadharPan2);
		dhamtariParty2AccessBean.setPartyName2(partyName2);
		dhamtariParty2AccessBean.setPartyName2Hindi(partyName2Hindi);
		dhamtariParty2AccessBean.setPartyType2AccessBean(partyType2AccessBean);
		dhamtariParty2AccessBean.setRelativeName2(relativeName2);
		dhamtariParty2AccessBean.setRelativeName2Hindi(relativeName2Hindi);
		
		return dhamtariParty2AccessBean;
	}

}
