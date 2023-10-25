/**
 * 
 */
package com.cg.neel.igrs.district.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.BalodDeedAccessBean;
import com.cg.neel.igrs.district.BalodaBazarDeedAccessBean;
import com.cg.neel.igrs.district.BastarDeedAccessBean;
import com.cg.neel.igrs.district.BemetaraDeedAccessBean;
import com.cg.neel.igrs.district.BilaspurDeedAccessBean;
import com.cg.neel.igrs.district.DantewadaDeedAccessBean;
import com.cg.neel.igrs.district.DhamtariDeedAccessBean;
import com.cg.neel.igrs.district.DurgDeedAccessBean;
import com.cg.neel.igrs.district.GariyabandDeedAccessBean;
import com.cg.neel.igrs.district.JanjgirChampaDeedAccessBean;
import com.cg.neel.igrs.district.JashpurDeedAccessBean;
import com.cg.neel.igrs.district.KankerDeedAccessBean;
import com.cg.neel.igrs.district.KawardhaDeedAccessBean;
import com.cg.neel.igrs.district.KorbaDeedAccessBean;
import com.cg.neel.igrs.district.KoriyaDeedAccessBean;
import com.cg.neel.igrs.district.MahasamundDeedAccessBean;
import com.cg.neel.igrs.district.MungeliDeedAccessBean;
import com.cg.neel.igrs.district.RaigarhDeedAccessBean;
import com.cg.neel.igrs.district.RaipurDeedAccessBean;
import com.cg.neel.igrs.district.RajnandgaonDeedAccessBean;
import com.cg.neel.igrs.district.SargujaDeedAccessBean;
import com.cg.neel.igrs.district.help.BookNoAccessBean;
import com.cg.neel.igrs.district.help.DistrictAccessBean;
import com.cg.neel.igrs.district.help.DocumentTypeAccessBean;
import com.cg.neel.igrs.district.help.RegistrationDistrictAccessBean;
import com.cg.neel.igrs.district.help.RevenueDistrictAccessBean;
import com.cg.neel.igrs.district.help.SRLocationAccessBean;
import com.cg.neel.igrs.district.help.SubDistrictAccessBean;
import com.cg.neel.igrs.district.help.YearAccessBean;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti
 * @des Common Parameter in all deed
 *
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
include=JsonTypeInfo.As.EXISTING_PROPERTY,
property="type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = BalodaBazarDeedAccessBean.class, name = "BalodaBazarDeed"),
	@JsonSubTypes.Type(value = BalodDeedAccessBean.class , name = "BalodDeed"),
	@JsonSubTypes.Type(value = BastarDeedAccessBean.class , name = "BastarDeed"),
	@JsonSubTypes.Type(value = BemetaraDeedAccessBean.class , name = "BemetaraDeed"),
	@JsonSubTypes.Type(value = BilaspurDeedAccessBean.class , name = "BilaspurDeed"),
	@JsonSubTypes.Type(value = DantewadaDeedAccessBean.class , name = "DantewadaDeed"),
	@JsonSubTypes.Type(value = DhamtariDeedAccessBean.class , name = "DhamtariDeed"),
	@JsonSubTypes.Type(value = DurgDeedAccessBean.class , name = "DurgDeed"),
	@JsonSubTypes.Type(value = GariyabandDeedAccessBean.class , name = "GariyabandDeed"),
	@JsonSubTypes.Type(value = JanjgirChampaDeedAccessBean.class , name = "JanjgirChampaDeed"),
	@JsonSubTypes.Type(value = JashpurDeedAccessBean.class , name = "JashpurDeed"),
	@JsonSubTypes.Type(value = KankerDeedAccessBean.class , name = "KankerDeed"),
	@JsonSubTypes.Type(value = KawardhaDeedAccessBean.class , name = "KawardhaDeed"),
	@JsonSubTypes.Type(value = KorbaDeedAccessBean.class , name = "KorbaDeed"),
	@JsonSubTypes.Type(value = KoriyaDeedAccessBean.class , name = "KoriyaDeed"),
	@JsonSubTypes.Type(value = MahasamundDeedAccessBean.class , name = "MahasamundDeed"),
	@JsonSubTypes.Type(value = MungeliDeedAccessBean.class , name = "MungeliDeed"),
	@JsonSubTypes.Type(value = RaigarhDeedAccessBean.class , name = "RaigarhDeed"),
	@JsonSubTypes.Type(value = RaipurDeedAccessBean.class , name = "RaipurDeed"),
	@JsonSubTypes.Type(value = RajnandgaonDeedAccessBean.class , name = "RajnandgaonDeed"),
	@JsonSubTypes.Type(value = SargujaDeedAccessBean.class , name = "SargujaDeed")
})
public abstract class CommonDeedAccessBean {
	
	@Id
	@Column(name="Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name ="FileId")
	private String fileId;
	
	@Column(name = "VolumeNo")
	private String volumeNo;
	
	//Mapping one to one
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno" , name = "BookNo_Sno")
	private BookNoAccessBean bookNoAccessBean;
	
	@Column(name = "DocumentNo")
	private String documentNo;
	
	@Column(name = "PageFrom")
	private String pageFrom;
	
	@Column(name = "PageTo")
	private String pageTo;
	
	@Column(name = "DateOfRegistration")
	private String dateOfRegistration;
	
	//Mapping onetoOne
	@ManyToOne
	@JoinColumn(referencedColumnName = "sno" ,name = "Year_Sno")
	@Fetch(FetchMode.SELECT)
	private YearAccessBean yearAccessBean;
	
	//Mapping onetoOne
	@OneToOne
//	@JoinColumn(referencedColumnName = "sno" ,name = "DocumentType_Sno")
	private DocumentTypeAccessBean documentTypeAccessBean;
	
	//Mapping onetoOne
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno" ,name = "RegistrationDistrict_Sno")
	private RegistrationDistrictAccessBean registrationDistrictAccessBean;
	
	//Mapping onetoOne
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno" ,name = "SRLocation_Sno")
	private SRLocationAccessBean srLocationAccessBean;
	
	//Mapping onetoOne
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno" ,name = "RevenueDistrict_Sno")
	private RevenueDistrictAccessBean revenueDistrictAccessBean;
	
	
	// Mapping onetoOne
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno", name = "District_Sno")
	private DistrictAccessBean districtAccessBean;

	// Mapping onetoOne
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno", name = "SubDistrict_Sno")
	private SubDistrictAccessBean subDistrictAccessBean;

	
	

}
