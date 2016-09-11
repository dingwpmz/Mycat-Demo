package persistent.prestige.modules.edu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.edu.dao.DemoDao;
import persistent.prestige.modules.edu.model.Organization;
import persistent.prestige.modules.edu.service.EduDemoService2;

@Service("eduDemoService2")
public class EduDemoServiceImpl2 implements EduDemoService2 {
	
	@Autowired
	private DemoDao demoDao;

	@Override
	public Map saveLogin(Integer dbPos,String account, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Organization> searchOrgs(Integer dbPos, String title) {
		// TODO Auto-generated method stub
		return demoDao.searchOrgs(dbPos, title);
	}

	@Override
	public Organization saveOrg(Integer dbPos, String title) {
		// TODO Auto-generated method stub
		Organization o = new Organization();
		o.setTitle(title);
		o.setDbPos(dbPos);
		demoDao.saveOrg(o);
		return o;
		
	}

	
	
	
	

}
