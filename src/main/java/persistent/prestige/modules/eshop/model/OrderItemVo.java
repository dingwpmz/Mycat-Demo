package persistent.prestige.modules.eshop.model;

import java.io.Serializable;

public class OrderItemVo implements Serializable {

	// columns START
	private Integer itemId;

	/** 订单ID */
	private java.lang.Integer orderId;
	/** 商品id */
	private java.lang.Integer goodsId;
	/** 商品单价 */
	private java.lang.Long price;
	/** 购买数量 */
	private java.lang.Integer num;
	/** 总价格 */
	private java.lang.Long totalPrice;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public java.lang.Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(java.lang.Integer orderId) {
		this.orderId = orderId;
	}

	public java.lang.Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(java.lang.Integer goodsId) {
		this.goodsId = goodsId;
	}

	public java.lang.Long getPrice() {
		return price;
	}

	public void setPrice(java.lang.Long price) {
		this.price = price;
	}

	public java.lang.Integer getNum() {
		return num;
	}

	public void setNum(java.lang.Integer num) {
		this.num = num;
	}

	public java.lang.Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(java.lang.Long totalPrice) {
		this.totalPrice = totalPrice;
	}

}
