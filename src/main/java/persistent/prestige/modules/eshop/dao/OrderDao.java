/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import persistent.prestige.modules.eshop.model.Order;
import persistent.prestige.modules.eshop.model.OrderVo;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * Order DAO类
 * 
 * @author 雅居乐 2016-8-27 10:27:01
 * @version 1.0
 */
@Repository("orderDao")
@MybatisScan
public interface OrderDao extends Dao<Order, java.lang.Integer> {

	List<OrderVo> findVos(@Param("buyUid") String buyUid,
			@Param("start") Integer start, @Param("end") Integer end);

}
