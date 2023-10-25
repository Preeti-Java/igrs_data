package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.RaigarhDeedAccessBean;
import com.cg.neel.igrs.district.RaigarhParty1AccessBean;
import com.cg.neel.igrs.district.RaigarhParty2AccessBean;
import com.cg.neel.igrs.district.RaigarhPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Raigarh_FileId")
public class RaigarhFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private RaigarhDeedAccessBean RaigarhDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private RaigarhParty1AccessBean RaigarhParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private RaigarhParty2AccessBean RaigarhParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private RaigarhPropertyAccessBean RaigarhPropertyAccessBean;

}
