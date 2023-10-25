package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.KorbaDeedAccessBean;
import com.cg.neel.igrs.district.KorbaParty1AccessBean;
import com.cg.neel.igrs.district.KorbaParty2AccessBean;
import com.cg.neel.igrs.district.KorbaPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Korba_FileId")
public class KorbaFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private KorbaDeedAccessBean KorbaDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private KorbaParty1AccessBean KorbaParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private KorbaParty2AccessBean KorbaParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private KorbaPropertyAccessBean KorbaPropertyAccessBean;

}
