/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * OrderItem 实体类
 * @author 雅居乐 2016-8-27 10:31:06
 * @version 1.0
 */
public class OrderItem extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "OrderItem";
		
	//columns START
	/**订单ID*/
	private java.lang.Integer orderId;	
	/**商品id*/
	private java.lang.Integer goodsId;	
	/**商品单价*/
	private java.lang.Long price;	
	/**购买数量*/
	private java.lang.Integer num;	
	/**总价格*/
	private java.lang.Long totalPrice;	
	//columns END
	
	private String buyUid;
	


	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}

	public java.lang.Integer getGoodsId() {
		return this.goodsId;
	}
	
	public void setGoodsId(java.lang.Integer value) {
		this.goodsId = value;
	}

	public java.lang.Long getPrice() {
		return this.price;
	}
	
	public void setPrice(java.lang.Long value) {
		this.price = value;
	}

	public java.lang.Integer getNum() {
		return this.num;
	}
	
	public void setNum(java.lang.Integer value) {
		this.num = value;
	}

	public java.lang.Long getTotalPrice() {
		return this.totalPrice;
	}
	
	public void setTotalPrice(java.lang.Long value) {
		this.totalPrice = value;
	}

	public String getBuyUid() {
		return buyUid;
	}

	public void setBuyUid(String buyUid) {
		this.buyUid = buyUid;
	}

}

