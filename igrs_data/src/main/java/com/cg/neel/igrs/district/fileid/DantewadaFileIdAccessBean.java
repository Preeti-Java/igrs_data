package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.DantewadaDeedAccessBean;
import com.cg.neel.igrs.district.DantewadaParty1AccessBean;
import com.cg.neel.igrs.district.DantewadaParty2AccessBean;
import com.cg.neel.igrs.district.DantewadaPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Dantewada_FileId")
public class DantewadaFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private DantewadaDeedAccessBean DantewadaDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private DantewadaParty1AccessBean DantewadaParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private DantewadaParty2AccessBean DantewadaParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private DantewadaPropertyAccessBean DantewadaPropertyAccessBean;

}
