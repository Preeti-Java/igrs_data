/**
 * 
 */
package com.cg.neel.igrs.globalbean;

import com.cg.neel.igrs.district.common.CommonDeedAccessBean;
import com.cg.neel.igrs.district.common.CommonParty1DetailsAccessBean;
import com.cg.neel.igrs.district.common.CommonParty2DetailsAccessBean;
import com.cg.neel.igrs.district.common.CommonPropertyAccessBean;

/**
 * @author Preeti
 * @Dis this bean used for globalSearch
 *
 */

/**
 * @author User
 *
 */
public class GlobalSearchAccessBean {

	private CommonPropertyAccessBean commonProperty;

	private CommonDeedAccessBean commonDeed;

	private CommonParty1DetailsAccessBean commonParty1;

	private CommonParty2DetailsAccessBean commonParty2;

	/**
	 * @return the commonProperty
	 */
	public CommonPropertyAccessBean getCommonProperty() {
		return commonProperty;
	}

	/**
	 * @param commonProperty the commonProperty to set
	 */
	public void setCommonProperty(CommonPropertyAccessBean commonProperty) {
		this.commonProperty = commonProperty;
	}

	/**
	 * @return the commonParty1
	 */
	public CommonParty1DetailsAccessBean getCommonParty1() {
		return commonParty1;
	}

	/**
	 * @param commonParty1 the commonParty1 to set
	 */
	public void setCommonParty1(CommonParty1DetailsAccessBean commonParty1) {
		this.commonParty1 = commonParty1;
	}

	/**
	 * @return the commonParty2
	 */
	public CommonParty2DetailsAccessBean getCommonParty2() {
		return commonParty2;
	}

	/**
	 * @param commonParty2 the commonParty2 to set
	 */
	public void setCommonParty2(CommonParty2DetailsAccessBean commonParty2) {
		this.commonParty2 = commonParty2;
	}

	/**
	 * @return the commonDeed
	 */
	public CommonDeedAccessBean getCommonDeed() {
		return commonDeed;
	}

	/**
	 * @param commonDeed the commonDeed to set
	 */
	public void setCommonDeed(CommonDeedAccessBean commonDeed) {
		this.commonDeed = commonDeed;
	}

	/**
	 * @param commonProperty
	 * @param commonDeed
	 * @param commonParty1
	 * @param commonParty2
	 */
	public GlobalSearchAccessBean(CommonPropertyAccessBean commonProperty, CommonDeedAccessBean commonDeed,
			CommonParty1DetailsAccessBean commonParty1, CommonParty2DetailsAccessBean commonParty2) {
		super();
		this.commonProperty = commonProperty;
		this.commonDeed = commonDeed;
		this.commonParty1 = commonParty1;
		this.commonParty2 = commonParty2;
	}

}
