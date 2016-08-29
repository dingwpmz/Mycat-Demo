/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * Seller 实体类
 * @author 雅居乐 2016-8-27 10:22:35
 * @version 1.0
 */
public class Seller extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "Seller";
		
	//columns START
	/**商家名称*/
	private java.lang.String sellerName;	
	/**商家uid*/
	private java.lang.String uid;	
	/**联系地址*/
	private java.lang.String address;	
	/**电话*/
	private java.lang.String phone;	
	/**0:禁用;1:启用*/
	private Integer status;	
	//columns END
	


	public java.lang.String getSellerName() {
		return this.sellerName;
	}
	
	public void setSellerName(java.lang.String value) {
		this.sellerName = value;
	}

	public java.lang.String getUid() {
		return this.uid;
	}
	
	public void setUid(java.lang.String value) {
		this.uid = value;
	}

	public java.lang.String getAddress() {
		return this.address;
	}
	
	public void setAddress(java.lang.String value) {
		this.address = value;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}
	
	public void setPhone(java.lang.String value) {
		this.phone = value;
	}

	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}

}

