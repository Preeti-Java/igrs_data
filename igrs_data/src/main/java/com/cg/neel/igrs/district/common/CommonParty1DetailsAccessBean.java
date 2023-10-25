/**
 * 
 */
package com.cg.neel.igrs.district.common;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.cg.neel.igrs.district.help.PartyType1AccessBean;

import lombok.NoArgsConstructor;




/**
 * @author Preeti
 * @des Common Parameter of party details in all deed
 *
 */
@MappedSuperclass
@NoArgsConstructor
public abstract class CommonParty1DetailsAccessBean {
	
	@Id
	@Column(name="Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name = "FileId")
	private String fileId;

	
	//Mapping one to one
	@OneToOne
	@PrimaryKeyJoinColumn
	private PartyType1AccessBean partyType1AccessBean;
	
	@Column(name = "PartyName1")
	private String partyName1;
	
	@Column(name = "PartyName1Hindi")
	private String partyName1Hindi;
	

	@Column(name = "RelativeName1")
	private String relativeName1;
	
	@Column(name = "RelativeName1Hindi")
	private String relativeName1Hindi;
	
	
	@Column(name = "AadharPan1")
	private String aadharPan1;
	
	
	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public PartyType1AccessBean getPartyType1AccessBean() {
		return partyType1AccessBean;
	}

	public void setPartyType1AccessBean(PartyType1AccessBean partyType1AccessBean) {
		this.partyType1AccessBean = partyType1AccessBean;
	}

	public String getPartyName1() {
		return partyName1;
	}

	public void setPartyName1(String partyName1) {
		this.partyName1 = partyName1;
	}

	public String getPartyName1Hindi() {
		return partyName1Hindi;
	}

	public void setPartyName1Hindi(String partyName1Hindi) {
		this.partyName1Hindi = partyName1Hindi;
	}

	
	public String getRelativeName1() {
		return relativeName1;
	}

	public void setRelativeName1(String relativeName1) {
		this.relativeName1 = relativeName1;
	}

	public String getRelativeName1Hindi() {
		return relativeName1Hindi;
	}

	public void setRelativeName1Hindi(String relativeName1Hindi) {
		this.relativeName1Hindi = relativeName1Hindi;
	}

	public String getAadharPan1() {
		return aadharPan1;
	}

	public void setAadharPan1(String aadharPan1) {
		this.aadharPan1 = aadharPan1;
	}

	/**
	 * @param sno
	 * @param fileId
	 * @param partyType1AccessBean
	 * @param partyName1
	 * @param partyName1Hindi
	 * @param relativeName1
	 * @param relativeName1Hindi
	 * @param aadharPan1
	 */
	public CommonParty1DetailsAccessBean(Long sno, String fileId, PartyType1AccessBean partyType1AccessBean,
			String partyName1, String partyName1Hindi, String relativeName1, String relativeName1Hindi,
			String aadharPan1) {
		super();
		this.sno = sno;
		this.fileId = fileId;
		this.partyType1AccessBean = partyType1AccessBean;
		this.partyName1 = partyName1;
		this.partyName1Hindi = partyName1Hindi;
		this.relativeName1 = relativeName1;
		this.relativeName1Hindi = relativeName1Hindi;
		this.aadharPan1 = aadharPan1;
	}

	

}
