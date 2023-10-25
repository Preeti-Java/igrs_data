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
@Table(name = "RaigarhDeed")
public class RaigarhDeedAccessBean extends CommonDeedAccessBean{

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
	public static RaigarhDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		RaigarhDeedAccessBean raigarhDeedAccessBean = new RaigarhDeedAccessBean();
		raigarhDeedAccessBean.setFileId(fileId);
		raigarhDeedAccessBean.setVolumeNo(volumeNo);
		raigarhDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		raigarhDeedAccessBean.setDocumentNo(documentNo);
		raigarhDeedAccessBean.setPageFrom(pageFrom);
		raigarhDeedAccessBean.setPageTo(pageTo);
		raigarhDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		raigarhDeedAccessBean.setYearAccessBean(yearAccessBean);
		raigarhDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		raigarhDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		raigarhDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		raigarhDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		raigarhDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		raigarhDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return raigarhDeedAccessBean;
	}

}
