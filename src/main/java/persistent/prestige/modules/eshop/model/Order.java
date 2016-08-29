/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * Order 实体类
 * @author 雅居乐 2016-8-27 10:27:01
 * @version 1.0
 */
public class Order extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "Order";
		
	//columns START
	/**订单编号*/
	private java.lang.String orderNo;	
	/**购买者uid*/
	private java.lang.String buyUid;	
	/**商家uid*/
	private java.lang.String sellerUid;	
	/**总金额，单位分*/
	private java.lang.Long totalPrice;	
	/**0:禁用;1:启用*/
	private Integer status;	
	//columns END
	


	public java.lang.String getOrderNo() {
		return this.orderNo;
	}
	
	public void setOrderNo(java.lang.String value) {
		this.orderNo = value;
	}

	public java.lang.String getBuyUid() {
		return this.buyUid;
	}
	
	public void setBuyUid(java.lang.String value) {
		this.buyUid = value;
	}

	public java.lang.String getSellerUid() {
		return this.sellerUid;
	}
	
	public void setSellerUid(java.lang.String value) {
		this.sellerUid = value;
	}

	public java.lang.Long getTotalPrice() {
		return this.totalPrice;
	}
	
	public void setTotalPrice(java.lang.Long value) {
		this.totalPrice = value;
	}

	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}

}

