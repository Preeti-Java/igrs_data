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
@Table(name = "JashpurDeed")
public class JashpurDeedAccessBean extends CommonDeedAccessBean{

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
	public static JashpurDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		JashpurDeedAccessBean jashpurDeedAccessBean = new JashpurDeedAccessBean();
		jashpurDeedAccessBean.setFileId(fileId);
		jashpurDeedAccessBean.setVolumeNo(volumeNo);
		jashpurDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		jashpurDeedAccessBean.setDocumentNo(documentNo);
		jashpurDeedAccessBean.setPageFrom(pageFrom);
		jashpurDeedAccessBean.setPageTo(pageTo);
		jashpurDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		jashpurDeedAccessBean.setYearAccessBean(yearAccessBean);
		jashpurDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		jashpurDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		jashpurDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		jashpurDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		jashpurDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		jashpurDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return jashpurDeedAccessBean;
	}
}
