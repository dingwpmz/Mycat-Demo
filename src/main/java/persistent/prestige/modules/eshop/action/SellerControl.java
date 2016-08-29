/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */


package persistent.prestige.modules.eshop.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import persistent.prestige.modules.eshop.service.SellerService;

/**
 * Seller控制类
 * @author 雅居乐 2016-8-27 10:22:34
 * @version 1.0
 */
@Controller
@RequestMapping("/passport/seller")
public class SellerControl {
	@Autowired
	private SellerService sellerService;
	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	@RequestMapping("/saveSeller")
	@ResponseBody
	public String saveSeller(Map datas) {
		return String.valueOf(sellerService.saveSeller(datas));
	}
	
	
}

