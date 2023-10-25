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
@Table(name = "Tehsil_District")
public class Tehsil_District {
	
	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@ManyToOne
	@JoinColumn(name="District_Sno")
	private DistrictAccessBean districtAccessBean;
	
	@ManyToOne
	@JoinColumn(name="Tehsil_Sno")
	private TehsilAccessBean tehsilAccessBean;

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

	public TehsilAccessBean getTehsilAccessBean() {
		return tehsilAccessBean;
	}

	public void setTehsilAccessBean(TehsilAccessBean tehsilAccessBean) {
		this.tehsilAccessBean = tehsilAccessBean;
	}
	
	
	

}
