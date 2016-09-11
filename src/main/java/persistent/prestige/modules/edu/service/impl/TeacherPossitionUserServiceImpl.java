/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.service.impl;

import java.io.Serializable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.edu.dao.TeacherPossitionUserDao;
import persistent.prestige.modules.edu.model.TeacherPossitionUser;
import persistent.prestige.modules.edu.service.TeacherPossitionUserService;
import persistent.prestige.platform.base.dao.Dao;


/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */
@Service("teacherPossitionUserService")
public class TeacherPossitionUserServiceImpl implements TeacherPossitionUserService{
	
	@Autowired
	private TeacherPossitionUserDao teacherPossitionUserDao;
	
	
	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	@Override
	public Integer saveTeacherPossitionUser(Map datas) {
		return null;
	}

}
