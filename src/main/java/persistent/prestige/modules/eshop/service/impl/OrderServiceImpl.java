/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.eshop.dao.OrderDao;
import persistent.prestige.modules.eshop.dao.OrderItemDao;
import persistent.prestige.modules.eshop.model.Order;
import persistent.prestige.modules.eshop.model.OrderItem;
import persistent.prestige.modules.eshop.model.OrderVo;
import persistent.prestige.modules.eshop.service.OrderService;
/**
 * Order service实现类
 * @author 雅居乐 2016-8-27 10:27:01
 * @version 1.0
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private OrderItemDao orderItemDao;
	
	

	@Override
	public List<OrderVo> findVos(String buyUid, Integer start, Integer end) {
		return orderDao.findVos(buyUid, start, end);
	}


	@Override
	public Integer saveOrder(Order o, OrderItem item) {
		if(o != null ) {
			orderDao.create(o);
			System.out.println("orderId:" + o.getId());
		}
		
		
		if(item!=null) {
			item.setOrderId(o.getId());
			orderItemDao.create(item);
			System.out.println("orderItemId:" + item.getId());
		}
		
		return 1;
	}
	
	
	
	

}
