/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.eshop.model.Seller;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * Seller DAO类
 * @author 雅居乐 2016-8-27 10:22:34
 * @version 1.0
 */
@Repository("sellerDao")
@MybatisScan
public interface SellerDao extends Dao<Seller,java.lang.Integer>{
	

}
