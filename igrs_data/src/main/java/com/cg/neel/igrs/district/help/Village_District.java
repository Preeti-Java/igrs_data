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
@Table(name = "Village_District")
public class Village_District {
	
	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@ManyToOne
	@JoinColumn(name="District_Sno")
	private DistrictAccessBean districtAccessBean;
	
	@ManyToOne
	@JoinColumn(name="Village_Sno")
	private VillageAccessBean villageAccessBean;

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

	public VillageAccessBean getVillageAccessBean() {
		return villageAccessBean;
	}

	public void setVillageAccessBean(VillageAccessBean villageAccessBean) {
		this.villageAccessBean = villageAccessBean;
	}
	
	
	
	
	

}
