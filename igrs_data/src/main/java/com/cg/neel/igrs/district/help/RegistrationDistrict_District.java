package com.cg.neel.igrs.district.help;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RegistrationDistrict_District")
public class RegistrationDistrict_District {
	
	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@ManyToOne
	@JoinColumn(name="District_Sno")
	private DistrictAccessBean districtAccessBean;
	
	@ManyToOne
	@JoinColumn(name="RegistrationDistrict_Sno")
	private RegistrationDistrictAccessBean registrationDistrictAccessBean;

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

	public RegistrationDistrictAccessBean getRegistrationDistrictAccessBean() {
		return registrationDistrictAccessBean;
	}

	public void setRegistrationDistrictAccessBean(RegistrationDistrictAccessBean registrationDistrictAccessBean) {
		this.registrationDistrictAccessBean = registrationDistrictAccessBean;
	}
	

	
	
}
