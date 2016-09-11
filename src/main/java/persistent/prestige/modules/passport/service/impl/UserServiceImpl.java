/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.passport.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.passport.dao.UserDao;
import persistent.prestige.modules.passport.model.AccTest;
import persistent.prestige.modules.passport.model.User;
import persistent.prestige.modules.passport.service.UserService;
import persistent.prestige.platform.utils.UUidUtils;
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
	public Integer saveTest() {

		/** 测试在事务中，，读走 写节点 start */
		// User u = userDao.find(113);
		// System.out.println(u.getId());
		/** 测试在事务中，，读走 写节点 end */

		/** 测试Mycat 事务 */

		User u = new User();
		u.setCreateTime(new Date(System.currentTimeMillis()));
		u.setUid(UUidUtils.uuid());
		u.setName("dw01");
		u.setEmail(u.getName() + "@163.com");
		u.setPhone("15920500330");
		u.setStatus(1);
		userDao.create(u);
		System.out.println("u.getId:" + u.getId());
		
		int b = 1 / 0;//抛出异常，测试回滚
		
		return null;
	}

	



	@Override
	public Integer listTest() {
//		Map params = new HashMap();
//		params.put("uid", "d81063a03d3249adb0b0c52868b8183f");
//		
//		List<User> users = userDao.query(params);
//		
//		System.out.println("users:" + ( (users == null || users.isEmpty()) ? "为空" : "" + users.size() ));
//		
		
//	User u = userDao.find(113);

//		System.out.println(u.getId());
		
		List<AccTest> accTests = userDao.findAccTest();
		if(accTests == null || accTests.isEmpty()) {
			System.out.println("为空");
		} else {
			System.out.println(accTests.size());
			System.out.println(accTests.get(0).getName());
		}
		
		return null;
	}





	@Override
	public Integer saveUser(User user) {
		userDao.create(user);
		return user.getId();
	}
	

}
