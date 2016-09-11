/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.passport.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.passport.model.AccTest;
import persistent.prestige.modules.passport.model.User;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;


/**
 * User DAO类
 * @author 雅居乐 2016-8-27 10:00:04
 * @version 1.0
 */
@Repository("userDao")
@MybatisScan
public interface UserDao extends Dao<User, Integer>{
	
	public List<AccTest> findAccTest();

}
