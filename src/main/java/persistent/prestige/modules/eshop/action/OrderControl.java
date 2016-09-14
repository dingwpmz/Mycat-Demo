/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */


package persistent.prestige.modules.eshop.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import persistent.prestige.modules.common.tenant.TenantContextHolder;
import persistent.prestige.modules.eshop.model.Order;
import persistent.prestige.modules.eshop.model.OrderItem;
import persistent.prestige.modules.eshop.model.OrderVo;
import persistent.prestige.modules.eshop.service.OrderService;
import persistent.prestige.modules.passport.dao.UserDao;
import persistent.prestige.modules.passport.model.User;

/**
 * Order控制类
 * @author 雅居乐 2016-8-27 10:27:01
 * @version 1.0
 */
@Controller
@RequestMapping("/passport/order")
public class OrderControl {
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserDao userDao;
	
	
	/**
	 * 创建订单
	 * @param params
	 * @return
	 */
	@RequestMapping("createOrder")
	@ResponseBody
	public Map createOrder(Map params) {
		
		Map result = new HashMap();
		
		orderService.saveTest();
		result.put("code", 0);
		result.put("msg", "test");
		return result; 
		
	}
	
	
	@RequestMapping("/orders")
	@ResponseBody
	public Map orders(Map datas) {
		Map result = new HashMap();
		try {
			List<OrderVo> ovs = orderService.findVos("506561911b44419daafea30e6e09c0e3", 0, 10);
			result.put("code", 0);
			result.put("data", ovs);
		} catch(Throwable e) {
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "系统异常");
		}
		
		return result;
		
	}
	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	@RequestMapping("/saveOrder")
	@ResponseBody
	public Map saveOrder(Map datas) {
		//return String.valueOf(orderService.saveOrder(datas));
		Map result = new HashMap();
		try {
			String[] buyUids = new String[] {

			"66bc75ecbdd943a59447be9ba3b79996",
					"ab11c2d26a55405ea59958d1e39f2240",
					"5b8b71e2d1944ca088de17dc3ff7108d",
					"5894be59bdf34180b75978c73aaa61d4",
					"e6383a9755ec458ea1f08f9c0e3ed185",
					"4b6b5fc07e6443e6ab8eaedc8226628a",
					"51ddd1aaffac45b68566c6a3c1f24d3b",
					"3a6bf34061f44bbbb4247f888e3b1c2e" };
			
			
			
			
			
			
			
			String[] sellerUids = new String[]{
					"4720bb3aa71e48d0bb6a461249b1957c",
					"07e3e77cdba741ed9b8373abfd95be7f",
					"b31f6e360be54bea9e92fb8caa10d3f5",
					"a9c39aa762994ad8ac45b0cb74502006",
					"a6e5c466c8c349f38855678937af323b"
			};
			
			
			Map params = new HashMap();
			params.put("start", 0);
			params.put("end", 200);
			
			List<User> users = userDao.query(params);
			
			//产生一百张订单
			for(int i = 0, len = users.size()  ;i<len; i++) {
				Order o = new Order();
				o.setOrderNo(times() + onum((i+""), 5));
				o.setBuyUid( users.get(i).getUid());
			//	o.setBuyUid( UUidUtils.uuid() );
				o.setSellerUid("4f3c0b8637b9459fb55001f0623cb940");
				o.setTotalPrice(10000L);
				o.setStatus(1);
				o.setCreateTime(new Date(System.currentTimeMillis()));
				
		//		orderService.saveOrder(o, null);
				
				OrderItem item = new OrderItem();
				item.setBuyUid(o.getBuyUid());
				item.setGoodsId(1);
				item.setPrice(5000L);
				item.setNum(1);
				item.setTotalPrice(5000L);
				item.setCreateTime(new Date(System.currentTimeMillis()));
		//		item.setOrderId(o.getId());
				
				orderService.saveOrder(o, item);
				
				try {
					Thread.sleep(randSleep());
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			
			}
			
			result.put("code", 0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result.put("code", 1);
			result.put("msg", "系统异常");
			
		}
		return result;
		
	}
	
	
	private long randSleep() {
		Random random = new Random();
		return (random.nextInt(5) + 1) * 5000;
	}
	
	
	private String onum(String num, int l) {
		if(num.length() < l ) {
			for(int i =0, size = l-num.length(); i < size; i++) {
				num = "0" + num;
			}
		}
		return num;
	}
	
	private String times() {
		return (new Date(System.currentTimeMillis())).getTime() + "";
	}
	
	
}

