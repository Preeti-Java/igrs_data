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
@Table(name = "RaipurDeed")
public class RaipurDeedAccessBean extends CommonDeedAccessBean {

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
	public static RaipurDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		RaipurDeedAccessBean raipurDeedAccessBean = new RaipurDeedAccessBean();
		raipurDeedAccessBean.setFileId(fileId);
		raipurDeedAccessBean.setVolumeNo(volumeNo);
		raipurDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		raipurDeedAccessBean.setDocumentNo(documentNo);
		raipurDeedAccessBean.setPageFrom(pageFrom);
		raipurDeedAccessBean.setPageTo(pageTo);
		raipurDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		raipurDeedAccessBean.setYearAccessBean(yearAccessBean);
		raipurDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		raipurDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		raipurDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		raipurDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		raipurDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		raipurDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return raipurDeedAccessBean;
	}

}
