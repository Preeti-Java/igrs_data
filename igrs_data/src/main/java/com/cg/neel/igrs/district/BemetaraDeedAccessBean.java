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
@Table(name = "BemetaraDeed")
public class BemetaraDeedAccessBean extends CommonDeedAccessBean{

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
	public static BemetaraDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		BemetaraDeedAccessBean bemetaraDeedAccessBean = new BemetaraDeedAccessBean();
		bemetaraDeedAccessBean.setFileId(fileId);
		bemetaraDeedAccessBean.setVolumeNo(volumeNo);
		bemetaraDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		bemetaraDeedAccessBean.setDocumentNo(documentNo);
		bemetaraDeedAccessBean.setPageFrom(pageFrom);
		bemetaraDeedAccessBean.setPageTo(pageTo);
		bemetaraDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		bemetaraDeedAccessBean.setYearAccessBean(yearAccessBean);
		bemetaraDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		bemetaraDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		bemetaraDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		bemetaraDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		bemetaraDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		bemetaraDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return bemetaraDeedAccessBean;
	}


}
