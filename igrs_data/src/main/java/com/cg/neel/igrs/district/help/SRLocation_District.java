package com.cg.neel.igrs.district.help;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SrLocation_District")
public class SRLocation_District {
	
	
	@Id
	@JoinColumn(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@ManyToOne
	@JoinColumn(name="District_Sno")
	private DistrictAccessBean districtAccessBean;
	
	
	@ManyToOne
	@JoinColumn(name="SrLocation_Sno")
	private SRLocationAccessBean srLocationAccessBean;


	public Long getSno() {
		return sno;
	}


	public void setSno(Long sno) {
		this.sno = sno;
	}


	public DistrictAccessBean getDistrictAccessBean() {
		return districtAccessBean;
	}


	public void setDistrictAccessBean(DistrictAccessBean districtAccessBean) {
		this.districtAccessBean = districtAccessBean;
	}


	public SRLocationAccessBean getSrLocationAccessBean() {
		return srLocationAccessBean;
	}


	public void setSrLocationAccessBean(SRLocationAccessBean srLocationAccessBean) {
		this.srLocationAccessBean = srLocationAccessBean;
	}
	
	
	
	
	

}
