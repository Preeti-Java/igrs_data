package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.BalodDeedAccessBean;
import com.cg.neel.igrs.district.BalodParty1AccessBean;
import com.cg.neel.igrs.district.BalodParty2AccessBean;
import com.cg.neel.igrs.district.BalodPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Balod_FileId")
public class BalodFileIdAccessBean extends CommonFileIdAccessBean {
	
	@OneToOne
	@JoinColumn(name="Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private BalodDeedAccessBean balodDeedAccessBean;
	
	@OneToOne
	@JoinColumn(name="Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private BalodParty1AccessBean balodParty1AccessBean;
	
	@OneToOne
	@JoinColumn(name="Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private BalodParty2AccessBean balodParty2AccessBean;
	
	@OneToOne
	@JoinColumn(name="Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private BalodPropertyAccessBean balodPropertyAccessBean;
	
	
	

}
