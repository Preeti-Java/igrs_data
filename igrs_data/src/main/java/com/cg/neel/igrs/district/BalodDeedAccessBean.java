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
 * @Dis Balod deed details
 *
 */
@Entity
@Table(name = "BalodDeed")
public class BalodDeedAccessBean extends CommonDeedAccessBean{

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
	public static BalodDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		BalodDeedAccessBean balodDeedAccessBean = new BalodDeedAccessBean();
		balodDeedAccessBean.setFileId(fileId);
		balodDeedAccessBean.setVolumeNo(volumeNo);
		balodDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		balodDeedAccessBean.setDocumentNo(documentNo);
		balodDeedAccessBean.setPageFrom(pageFrom);
		balodDeedAccessBean.setPageTo(pageTo);
		balodDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		balodDeedAccessBean.setYearAccessBean(yearAccessBean);
		balodDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		balodDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		balodDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		balodDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		balodDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		balodDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return balodDeedAccessBean;
	}

}
