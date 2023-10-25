/**
 * 
 */
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

/**
 * @author 
 * @Dis Balodbazar deed details
 *
 */
@Entity
@Table(name = "balodabazardeed")
public class BalodaBazarDeedAccessBean extends CommonDeedAccessBean{

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
	public static BalodaBazarDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		BalodaBazarDeedAccessBean balodaBazarDeedAccessBean = new BalodaBazarDeedAccessBean();
		balodaBazarDeedAccessBean.setFileId(fileId);
		balodaBazarDeedAccessBean.setVolumeNo(volumeNo);
		balodaBazarDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		balodaBazarDeedAccessBean.setDocumentNo(documentNo);
		balodaBazarDeedAccessBean.setPageFrom(pageFrom);
		balodaBazarDeedAccessBean.setPageTo(pageTo);
		balodaBazarDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		balodaBazarDeedAccessBean.setYearAccessBean(yearAccessBean);
		balodaBazarDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		balodaBazarDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		balodaBazarDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		balodaBazarDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		balodaBazarDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		balodaBazarDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return balodaBazarDeedAccessBean;
	}

}
