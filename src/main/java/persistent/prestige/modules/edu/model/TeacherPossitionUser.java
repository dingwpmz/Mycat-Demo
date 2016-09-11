/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.model;

import java.beans.Transient;

import persistent.prestige.platform.base.model.AuditableModel;

/**
 * TeacherPossitionUser 实体类
 * @author 雅居乐 2016-9-10 22:39:28
 * @version 1.0
 */
public class TeacherPossitionUser extends AuditableModel{
	
	//alias
	public static final String TABLE_ALIAS = "TeacherPossitionUser";
		
	//columns START
	/**teacherPid*/
	private java.lang.Long teacherPid;	
	/**possionTid*/
	private java.lang.Integer possionTid;	
	/**departId*/
	private java.lang.Integer departId;	
	/**takeDate*/
	private java.util.Date takeDate;	
	/**takeFile*/
	private java.lang.String takeFile;	
	/**takeCause*/
	private java.lang.String takeCause;	
	/**deposeDate*/
	private java.util.Date deposeDate;	
	/**deposeFile*/
	private java.lang.String deposeFile;	
	/**deposeCause*/
	private java.lang.String deposeCause;	
	//columns END
	


	public java.lang.Long getTeacherPid() {
		return this.teacherPid;
	}
	
	public void setTeacherPid(java.lang.Long value) {
		this.teacherPid = value;
	}

	public java.lang.Integer getPossionTid() {
		return this.possionTid;
	}
	
	public void setPossionTid(java.lang.Integer value) {
		this.possionTid = value;
	}

	public java.lang.Integer getDepartId() {
		return this.departId;
	}
	
	public void setDepartId(java.lang.Integer value) {
		this.departId = value;
	}

	public java.util.Date getTakeDate() {
		return this.takeDate;
	}
	
	public void setTakeDate(java.util.Date value) {
		this.takeDate = value;
	}

	public java.lang.String getTakeFile() {
		return this.takeFile;
	}
	
	public void setTakeFile(java.lang.String value) {
		this.takeFile = value;
	}

	public java.lang.String getTakeCause() {
		return this.takeCause;
	}
	
	public void setTakeCause(java.lang.String value) {
		this.takeCause = value;
	}

	public java.util.Date getDeposeDate() {
		return this.deposeDate;
	}
	
	public void setDeposeDate(java.util.Date value) {
		this.deposeDate = value;
	}

	public java.lang.String getDeposeFile() {
		return this.deposeFile;
	}
	
	public void setDeposeFile(java.lang.String value) {
		this.deposeFile = value;
	}

	public java.lang.String getDeposeCause() {
		return this.deposeCause;
	}
	
	public void setDeposeCause(java.lang.String value) {
		this.deposeCause = value;
	}
	
	private TeacherPossition teacherPossition;
	@Transient
	public TeacherPossition getTeacherPossition() {
		return teacherPossition;
	}	
	public void setTeacherPossition(TeacherPossition teacherPossition){
		this.teacherPossition = teacherPossition;
	}
	
	private TeacherUser teacherUser;
	@Transient
	public TeacherUser getTeacherUser() {
		return teacherUser;
	}	
	public void setTeacherUser(TeacherUser teacherUser){
		this.teacherUser = teacherUser;
	}

}

