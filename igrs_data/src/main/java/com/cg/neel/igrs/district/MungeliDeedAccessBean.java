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
@Table(name = "MungeliDeed")
public class MungeliDeedAccessBean extends CommonDeedAccessBean{

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
	public static MungeliDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		MungeliDeedAccessBean mungeliDeedAccessBean = new MungeliDeedAccessBean();
		mungeliDeedAccessBean.setFileId(fileId);
		mungeliDeedAccessBean.setVolumeNo(volumeNo);
		mungeliDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		mungeliDeedAccessBean.setDocumentNo(documentNo);
		mungeliDeedAccessBean.setPageFrom(pageFrom);
		mungeliDeedAccessBean.setPageTo(pageTo);
		mungeliDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		mungeliDeedAccessBean.setYearAccessBean(yearAccessBean);
		mungeliDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		mungeliDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		mungeliDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		mungeliDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		mungeliDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		mungeliDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return mungeliDeedAccessBean;
	}


}
