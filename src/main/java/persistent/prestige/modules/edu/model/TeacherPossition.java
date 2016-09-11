/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.model;

import java.beans.Transient;
import java.util.HashSet;
import java.util.Set;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * TeacherPossition 实体类
 * @author 雅居乐 2016-9-10 22:41:36
 * @version 1.0
 */
public class TeacherPossition extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "TeacherPossition";
		
	//columns START
	/**title*/
	private java.lang.String title;	
	/**delFlag*/
	private java.lang.Integer delFlag;	
	/**remark*/
	private java.lang.String remark;	
	//columns END
	


	public java.lang.String getTitle() {
		return this.title;
	}
	
	public void setTitle(java.lang.String value) {
		this.title = value;
	}

	public java.lang.Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(java.lang.Integer value) {
		this.delFlag = value;
	}

	public java.lang.String getRemark() {
		return this.remark;
	}
	
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	private Set teacherPossitionUsers = new HashSet(0);
	@Transient
	public Set<TeacherPossitionUser> getTeacherPossitionUsers() {
		return teacherPossitionUsers;
	}	
	public void setTeacherPossitionUsers(Set<TeacherPossitionUser> teacherPossitionUser){
		this.teacherPossitionUsers = teacherPossitionUser;
	}

}

