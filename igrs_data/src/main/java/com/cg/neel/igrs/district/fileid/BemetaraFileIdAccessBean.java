package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.BemetaraDeedAccessBean;
import com.cg.neel.igrs.district.BemetaraParty1AccessBean;
import com.cg.neel.igrs.district.BemetaraParty2AccessBean;
import com.cg.neel.igrs.district.BemetaraPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Bemetara_FileId")
public class BemetaraFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private BemetaraDeedAccessBean BemetaraDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private BemetaraParty1AccessBean BemetaraParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private BemetaraParty2AccessBean BemetaraParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private BemetaraPropertyAccessBean BemetaraPropertyAccessBean;

}
