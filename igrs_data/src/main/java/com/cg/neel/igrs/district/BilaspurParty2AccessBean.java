package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;

@Entity
@Table(name = "BilaspurParty2")
public class BilaspurParty2AccessBean extends CommonParty2DetailsAccessBean{

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
	public static BilaspurParty2AccessBean of(String fileId, String aadharPan2,
			String partyName2, String partyName2Hindi, String relativeName2, String relativeName2Hindi, PartyType2AccessBean partyType2AccessBean
			) {
		
		BilaspurParty2AccessBean bilaspurParty2AccessBean = new BilaspurParty2AccessBean();
		bilaspurParty2AccessBean.setFileId(fileId);
		bilaspurParty2AccessBean.setAadharPan2(aadharPan2);
		bilaspurParty2AccessBean.setPartyName2(partyName2);
		bilaspurParty2AccessBean.setPartyName2Hindi(partyName2Hindi);
		bilaspurParty2AccessBean.setPartyType2AccessBean(partyType2AccessBean);
		bilaspurParty2AccessBean.setRelativeName2(relativeName2);
		bilaspurParty2AccessBean.setRelativeName2Hindi(relativeName2Hindi);
		
		return bilaspurParty2AccessBean;
	}

}
