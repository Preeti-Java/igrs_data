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
@Table(name = "DurgDeed")
public class DurgDeedAccessBean  extends CommonDeedAccessBean{

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
	public static DurgDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		DurgDeedAccessBean durgDeedAccessBean = new DurgDeedAccessBean();
		durgDeedAccessBean.setFileId(fileId);
		durgDeedAccessBean.setVolumeNo(volumeNo);
		durgDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		durgDeedAccessBean.setDocumentNo(documentNo);
		durgDeedAccessBean.setPageFrom(pageFrom);
		durgDeedAccessBean.setPageTo(pageTo);
		durgDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		durgDeedAccessBean.setYearAccessBean(yearAccessBean);
		durgDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		durgDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		durgDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		durgDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		durgDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		durgDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return durgDeedAccessBean;
	}


}
