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
@Table(name = "BastarDeed")
public class BastarDeedAccessBean extends CommonDeedAccessBean {

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
	public static BastarDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		BastarDeedAccessBean bastarDeedAccessBean = new BastarDeedAccessBean();
		bastarDeedAccessBean.setFileId(fileId);
		bastarDeedAccessBean.setVolumeNo(volumeNo);
		bastarDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		bastarDeedAccessBean.setDocumentNo(documentNo);
		bastarDeedAccessBean.setPageFrom(pageFrom);
		bastarDeedAccessBean.setPageTo(pageTo);
		bastarDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		bastarDeedAccessBean.setYearAccessBean(yearAccessBean);
		bastarDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		bastarDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		bastarDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		bastarDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		bastarDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		bastarDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return bastarDeedAccessBean;
	}

	
}
