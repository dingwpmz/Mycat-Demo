/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.edu.dao.DepartmentDao;
import persistent.prestige.modules.edu.dao.TeacherUserDao;
import persistent.prestige.modules.edu.model.TeacherUser;
import persistent.prestige.modules.edu.service.DepartmentService;


/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@Autowired
	private TeacherUserDao teacherUserDao;

	@Override
	public Integer saveDepartment(Map datas) {
		// TODO Auto-generated method stub
		
		Map params = new HashMap();
		List<TeacherUser> users = teacherUserDao.query(params);
		
		if(users == null || users.isEmpty() ) {
			System.out.println("没有查询到用户");
		} else {
			for(TeacherUser u : users ) {
				System.out.println("account:" + u.getAccount() + ",username:" + u.getUsername());
			}
		}
		
		
		System.out.println("----查询所有用户----");
		
		List<TeacherUser> users2 = teacherUserDao.findAllUser();
		
		if(users2 == null) {
			System.out.println("全局用户查询为空");
		} else {
			System.out.println("全局用户个数: " + users2.size());
		}
		
		
		return null;
	}
	
	
	
	

}
