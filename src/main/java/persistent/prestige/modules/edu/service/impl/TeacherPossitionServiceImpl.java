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

import persistent.prestige.modules.edu.dao.TeacherPossitionDao;
import persistent.prestige.modules.edu.model.TeacherPossition;
import persistent.prestige.modules.edu.service.TeacherPossitionService;
import persistent.prestige.platform.base.dao.Dao;

/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */
@Service("teacherPossitionService")
public class TeacherPossitionServiceImpl  implements TeacherPossitionService{
	
	@Autowired
	private TeacherPossitionDao teacherPossitionDao;
	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	@Override
	public Integer saveTeacherPossition(Map datas) {
		return null;
	}

}
