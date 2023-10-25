package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.KoriyaDeedAccessBean;
import com.cg.neel.igrs.district.KoriyaParty1AccessBean;
import com.cg.neel.igrs.district.KoriyaParty2AccessBean;
import com.cg.neel.igrs.district.KoriyaPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Koriya_FileId")
public class KoriyaFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private KoriyaDeedAccessBean KoriyaDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private KoriyaParty1AccessBean KoriyaParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private KoriyaParty2AccessBean KoriyaParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private KoriyaPropertyAccessBean KoriyaPropertyAccessBean;

}
