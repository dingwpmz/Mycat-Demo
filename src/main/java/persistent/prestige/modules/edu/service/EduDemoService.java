package persistent.prestige.modules.edu.service;

import java.util.List;
import java.util.Map;

import persistent.prestige.modules.edu.model.Organization;

public interface EduDemoService {
	
	
	public Map saveLogin(String account, String password);
	
	/**
	 * 查组织机构
	 * @param title
	 * @return
	 */
	public List<Organization> searchOrgs(String title);
	
	
	

}
