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
 * TeacherUser 实体类
 * @author 雅居乐 2016-9-10 22:35:48
 * @version 1.0
 */
public class TeacherUser extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "TeacherUser";
		
	//columns START
	/**account*/
	private java.lang.String account;	
	/**password*/
	private java.lang.String password;	
	/**username*/
	private java.lang.String username;	
	/**sex*/
	private java.lang.Integer sex;	
	/**delFlag*/
	private java.lang.Integer delFlag;	
	//columns END
	


	public java.lang.String getAccount() {
		return this.account;
	}
	
	public void setAccount(java.lang.String value) {
		this.account = value;
	}

	public java.lang.String getPassword() {
		return this.password;
	}
	
	public void setPassword(java.lang.String value) {
		this.password = value;
	}

	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String value) {
		this.username = value;
	}

	public java.lang.Integer getSex() {
		return this.sex;
	}
	
	public void setSex(java.lang.Integer value) {
		this.sex = value;
	}

	public java.lang.Integer getDelFlag() {
		return this.delFlag;
	}
	
	public void setDelFlag(java.lang.Integer value) {
		this.delFlag = value;
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

