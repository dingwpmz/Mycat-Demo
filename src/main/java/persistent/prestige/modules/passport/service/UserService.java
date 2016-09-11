/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.passport.service;


import persistent.prestige.modules.passport.model.User;
/**
 * User service类
 * @author 雅居乐 2016-8-27 10:00:05
 * @version 1.0
 */
public interface UserService  {	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	Integer saveUser(User user);
	
	/**
	 * 测试带事务的
	 * @return
	 */
	Integer saveTest();
	
	/**
	 * 测试非事务的
	 * @return
	 */
	Integer listTest();
}
