/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.edu.model.TeacherPossitionUser;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * TeacherPossitionUser DAO类
 * @author 雅居乐 2016-9-10 22:39:28
 * @version 1.0
 */
@Repository("teacherPossitionUserDao")
@MybatisScan
public interface TeacherPossitionUserDao extends Dao<TeacherPossitionUser,java.lang.Long>{
	

}
