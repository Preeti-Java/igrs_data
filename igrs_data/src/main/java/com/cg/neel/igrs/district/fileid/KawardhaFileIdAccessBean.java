package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.KawardhaDeedAccessBean;
import com.cg.neel.igrs.district.KawardhaParty1AccessBean;
import com.cg.neel.igrs.district.KawardhaParty2AccessBean;
import com.cg.neel.igrs.district.KawardhaPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Kawardha_FileId")
public class KawardhaFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private KawardhaDeedAccessBean KawardhaDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private KawardhaParty1AccessBean KawardhaParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private KawardhaParty2AccessBean KawardhaParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private KawardhaPropertyAccessBean KawardhaPropertyAccessBean;

}
