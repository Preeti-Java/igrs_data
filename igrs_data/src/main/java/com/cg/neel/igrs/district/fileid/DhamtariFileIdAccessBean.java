package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.DhamtariDeedAccessBean;
import com.cg.neel.igrs.district.DhamtariParty1AccessBean;
import com.cg.neel.igrs.district.DhamtariParty2AccessBean;
import com.cg.neel.igrs.district.DhamtariPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Dhamtari_FileId")
public class DhamtariFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private DhamtariDeedAccessBean DhamtariDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private DhamtariParty1AccessBean DhamtariParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private DhamtariParty2AccessBean DhamtariParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private DhamtariPropertyAccessBean DhamtariPropertyAccessBean;

}
