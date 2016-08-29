/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.passport.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * User 实体类
 * @author 雅居乐 2016-8-27 10:00:05
 * @version 1.0
 */
public class User extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "User";
		
	//columns START
	/**用户uid*/
	private java.lang.String uid;	
	/**名称*/
	private java.lang.String name;	
	/**邮箱*/
	private java.lang.String email;	
	/**电话号码*/
	private java.lang.String phone;	
	/**0:禁用;1:启用*/
	private Integer status;	
	//columns END
	


	public java.lang.String getUid() {
		return this.uid;
	}
	
	public void setUid(java.lang.String value) {
		this.uid = value;
	}

	public java.lang.String getName() {
		return this.name;
	}
	
	public void setName(java.lang.String value) {
		this.name = value;
	}

	public java.lang.String getEmail() {
		return this.email;
	}
	
	public void setEmail(java.lang.String value) {
		this.email = value;
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

