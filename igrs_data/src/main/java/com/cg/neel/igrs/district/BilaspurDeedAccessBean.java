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
@Table(name = "BilaspurDeed")
public class BilaspurDeedAccessBean extends CommonDeedAccessBean{

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
	public static BilaspurDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		BilaspurDeedAccessBean bilaspurDeedAccessBean = new BilaspurDeedAccessBean();
		bilaspurDeedAccessBean.setFileId(fileId);
		bilaspurDeedAccessBean.setVolumeNo(volumeNo);
		bilaspurDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		bilaspurDeedAccessBean.setDocumentNo(documentNo);
		bilaspurDeedAccessBean.setPageFrom(pageFrom);
		bilaspurDeedAccessBean.setPageTo(pageTo);
		bilaspurDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		bilaspurDeedAccessBean.setYearAccessBean(yearAccessBean);
		bilaspurDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		bilaspurDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		bilaspurDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		bilaspurDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		bilaspurDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		bilaspurDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return bilaspurDeedAccessBean;
	}

}
