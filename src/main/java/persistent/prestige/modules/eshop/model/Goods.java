/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * Goods 实体类
 * @author 雅居乐 2016-8-31 20:41:39
 * @version 1.0
 */
public class Goods extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "Goods";
		
	//columns START
	/**商品分类id*/
	private java.lang.Integer goodsClassId;	
	/**商品名称*/
	private java.lang.String goodsName;	
	/**商品默认图片*/
	private java.lang.String goodsImgKey;	
	/**商品描述*/
	private java.lang.String goodsDesc;	
	/**状态1:启用;0禁用*/
	private Integer status;	
	//columns END
	


	public java.lang.Integer getGoodsClassId() {
		return this.goodsClassId;
	}
	
	public void setGoodsClassId(java.lang.Integer value) {
		this.goodsClassId = value;
	}

	public java.lang.String getGoodsName() {
		return this.goodsName;
	}
	
	public void setGoodsName(java.lang.String value) {
		this.goodsName = value;
	}

	public java.lang.String getGoodsImgKey() {
		return this.goodsImgKey;
	}
	
	public void setGoodsImgKey(java.lang.String value) {
		this.goodsImgKey = value;
	}

	public java.lang.String getGoodsDesc() {
		return this.goodsDesc;
	}
	
	public void setGoodsDesc(java.lang.String value) {
		this.goodsDesc = value;
	}

	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}

}

