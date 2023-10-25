package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;

@Entity
@Table(name = "JanjgirChampaParty2")
public class JanjgirChampaParty2AccessBean extends CommonParty2DetailsAccessBean {

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
	public static JanjgirChampaParty2AccessBean of(String fileId, String aadharPan2,
			String partyName2, String partyName2Hindi, String relativeName2, String relativeName2Hindi, PartyType2AccessBean partyType2AccessBean
			) {
		
		JanjgirChampaParty2AccessBean janjgirChampaParty2AccessBean = new JanjgirChampaParty2AccessBean();
		janjgirChampaParty2AccessBean.setFileId(fileId);
		janjgirChampaParty2AccessBean.setAadharPan2(aadharPan2);
		janjgirChampaParty2AccessBean.setPartyName2(partyName2);
		janjgirChampaParty2AccessBean.setPartyName2Hindi(partyName2Hindi);
		janjgirChampaParty2AccessBean.setPartyType2AccessBean(partyType2AccessBean);
		janjgirChampaParty2AccessBean.setRelativeName2(relativeName2);
		janjgirChampaParty2AccessBean.setRelativeName2Hindi(relativeName2Hindi);
		
		return janjgirChampaParty2AccessBean;
	}

}
