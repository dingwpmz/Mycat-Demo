package persistent.prestige.modules.edu.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import persistent.prestige.modules.common.tenant.TenantContextHolder;
import persistent.prestige.modules.edu.model.Organization;
import persistent.prestige.modules.edu.service.EduDemoService2;
import persistent.prestige.modules.edu.service.UserSchemeService;

/**
 * 多租户，但逻辑库
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/edu/demo2")
public class EduControl2 {
	
	@Autowired
	private EduDemoService2 eduDemoService;
	
	@Autowired
	private UserSchemeService userSchemeService;

	
//	/**
//	 * 登录方法
//	 * @param account
//	 * @param password
//	 * @return
//	 */
//	@RequestMapping("/login")
//	@ResponseBody
//	public Map login(String account, String password) {
//		
//		Map result = new HashMap();
//		try {
//			//第一步，，先获取 用户tenant 
//			String tenant = userSchemeService.findTenant(account);//此处，可以考虑放入redis缓存中
//			//此处不需要担心默认库，因为，默认会走  jdbc.url=jdbc:mysql://localhost:8066/h_xsgjzx?characterEncoding=UTF8&allowMultiQueries\=true
//			//登录方法，特殊，需要处理 tenant 
//			result = eduDemoService.saveLogin(tenant, account, password);
//			return result;
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			result.put("msg", "系统异常");
//			result.put("code", 1);
//		}
//		
//		return result;
//				
//	}
	
	/**
	 * 查询组织机构
	 * @param account
	 * @param password
	 * @return
	 */
	@RequestMapping("/searchOrg")
	@ResponseBody
	public Map searchOrgs(Integer dbPos, String title) {
		Map result = new HashMap();
		try {
			List<Organization> orgs = eduDemoService.searchOrgs(dbPos, title);
			result.put("code", 0);
			result.put("data", orgs);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "系统错误");
			return result;
		}
	}
	
	
	/**
	 * 查询组织机构
	 * @param account
	 * @param password
	 * @return
	 */
	@RequestMapping("/saveOrg")
	@ResponseBody
	public Map saveOrg(Integer dbPos, String title) {
		Map result = new HashMap();
		try {
			Organization org = new Organization();
			org.setTitle(title);
			org.setDbPos(dbPos);
			org = eduDemoService.saveOrg(dbPos, title);
			result.put("code", 0);
			result.put("data", org);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "系统错误");
			return result;
		}
	}
	
}
