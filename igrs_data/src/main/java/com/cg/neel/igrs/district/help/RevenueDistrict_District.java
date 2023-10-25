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
@Table(name = "RevenueDistrict_District")
public class RevenueDistrict_District {

	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@ManyToOne
	@JoinColumn(name="District_Sno")
	private DistrictAccessBean districtAccessBean;
	
	@ManyToOne
	@JoinColumn(name="RevenueDistirct_Sno")
	private RevenueDistrictAccessBean revenueDistrictAccessBean;

	
	
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

	public RevenueDistrictAccessBean getRevenueDistrictAccessBean() {
		return revenueDistrictAccessBean;
	}

	public void setRevenueDistrictAccessBean(RevenueDistrictAccessBean revenueDistrictAccessBean) {
		this.revenueDistrictAccessBean = revenueDistrictAccessBean;
	}
	
	
	
	
}
