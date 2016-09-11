/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.edu.model.GlobalUser;
import persistent.prestige.modules.edu.model.TeacherUser;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * TeacherUser DAO类
 * @author 雅居乐 2016-9-10 22:35:48
 * @version 1.0
 */
@Repository("teacherUserDao")
@MybatisScan
public interface TeacherUserDao extends Dao<TeacherUser,java.lang.Long>{
	
	GlobalUser findGlobalUser(String account);
	
	
	List<TeacherUser> findAllUser();
	

}
