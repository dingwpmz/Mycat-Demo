/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.passport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.passport.dao.UserDao;
import persistent.prestige.modules.passport.model.User;
import persistent.prestige.modules.passport.service.UserService;
/**
 * User service实现类
 * @author 雅居乐 2016-8-27 10:00:05
 * @version 1.0
 */
@Service("userService")
/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public Integer saveUser(User user) {
		userDao.create(user);
		return user.getId();
	}
	

}
