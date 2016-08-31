/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * SkuItem 实体类
 * @author 雅居乐 2016-8-31 20:47:08
 * @version 1.0
 */
public class SkuItem extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "SkuItem";
		
	//columns START
	/**货品id*/
	private java.lang.Integer skuId;	
	/**选项名称，作为演示表，选项名称，选项值没有单独定义表*/
	private java.lang.String itemName;	
	/**选项字面值*/
	private java.lang.String itemValue;	
	
	private Integer goodsId;
	//columns END
	


	public java.lang.Integer getSkuId() {
		return this.skuId;
	}
	
	public void setSkuId(java.lang.Integer value) {
		this.skuId = value;
	}

	public java.lang.String getItemName() {
		return this.itemName;
	}
	
	public void setItemName(java.lang.String value) {
		this.itemName = value;
	}

	public java.lang.String getItemValue() {
		return this.itemValue;
	}
	
	public void setItemValue(java.lang.String value) {
		this.itemValue = value;
	}

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	
	

}

