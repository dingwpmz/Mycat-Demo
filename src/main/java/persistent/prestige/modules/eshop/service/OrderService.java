/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.service;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import persistent.prestige.modules.eshop.model.Order;
import persistent.prestige.modules.eshop.model.OrderItem;
import persistent.prestige.modules.eshop.model.OrderVo;

/**
 * Order service类
 * @author 雅居乐 2016-8-27 10:27:01
 * @version 1.0
 */
public interface OrderService {	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	Integer saveOrder(Order o, OrderItem item);
	
	List<OrderVo> findVos(@Param("buyUid") String buyUid,
			@Param("start") Integer start, @Param("end") Integer end);
	
	
	/**
	 * 创建订单
	 * @param params
	 * @return
	 */
	Map saveCreateOrder(Map params);
	
	Map saveTest();
}
