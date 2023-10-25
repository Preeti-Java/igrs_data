package com.cg.neel.igrs.district;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.neel.igrs.district.common.CommonDeedAccessBean;
import com.cg.neel.igrs.district.help.BookNoAccessBean;
import com.cg.neel.igrs.district.help.DistrictAccessBean;
import com.cg.neel.igrs.district.help.DocumentTypeAccessBean;
import com.cg.neel.igrs.district.help.RegistrationDistrictAccessBean;
import com.cg.neel.igrs.district.help.RevenueDistrictAccessBean;
import com.cg.neel.igrs.district.help.SRLocationAccessBean;
import com.cg.neel.igrs.district.help.SubDistrictAccessBean;
import com.cg.neel.igrs.district.help.YearAccessBean;

@Entity
@Table(name = "KorbaDeed")
public class KorbaDeedAccessBean extends CommonDeedAccessBean {

	/**
	 * @param sno
	 * @param fileId
	 * @param volumeNo
	 * @param bookNoAccessBean
	 * @param documentNo
	 * @param pageFrom
	 * @param pageTo
	 * @param dateOfRegistration
	 * @param yearAccessBean
	 * @param documentTypeAccessBean
	 * @param registrationDistrictAccessBean
	 * @param srLocationAccessBean
	 * @param revenueDistrictAccessBean
	 * @param districtAccessBean
	 * @param subDistrictAccessBean
	 */
	public static KorbaDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		KorbaDeedAccessBean korbaDeedAccessBean = new KorbaDeedAccessBean();
		korbaDeedAccessBean.setFileId(fileId);
		korbaDeedAccessBean.setVolumeNo(volumeNo);
		korbaDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		korbaDeedAccessBean.setDocumentNo(documentNo);
		korbaDeedAccessBean.setPageFrom(pageFrom);
		korbaDeedAccessBean.setPageTo(pageTo);
		korbaDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		korbaDeedAccessBean.setYearAccessBean(yearAccessBean);
		korbaDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		korbaDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		korbaDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		korbaDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		korbaDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		korbaDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return korbaDeedAccessBean;
	}

}
