package persistent.prestige.modules.eshop.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import persistent.prestige.modules.eshop.service.EsDataInitService;

/**
 * 电商平台数据初始化
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/es/data")
public class EshopDataInitControl {
	
	@Autowired
	private EsDataInitService esDataInitService;
	
	
	@RequestMapping("/initGoods")
	@ResponseBody
	public Map initGoods() {
		Map result = new HashMap();
		try {
			esDataInitService.saveInitGoodsData();
			result.put("code", 0);
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("code", 1);
		}
		return result;
		
		
	}

}
