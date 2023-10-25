package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.MahasamundDeedAccessBean;
import com.cg.neel.igrs.district.MahasamundParty1AccessBean;
import com.cg.neel.igrs.district.MahasamundParty2AccessBean;
import com.cg.neel.igrs.district.MahasamundPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Mahasamund_FileId")
public class MahasamundFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private MahasamundDeedAccessBean MahasamundDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private MahasamundParty1AccessBean MahasamundParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private MahasamundParty2AccessBean MahasamundParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private MahasamundPropertyAccessBean MahasamundPropertyAccessBean;

}
