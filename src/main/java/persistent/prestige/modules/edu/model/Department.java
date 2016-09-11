/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * Department 实体类
 * @author 雅居乐 2016-9-10 22:21:19
 * @version 1.0
 */
public class Department extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "Department";
		
	//columns START
	/**title*/
	private java.lang.String title;	
	//columns END
	
	
	


	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}

}

