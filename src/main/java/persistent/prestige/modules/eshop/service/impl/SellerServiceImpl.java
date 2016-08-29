/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.eshop.dao.SellerDao;
import persistent.prestige.modules.eshop.service.SellerService;
/**
 * Seller service实现类
 * @author 雅居乐 2016-8-27 10:22:35
 * @version 1.0
 */
@Service("sellerService")
/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */
public class SellerServiceImpl implements SellerService{
	
	@Autowired
	private SellerDao sellerDao;

	@Override
	public Integer saveSeller(Map datas) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
