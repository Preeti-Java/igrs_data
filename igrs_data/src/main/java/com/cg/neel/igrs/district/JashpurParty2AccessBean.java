package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;

@Entity
@Table(name = "JashpurParty2")
public class JashpurParty2AccessBean extends CommonParty2DetailsAccessBean{

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
	public static JashpurParty2AccessBean of(String fileId, String aadharPan2,
			String partyName2, String partyName2Hindi, String relativeName2, String relativeName2Hindi, PartyType2AccessBean partyType2AccessBean
			) {
		
		JashpurParty2AccessBean jashpurParty2AccessBean = new JashpurParty2AccessBean();
		jashpurParty2AccessBean.setFileId(fileId);
		jashpurParty2AccessBean.setAadharPan2(aadharPan2);
		jashpurParty2AccessBean.setPartyName2(partyName2);
		jashpurParty2AccessBean.setPartyName2Hindi(partyName2Hindi);
		jashpurParty2AccessBean.setPartyType2AccessBean(partyType2AccessBean);
		jashpurParty2AccessBean.setRelativeName2(relativeName2);
		jashpurParty2AccessBean.setRelativeName2Hindi(relativeName2Hindi);
		
		return jashpurParty2AccessBean;
	}

}
