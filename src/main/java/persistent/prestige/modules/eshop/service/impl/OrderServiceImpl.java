/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.eshop.dao.OrderDao;
import persistent.prestige.modules.eshop.dao.OrderItemDao;
import persistent.prestige.modules.eshop.dao.SkuDao;
import persistent.prestige.modules.eshop.model.Order;
import persistent.prestige.modules.eshop.model.OrderItem;
import persistent.prestige.modules.eshop.model.OrderVo;
import persistent.prestige.modules.eshop.model.Sku;
import persistent.prestige.modules.eshop.service.OrderService;
import persistent.prestige.platform.utils.UUidUtils;
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
	
	@Autowired
	private SkuDao skuDao;
	
	

	@Override
	public Map saveTest() {
		Order order = orderDao.find(10480);
		System.out.println("查询的order信息:" + order);
		
		return new HashMap();
	}


	@Override
	public Map saveCreateOrder(Map params) {
		
		Map result = new HashMap();
		try {
			Integer skuId = (Integer) params.get("skuId");
			Integer num = (Integer)params.get("num");
			
			Integer flag = skuDao.updateSkuStoreCount(skuId, num);
			
			System.out.println("是否可以更新");
			if(flag != null && flag.intValue() > 0) { //可以购买
				String uid = (String)params.get("uid");
				
				Integer goodsId = (Integer) params.get("goodsId");
				Long price = (Long) params.get("price");
				
				Sku sku = skuDao.find(skuId);
				String sellerUid = ""; // 一个固定值，用于测试而已
				
				Order o = new Order();
				o.setBuyUid(uid);
				o.setSellerUid(sellerUid);
				o.setTotalPrice( sku.getPrice() * num );
				o.setOrderNo(UUidUtils.uuid());//由于只是测试，，用uid来保证原子性
				o.setStatus(0);
				o.setCreateTime(new Date(System.currentTimeMillis()));
				orderDao.create(o);
				
				
				OrderItem item = new OrderItem();
				item.setBuyUid(o.getBuyUid());
				item.setGoodsId(goodsId);
				item.setPrice(price);
				item.setNum(num);
				item.setSkuId(skuId);
				item.setTotalPrice( num * price);
				item.setCreateTime(new Date(System.currentTimeMillis()));
				item.setOrderId(o.getId());
				
				orderItemDao.create(item);
				
				result.put("code", 0);
				return result;
				
			} else {
				result.put("code", 1);
				result.put("msg", "库存不够");
				return result;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "系统异常");
			return result;
		}
		
	}


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
