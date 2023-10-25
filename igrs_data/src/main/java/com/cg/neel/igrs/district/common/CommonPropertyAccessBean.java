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

import com.cg.neel.igrs.district.BalodPropertyAccessBean;
import com.cg.neel.igrs.district.BalodaBazarPropertyAccessBean;
import com.cg.neel.igrs.district.BastarPropertyAccessBean;
import com.cg.neel.igrs.district.BemetaraPropertyAccessBean;
import com.cg.neel.igrs.district.BilaspurPropertyAccessBean;
import com.cg.neel.igrs.district.DantewadaPropertyAccessBean;
import com.cg.neel.igrs.district.DhamtariPropertyAccessBean;
import com.cg.neel.igrs.district.DurgPropertyAccessBean;
import com.cg.neel.igrs.district.GariyabandPropertyAccessBean;
import com.cg.neel.igrs.district.JanjgirChampaPropertyAccessBean;
import com.cg.neel.igrs.district.JashpurPropertyAccessBean;
import com.cg.neel.igrs.district.KankerPropertyAccessBean;
import com.cg.neel.igrs.district.KawardhaPropertyAccessBean;
import com.cg.neel.igrs.district.KorbaPropertyAccessBean;
import com.cg.neel.igrs.district.KoriyaPropertyAccessBean;
import com.cg.neel.igrs.district.MahasamundPropertyAccessBean;
import com.cg.neel.igrs.district.MungeliPropertyAccessBean;
import com.cg.neel.igrs.district.RaigarhPropertyAccessBean;
import com.cg.neel.igrs.district.RaipurPropertyAccessBean;
import com.cg.neel.igrs.district.RajnandgaonPropertyAccessBean;
import com.cg.neel.igrs.district.SargujaPropertyAccessBean;
import com.cg.neel.igrs.district.help.TehsilAccessBean;
import com.cg.neel.igrs.district.help.VillageAccessBean;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti
 * @des Common Parameter of property in all deed
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
	@JsonSubTypes.Type(value = BalodaBazarPropertyAccessBean.class, name = "BalodaBazarProperty"),
	@JsonSubTypes.Type(value = BalodPropertyAccessBean.class , name = "BalodProperty"),
	@JsonSubTypes.Type(value = BastarPropertyAccessBean.class , name = "BastarProperty"),
	@JsonSubTypes.Type(value = BemetaraPropertyAccessBean.class , name = "BemetaraProperty"),
	@JsonSubTypes.Type(value = BilaspurPropertyAccessBean.class , name = "BilaspurProperty"),
	@JsonSubTypes.Type(value = DantewadaPropertyAccessBean.class , name = "DantewadaProperty"),
	@JsonSubTypes.Type(value = DhamtariPropertyAccessBean.class , name = "DhamtariProperty"),
	@JsonSubTypes.Type(value = DurgPropertyAccessBean.class , name = "DurgProperty"),
	@JsonSubTypes.Type(value = GariyabandPropertyAccessBean.class , name = "GariyabandProperty"),
	@JsonSubTypes.Type(value = JanjgirChampaPropertyAccessBean.class , name = "JanjgirChampaProperty"),
	@JsonSubTypes.Type(value = JashpurPropertyAccessBean.class , name = "JashpurProperty"),
	@JsonSubTypes.Type(value = KankerPropertyAccessBean.class , name = "KankerProperty"),
	@JsonSubTypes.Type(value = KawardhaPropertyAccessBean.class , name = "KawardhaProperty"),
	@JsonSubTypes.Type(value = KorbaPropertyAccessBean.class , name = "KorbaProperty"),
	@JsonSubTypes.Type(value = KoriyaPropertyAccessBean.class , name = "KoriyaProperty"),
	@JsonSubTypes.Type(value = MahasamundPropertyAccessBean.class , name = "MahasamundProperty"),
	@JsonSubTypes.Type(value = MungeliPropertyAccessBean.class , name = "MungeliProperty"),
	@JsonSubTypes.Type(value = RaigarhPropertyAccessBean.class , name = "RaigarhProperty"),
	@JsonSubTypes.Type(value = RaipurPropertyAccessBean.class , name = "RaipurProperty"),
	@JsonSubTypes.Type(value = RajnandgaonPropertyAccessBean.class , name = "RajnandgaonProperty"),
	@JsonSubTypes.Type(value = SargujaPropertyAccessBean.class , name = "SargujaProperty")
})
public abstract class CommonPropertyAccessBean {
	
	@Id
	@Column(name="Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name = "FileId")
	private String fileId;

	
	//Mapping one to one
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno" ,name =  "Tehsil_Sno")
	private TehsilAccessBean tehsilAccessBean;
	
	//Mapping one to one
	@OneToOne
	//@JoinColumn(referencedColumnName = "sno" ,name =  "Village_Sno")
	private VillageAccessBean villageAccessBean;
	
	@Column(name = "WardHalkaNo")
	private String wardHalkNo;
	
	@Column(name = "HousePlotFlatNo")
	private String housePlotFlatNo;
	
	@Column(name = "Khasra")
	private String khasra;
	

}
