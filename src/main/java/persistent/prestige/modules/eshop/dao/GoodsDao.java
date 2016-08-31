/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.eshop.model.Goods;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * Goods DAO类
 * @author 雅居乐 2016-8-31 20:41:39
 * @version 1.0
 */
@Repository("goodsDao")
@MybatisScan
public interface GoodsDao extends Dao<Goods,java.lang.Integer>{
	

}
