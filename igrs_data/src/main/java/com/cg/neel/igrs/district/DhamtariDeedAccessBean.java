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
@Table(name = "DhamtariDeed")
public class DhamtariDeedAccessBean extends CommonDeedAccessBean{

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
	public static DhamtariDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		DhamtariDeedAccessBean dhamtariDeedAccessBean = new DhamtariDeedAccessBean();
		dhamtariDeedAccessBean.setFileId(fileId);
		dhamtariDeedAccessBean.setVolumeNo(volumeNo);
		dhamtariDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		dhamtariDeedAccessBean.setDocumentNo(documentNo);
		dhamtariDeedAccessBean.setPageFrom(pageFrom);
		dhamtariDeedAccessBean.setPageTo(pageTo);
		dhamtariDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		dhamtariDeedAccessBean.setYearAccessBean(yearAccessBean);
		dhamtariDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		dhamtariDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		dhamtariDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		dhamtariDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		dhamtariDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		dhamtariDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return dhamtariDeedAccessBean;
	}

}
