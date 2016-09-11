package persistent.prestige.modules.edu.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.edu.dao.OrganizationDao;
import persistent.prestige.modules.edu.dao.TeacherUserDao;
import persistent.prestige.modules.edu.model.Organization;
import persistent.prestige.modules.edu.model.TeacherUser;
import persistent.prestige.modules.edu.service.EduDemoService;

@Service("eduDemoService")
public class EduDemoServiceImpl implements EduDemoService {
	
	@Autowired
	private TeacherUserDao teacherUserDao;
	
	@Autowired
	private OrganizationDao organizationDao;

	@Override
	public Map saveLogin(String account, String password) {
		Map result = new HashMap();
		try {
			// TODO Auto-generated method stub
			Map params = new HashMap();
			params.put("account", account);
			params.put("password", password);
			
			
			Map data = new HashMap();
			List<TeacherUser> users = teacherUserDao.query(params);
			if(users == null || users.isEmpty()) {
				result.put("code", 1);
				result.put("msg", "用户名错误");
				return result;
			}
			
			
			TeacherUser user = users.get(0);
			data.put("id", user.getId());
			data.put("account", user.getAccount());
			result.put("code", 0);
			result.put("data", data);
			return result;
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "用户名错误");
			return result;
		}
		
	}

	@Override
	public List<Organization> searchOrgs(String title) {
		Map params = new HashMap();
		params.put("title", title);
		return organizationDao.query(params);
	}
	

}
