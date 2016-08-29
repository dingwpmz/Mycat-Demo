package persistent.prestige.platform.base.model;

import java.util.Date;

/**
 * 审计接口（创建与更新信息)
 * @author prestigeding
 *
 */
public interface Auditable {
	/**常量: 创建者登录名*/
	public static final String FIELD_CREATOR = "creator";
	/**常量: 创建者用户ID*/
	public static final String FIELD_CREATE_USER_ID = "createUserId";
	/**常量: 创建时间*/
	public static final String FIELD_CREATE_TIME = "createTime";
	
	/**常量: 更新者登录名*/
	public static final String FIELD_UPDATOR = "updator";
	/** 常量:更新者用户ID*/
	public static final String FIELD_UPDATE_USER_ID = "updateUserId";
	/**常量: 更新时间*/
	public static final String FIELD_UPDATE_TIME = "updateTime";
	
	public String getCreator();
	public void setCreator(String creator);

	public Date getCreateTime();
	public void setCreateTime(Date createTime);

	public String getUpdator();
	public void setUpdator(String updator);
	
	public Date getUpdateTime();
	public void setUpdateTime(Date updateTime);

}
