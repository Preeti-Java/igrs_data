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
@Table(name = "KoriyaDeed")
public class KoriyaDeedAccessBean extends CommonDeedAccessBean{

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
	public static KoriyaDeedAccessBean of(String fileId, String volumeNo, BookNoAccessBean bookNoAccessBean,
			String documentNo, String pageFrom, String pageTo, String dateOfRegistration, YearAccessBean yearAccessBean,
			DocumentTypeAccessBean documentTypeAccessBean,
			RegistrationDistrictAccessBean registrationDistrictAccessBean, SRLocationAccessBean srLocationAccessBean,
			RevenueDistrictAccessBean revenueDistrictAccessBean, DistrictAccessBean districtAccessBean,
			SubDistrictAccessBean subDistrictAccessBean) {
		
		KoriyaDeedAccessBean koriyaDeedAccessBean = new KoriyaDeedAccessBean();
		koriyaDeedAccessBean.setFileId(fileId);
		koriyaDeedAccessBean.setVolumeNo(volumeNo);
		koriyaDeedAccessBean.setBookNoAccessBean(bookNoAccessBean);
		koriyaDeedAccessBean.setDocumentNo(documentNo);
		koriyaDeedAccessBean.setPageFrom(pageFrom);
		koriyaDeedAccessBean.setPageTo(pageTo);
		koriyaDeedAccessBean.setDateOfRegistration(dateOfRegistration);
		koriyaDeedAccessBean.setYearAccessBean(yearAccessBean);
		koriyaDeedAccessBean.setDocumentTypeAccessBean(documentTypeAccessBean);
		koriyaDeedAccessBean.setRegistrationDistrictAccessBean(registrationDistrictAccessBean);
		koriyaDeedAccessBean.setSrLocationAccessBean(srLocationAccessBean);
		koriyaDeedAccessBean.setRevenueDistrictAccessBean(revenueDistrictAccessBean);
		koriyaDeedAccessBean.setDistrictAccessBean(districtAccessBean);
		koriyaDeedAccessBean.setSubDistrictAccessBean(subDistrictAccessBean);
		
		return koriyaDeedAccessBean;
	}


}
