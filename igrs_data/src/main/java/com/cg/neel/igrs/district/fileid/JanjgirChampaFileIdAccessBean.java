package com.cg.neel.igrs.district.fileid;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.cg.neel.igrs.district.JanjgirChampaDeedAccessBean;
import com.cg.neel.igrs.district.JanjgirChampaParty1AccessBean;
import com.cg.neel.igrs.district.JanjgirChampaParty2AccessBean;
import com.cg.neel.igrs.district.JanjgirChampaPropertyAccessBean;
import com.cg.neel.igrs.district.common.CommonFileIdAccessBean;

@Entity
@Table(name = "JanjgirChampa_FileId")
public class JanjgirChampaFileIdAccessBean extends CommonFileIdAccessBean {

	@OneToOne
	@JoinColumn(name = "Deed_Fileid")
	@Fetch(FetchMode.SELECT)
	private JanjgirChampaDeedAccessBean JanjgirChampaDeedAccessBean;

	@OneToOne
	@JoinColumn(name = "Party1_Fileid")
	@Fetch(FetchMode.SELECT)
	private JanjgirChampaParty1AccessBean JanjgirChampaParty1AccessBean;

	@OneToOne
	@JoinColumn(name = "Party2_Fileid")
	@Fetch(FetchMode.SELECT)
	private JanjgirChampaParty2AccessBean JanjgirChampaParty2AccessBean;

	@OneToOne
	@JoinColumn(name = "Property_Fileid")
	@Fetch(FetchMode.SELECT)
	private JanjgirChampaPropertyAccessBean JanjgirChampaPropertyAccessBean;

}
