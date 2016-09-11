package persistent.prestige.modules.edu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.edu.dao.TeacherUserDao;
import persistent.prestige.modules.edu.model.GlobalUser;
import persistent.prestige.modules.edu.service.UserSchemeService;

@Service("userSchemService")
public class UserSchemServiceImpl implements UserSchemeService {

	@Autowired
	private TeacherUserDao teacherUserDao;

	@Override
	public String findTenant(String account) {
		GlobalUser user = teacherUserDao.findGlobalUser(account);

		return user == null ? "" : user.getTenant();
	}

	@Override
	public Integer findDbPos(String account) {
		GlobalUser user = teacherUserDao.findGlobalUser(account);

		return user == null ? 0 : user.getDbPos();
	}

}
