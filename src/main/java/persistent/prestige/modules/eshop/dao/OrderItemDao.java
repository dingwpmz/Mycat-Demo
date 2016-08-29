/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.eshop.model.OrderItem;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * OrderItem DAO类
 * @author 雅居乐 2016-8-27 10:31:06
 * @version 1.0
 */
@Repository("orderItemDao")
@MybatisScan
public interface OrderItemDao extends Dao<OrderItem,java.lang.Integer>{
	

}
