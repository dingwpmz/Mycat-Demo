package persistent.prestige.platform.base.model;

import java.util.Date;


public class AuditTreeNodeModel<T extends TreeNodeModel<T>> extends TreeNodeModel<T> implements
		Auditable {

	/** 创建者登录名 */
	private String creator;
	
	/** 创建者用户ID */
	private String createUserId;
	private String updateUserId;

	/** 创建时间 */
	private Date createTime;

	/** 更新者登录名 */
	private String updator;


	/** 更新时间 */
	private Date updateTime;

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	
	

}
