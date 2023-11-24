/**
 * 
 */
package com.cg.neel.igrs.district.common;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.cg.neel.igrs.district.fileid.BalodFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.BalodaBazarFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.BastarFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.BemetaraFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.BilaspurFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.DantewadaFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.DhamtariFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.DurgFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.GariyabandFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.JanjgirChampaFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.JashpurFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.KankerFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.KawardhaFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.KorbaFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.KoriyaFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.MahasamundFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.MungeliFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.RaigarhFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.RaipurFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.RajnandgaonFileIdAccessBean;
import com.cg.neel.igrs.district.fileid.SargujaFileIdAccessBean;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti
 * @des Common Parameter in all File-id
 *
 */
@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,
include=JsonTypeInfo.As.EXISTING_PROPERTY,
property="type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = BalodFileIdAccessBean.class , name = "BalodFileId"),
	@JsonSubTypes.Type(value = BalodaBazarFileIdAccessBean.class, name = "BalodaBazarFileId"),
	@JsonSubTypes.Type(value = BastarFileIdAccessBean.class , name = "BastarFileId"),
	@JsonSubTypes.Type(value = BemetaraFileIdAccessBean.class , name = "BemetaraFileId"),
	@JsonSubTypes.Type(value = BilaspurFileIdAccessBean.class , name = "BilaspurFileId"),
	@JsonSubTypes.Type(value = DantewadaFileIdAccessBean.class , name = "DantewadaFileId"),
	@JsonSubTypes.Type(value = DhamtariFileIdAccessBean.class , name = "DhamtariFileId"),
	@JsonSubTypes.Type(value = DurgFileIdAccessBean.class , name = "DurgFileId"),
	@JsonSubTypes.Type(value = GariyabandFileIdAccessBean.class , name = "GariyabandFileId"),
	@JsonSubTypes.Type(value = JanjgirChampaFileIdAccessBean.class , name = "JanjgirChampaFileId"),
	@JsonSubTypes.Type(value = JashpurFileIdAccessBean.class , name = "JashpurFileId"),
	@JsonSubTypes.Type(value = KankerFileIdAccessBean.class , name = "KankerFileId"),
	@JsonSubTypes.Type(value = KawardhaFileIdAccessBean.class , name = "KawardhaFileId"),
	@JsonSubTypes.Type(value = KorbaFileIdAccessBean.class , name = "KorbaFileId"),
	@JsonSubTypes.Type(value = KoriyaFileIdAccessBean.class , name = "KoriyaFileId"),
	@JsonSubTypes.Type(value = MahasamundFileIdAccessBean.class , name = "MahasamundFileId"),
	@JsonSubTypes.Type(value = MungeliFileIdAccessBean.class , name = "MungeliFileId"),
	@JsonSubTypes.Type(value = RaigarhFileIdAccessBean.class , name = "RaigarhFileId"),
	@JsonSubTypes.Type(value = RaipurFileIdAccessBean.class , name = "RaipurFileId"),
	@JsonSubTypes.Type(value = RajnandgaonFileIdAccessBean.class , name = "RajnandgaonFileId"),
	@JsonSubTypes.Type(value = SargujaFileIdAccessBean.class , name = "SargujaFileId")
})
public abstract class CommonFileIdAccessBean {
	
	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name="fileId")
    private String fileId;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "totalPage")
	private String totalPage;

}
