package com.cg.neel.igrs.district.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.cg.neel.igrs.district.BalodParty2AccessBean;
import com.cg.neel.igrs.district.BalodaBazarParty2AccessBean;
import com.cg.neel.igrs.district.BastarParty2AccessBean;
import com.cg.neel.igrs.district.BemetaraParty2AccessBean;
import com.cg.neel.igrs.district.BilaspurParty2AccessBean;
import com.cg.neel.igrs.district.DantewadaParty2AccessBean;
import com.cg.neel.igrs.district.DhamtariParty2AccessBean;
import com.cg.neel.igrs.district.DurgParty2AccessBean;
import com.cg.neel.igrs.district.GariyabandParty2AccessBean;
import com.cg.neel.igrs.district.JanjgirChampaParty2AccessBean;
import com.cg.neel.igrs.district.JashpurParty2AccessBean;
import com.cg.neel.igrs.district.KankerParty2AccessBean;
import com.cg.neel.igrs.district.KawardhaParty2AccessBean;
import com.cg.neel.igrs.district.KorbaParty2AccessBean;
import com.cg.neel.igrs.district.KoriyaParty2AccessBean;
import com.cg.neel.igrs.district.MahasamundParty2AccessBean;
import com.cg.neel.igrs.district.MungeliParty2AccessBean;
import com.cg.neel.igrs.district.RaigarhParty2AccessBean;
import com.cg.neel.igrs.district.RaipurParty2AccessBean;
import com.cg.neel.igrs.district.RajnandgaonParty2AccessBean;
import com.cg.neel.igrs.district.SargujaParty2AccessBean;
import com.cg.neel.igrs.district.help.PartyType2AccessBean;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
include=JsonTypeInfo.As.EXISTING_PROPERTY,
property="type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = BalodaBazarParty2AccessBean.class, name = "BalodaBazarParty2"),
	@JsonSubTypes.Type(value = BalodParty2AccessBean.class , name = "BalodParty2"),
	@JsonSubTypes.Type(value = BastarParty2AccessBean.class , name = "BastarParty2"),
	@JsonSubTypes.Type(value = BemetaraParty2AccessBean.class , name = "BemetaraParty2"),
	@JsonSubTypes.Type(value = BilaspurParty2AccessBean.class , name = "BilaspurParty2"),
	@JsonSubTypes.Type(value = DantewadaParty2AccessBean.class , name = "DantewadaParty2"),
	@JsonSubTypes.Type(value = DhamtariParty2AccessBean.class , name = "DhamtariParty2"),
	@JsonSubTypes.Type(value = DurgParty2AccessBean.class , name = "DurgParty2"),
	@JsonSubTypes.Type(value = GariyabandParty2AccessBean.class , name = "GariyabandParty2"),
	@JsonSubTypes.Type(value = JanjgirChampaParty2AccessBean.class , name = "JanjgirChampaParty2"),
	@JsonSubTypes.Type(value = JashpurParty2AccessBean.class , name = "JashpurParty2"),
	@JsonSubTypes.Type(value = KankerParty2AccessBean.class , name = "KankerParty2"),
	@JsonSubTypes.Type(value = KawardhaParty2AccessBean.class , name = "KawardhaParty2"),
	@JsonSubTypes.Type(value = KorbaParty2AccessBean.class , name = "KorbaParty2"),
	@JsonSubTypes.Type(value = KoriyaParty2AccessBean.class , name = "KoriyaParty2"),
	@JsonSubTypes.Type(value = MahasamundParty2AccessBean.class , name = "MahasamundParty2"),
	@JsonSubTypes.Type(value = MungeliParty2AccessBean.class , name = "MungeliParty2"),
	@JsonSubTypes.Type(value = RaigarhParty2AccessBean.class , name = "RaigarhParty2"),
	@JsonSubTypes.Type(value = RaipurParty2AccessBean.class , name = "RaipurParty2"),
	@JsonSubTypes.Type(value = RajnandgaonParty2AccessBean.class , name = "RajnandgaonParty2"),
	@JsonSubTypes.Type(value = SargujaParty2AccessBean.class , name = "SargujaParty2")
})
public abstract  class CommonParty2DetailsAccessBean {
	
	

	@Id  
	@Column(name="Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name = "FileId")
	private String fileId;

	
	//Mapping one to one
	@OneToOne
	@PrimaryKeyJoinColumn
	private PartyType2AccessBean partyType2AccessBean;
	
	@Column(name = "PartyName2")
	private String partyName2;
	
	@Column(name = "PartyName2Hindi")
	private String partyName2Hindi;

    @Column(name = "RelativeName2")
	private String relativeName2;
	
	@Column(name = "RelativeName2Hindi")
	private String relativeName2Hindi;	
	
	@Column(name = "AadharPan2")
	private String aadharPan2;

	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public PartyType2AccessBean getPartyType2AccessBean() {
		return partyType2AccessBean;
	}

	public void setPartyType2AccessBean(PartyType2AccessBean partyType2AccessBean) {
		this.partyType2AccessBean = partyType2AccessBean;
	}

	public String getPartyName2() {
		return partyName2;
	}

	public void setPartyName2(String partyName2) {
		this.partyName2 = partyName2;
	}

	public String getPartyName2Hindi() {
		return partyName2Hindi;
	}

	public void setPartyName2Hindi(String partyName2Hindi) {
		this.partyName2Hindi = partyName2Hindi;
	}

	public String getRelativeName2() {
		return relativeName2;
	}

	public void setRelativeName2(String relativeName2) {
		this.relativeName2 = relativeName2;
	}

	public String getRelativeName2Hindi() {
		return relativeName2Hindi;
	}

	public void setRelativeName2Hindi(String relativeName2Hindi) {
		this.relativeName2Hindi = relativeName2Hindi;
	}

	public String getAadharPan2() {
		return aadharPan2;
	}

	public void setAadharPan2(String aadharPan2) {
		this.aadharPan2 = aadharPan2;
	}

	
	
}
