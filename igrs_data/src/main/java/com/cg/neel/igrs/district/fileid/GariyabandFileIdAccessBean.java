package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.GariyabandDeedAccessBean;
import com.cg.neel.igrs.district.GariyabandParty1AccessBean;
import com.cg.neel.igrs.district.GariyabandParty2AccessBean;
import com.cg.neel.igrs.district.GariyabandPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Gariyaband_FileId")
public class GariyabandFileIdAccessBean extends CommonFileIdAccessBean {
	
	@OneToOne
	@JoinColumn(name="Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private GariyabandDeedAccessBean GariyabandDeedAccessBean;
	
	@OneToOne
	@JoinColumn(name="Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private GariyabandParty1AccessBean GariyabandParty1AccessBean;
	
	@OneToOne
	@JoinColumn(name="Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private GariyabandParty2AccessBean GariyabandParty2AccessBean;
	
	@OneToOne
	@JoinColumn(name="Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private GariyabandPropertyAccessBean GariyabandPropertyAccessBean;
	
	
	

}
