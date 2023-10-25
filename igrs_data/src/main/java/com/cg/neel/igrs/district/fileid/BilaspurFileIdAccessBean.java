package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.BilaspurDeedAccessBean;
import com.cg.neel.igrs.district.BilaspurParty1AccessBean;
import com.cg.neel.igrs.district.BilaspurParty2AccessBean;
import com.cg.neel.igrs.district.BilaspurPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Bilaspur_FileId")
public class BilaspurFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private BilaspurDeedAccessBean BilaspurDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private BilaspurParty1AccessBean BilaspurParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private BilaspurParty2AccessBean BilaspurParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private BilaspurPropertyAccessBean BilaspurPropertyAccessBean;

}
