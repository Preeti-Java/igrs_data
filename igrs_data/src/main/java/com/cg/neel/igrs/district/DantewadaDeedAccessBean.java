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
@Table(name = "DantewadaDeed")
public class DantewadaDeedAccessBean  extends CommonDeedAccessBean{

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
	public static DantewadaDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		DantewadaDeedAccessBean dantewadaDeedAccessBean = new DantewadaDeedAccessBean();
		dantewadaDeedAccessBean.setFileId(fileId);
		dantewadaDeedAccessBean.setVolumeNo(volumeNo);
		dantewadaDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		dantewadaDeedAccessBean.setDocumentNo(documentNo);
		dantewadaDeedAccessBean.setPageFrom(pageFrom);
		dantewadaDeedAccessBean.setPageTo(pageTo);
		dantewadaDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		dantewadaDeedAccessBean.setYearAccessBean(yearAccessBean);
		dantewadaDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		dantewadaDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		dantewadaDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		dantewadaDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		dantewadaDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		dantewadaDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return dantewadaDeedAccessBean;
	}
}
