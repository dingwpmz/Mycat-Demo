/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.model;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * Organization 实体类
 * @author 雅居乐 2016-9-10 22:28:24
 * @version 1.0
 */
public class Organization extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "Organization";
		
	//columns START
	/**title*/
	private java.lang.String title;	
	
	private Integer dbPos;
	//columns END
	


	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}

	public Integer getDbPos() {
		return dbPos;
	}

	public void setDbPos(Integer dbPos) {
		this.dbPos = dbPos;
	}

	
	
	

}

