/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.eshop.model.SkuItem;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * SkuItem DAO类
 * @author 雅居乐 2016-8-31 20:47:08
 * @version 1.0
 */
@Repository("skuItemDao")
@MybatisScan
public interface SkuItemDao extends Dao<SkuItem,java.lang.Integer>{
	

}
