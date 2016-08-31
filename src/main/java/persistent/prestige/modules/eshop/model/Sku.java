/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * Sku 实体类
 * @author 雅居乐 2016-8-31 20:45:42
 * @version 1.0
 */
public class Sku extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "Sku";
		
	//columns START
	/**商品ID*/
	private java.lang.Integer goodsId;	
	/**商品价格，单位分*/
	private java.lang.Long price;	
	/**库存*/
	private java.lang.Integer storeCount;	
	
	private String skuNo;
	//columns END
	


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

	public java.lang.Integer getStoreCount() {
		return this.storeCount;
	}
	
	public void setStoreCount(java.lang.Integer value) {
		this.storeCount = value;
	}

	public String getSkuNo() {
		return skuNo;
	}

	public void setSkuNo(String skuNo) {
		this.skuNo = skuNo;
	}
	
	

}

