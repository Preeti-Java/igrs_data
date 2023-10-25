package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.cg.neel.igrs.district.BalodaBazarDeedAccessBean;
import com.cg.neel.igrs.district.BalodaBazarParty1AccessBean;
import com.cg.neel.igrs.district.BalodaBazarParty2AccessBean;
import com.cg.neel.igrs.district.BalodaBazarPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "BalodaBazar_FileId")
public class BalodaBazarFileIdAccessBean extends CommonFileIdAccessBean{
	
	@OneToOne
	@JoinColumn(name="Deed_Fileid")
	private BalodaBazarDeedAccessBean balodaBazarDeedAccessBean;
	
	@OneToOne
	@JoinColumn(name="Party1_Fileid")
	private BalodaBazarParty1AccessBean balodaBazarParty1AccessBean;
	
	@OneToOne
	@JoinColumn(name="Party2_Fileid")
	private BalodaBazarParty2AccessBean balodaBazarParty2AccessBean;
	
	@OneToOne
	@JoinColumn(name="Property_Fileid")
	private BalodaBazarPropertyAccessBean balodaBazarPropertyAccessBean;
	
	
	

}
