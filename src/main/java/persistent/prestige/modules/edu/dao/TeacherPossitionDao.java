/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.edu.model.TeacherPossition;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * TeacherPossition DAO类
 * @author 雅居乐 2016-9-10 22:41:36
 * @version 1.0
 */
@Repository("teacherPossitionDao")
@MybatisScan
public interface TeacherPossitionDao extends Dao<TeacherPossition,java.lang.Integer>{
	

}
