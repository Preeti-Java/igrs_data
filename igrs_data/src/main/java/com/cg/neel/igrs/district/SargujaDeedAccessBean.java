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
@Table(name = "SargujaDeed")
public class SargujaDeedAccessBean extends CommonDeedAccessBean {

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
	public static SargujaDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		SargujaDeedAccessBean sargujaDeedAccessBean = new SargujaDeedAccessBean();
		sargujaDeedAccessBean.setFileId(fileId);
		sargujaDeedAccessBean.setVolumeNo(volumeNo);
		sargujaDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		sargujaDeedAccessBean.setDocumentNo(documentNo);
		sargujaDeedAccessBean.setPageFrom(pageFrom);
		sargujaDeedAccessBean.setPageTo(pageTo);
		sargujaDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		sargujaDeedAccessBean.setYearAccessBean(yearAccessBean);
		sargujaDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		sargujaDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		sargujaDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		sargujaDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		sargujaDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		sargujaDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return sargujaDeedAccessBean;
	}
}
