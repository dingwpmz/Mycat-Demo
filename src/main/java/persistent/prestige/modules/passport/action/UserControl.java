/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */


package persistent.prestige.modules.passport.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import persistent.prestige.modules.passport.model.User;
import persistent.prestige.modules.passport.service.UserService;
import persistent.prestige.platform.utils.UUidUtils;

/**
 * User控制类
 * @author 雅居乐 2016-8-27 10:00:04
 * @version 1.0
 */
@Controller
@RequestMapping("/passport/user")
public class UserControl{
	@Autowired
	private UserService userService;
	
	/**
	 * 测试批量生成用户信息
	 * @param params
	 * @return
	 */
	@RequestMapping("/saveUser")
	@ResponseBody
	public Map saveUser(Map params) {
		HashMap result = new HashMap();
		try {
//			for(int i =200; i < 500; i ++ ) {
//				User u = new User();
//				u.setCreateTime(new Date(System.currentTimeMillis()));
//				u.setUid(UUidUtils.uuid());
//				u.setName("test" + i);
//				u.setEmail(u.getName()+"@163.com");
//	            u.setPhone("18620800" + i);
//	            u.setStatus(1);
//	            userService.saveUser(u);
//			}
			
			
		//	userService.saveTest();
			
			userService.listTest();
			
			
			
			result.put("code", 0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "系统异常");
			
		}
		
		return result;
		
	}
	
	
}

