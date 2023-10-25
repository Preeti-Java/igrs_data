package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.BastarDeedAccessBean;
import com.cg.neel.igrs.district.BastarParty1AccessBean;
import com.cg.neel.igrs.district.BastarParty2AccessBean;
import com.cg.neel.igrs.district.BastarPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Bastar_FileId")
public class BastarFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private BastarDeedAccessBean BastarDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private BastarParty1AccessBean BastarParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private BastarParty2AccessBean BastarParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private BastarPropertyAccessBean BastarPropertyAccessBean;

}
