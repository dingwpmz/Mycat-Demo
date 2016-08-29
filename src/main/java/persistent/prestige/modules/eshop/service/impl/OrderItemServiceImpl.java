/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.eshop.dao.OrderItemDao;
import persistent.prestige.modules.eshop.service.OrderItemService;
/**
 * OrderItem service实现类
 * @author 雅居乐 2016-8-27 10:31:06
 * @version 1.0
 */
@Service("orderItemService")
/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */
public class OrderItemServiceImpl implements OrderItemService{
	
	@Autowired
	private OrderItemDao orderItemDao;

	@Override
	public Integer saveOrderItem(Map datas) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
