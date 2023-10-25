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
@Table(name = "JanjgirChampaDeed")
public class JanjgirChampaDeedAccessBean extends CommonDeedAccessBean{

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
	public static JanjgirChampaDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		JanjgirChampaDeedAccessBean janjgirChampaDeedAccessBean = new JanjgirChampaDeedAccessBean();
		janjgirChampaDeedAccessBean.setFileId(fileId);
		janjgirChampaDeedAccessBean.setVolumeNo(volumeNo);
		janjgirChampaDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		janjgirChampaDeedAccessBean.setDocumentNo(documentNo);
		janjgirChampaDeedAccessBean.setPageFrom(pageFrom);
		janjgirChampaDeedAccessBean.setPageTo(pageTo);
		janjgirChampaDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		janjgirChampaDeedAccessBean.setYearAccessBean(yearAccessBean);
		janjgirChampaDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		janjgirChampaDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		janjgirChampaDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		janjgirChampaDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		janjgirChampaDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		janjgirChampaDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return janjgirChampaDeedAccessBean;
	}

}
