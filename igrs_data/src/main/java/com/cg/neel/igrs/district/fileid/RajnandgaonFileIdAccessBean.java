package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.RajnandgaonDeedAccessBean;
import com.cg.neel.igrs.district.RajnandgaonParty1AccessBean;
import com.cg.neel.igrs.district.RajnandgaonParty2AccessBean;
import com.cg.neel.igrs.district.RajnandgaonPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "Rajnandgaon_FileId")
public class RajnandgaonFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private RajnandgaonDeedAccessBean RajnandgaonDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private RajnandgaonParty1AccessBean RajnandgaonParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private RajnandgaonParty2AccessBean RajnandgaonParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private RajnandgaonPropertyAccessBean RajnandgaonPropertyAccessBean;

}
