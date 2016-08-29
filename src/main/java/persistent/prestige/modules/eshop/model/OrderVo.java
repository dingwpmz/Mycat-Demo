package persistent.prestige.modules.eshop.model;

import java.io.Serializable;
import java.util.List;

public class OrderVo implements Serializable {

	private Integer orderId;

	private String orderNo;

	private String buyUid;

	private String sellerUid;

	private Long totalPrice;

	private Integer status;

	private String buyName;

	private String sellerName;
	
	private List<OrderItemVo> items;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getBuyUid() {
		return buyUid;
	}

	public void setBuyUid(String buyUid) {
		this.buyUid = buyUid;
	}

	public String getSellerUid() {
		return sellerUid;
	}

	public void setSellerUid(String sellerUid) {
		this.sellerUid = sellerUid;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBuyName() {
		return buyName;
	}

	public void setBuyName(String buyName) {
		this.buyName = buyName;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public List<OrderItemVo> getItems() {
		return items;
	}

	public void setItems(List<OrderItemVo> items) {
		this.items = items;
	}
	
	

}
