/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.eshop.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import persistent.prestige.modules.eshop.model.Sku;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * Sku DAO类
 * @author 雅居乐 2016-8-31 20:45:42
 * @version 1.0
 */
@Repository("skuDao")
@MybatisScan
public interface SkuDao extends Dao<Sku,java.lang.Integer>{
	
	/**
	 * 更新库存
	 * @param skuId
	 * @param num
	 * @return
	 */
	Integer updateSkuStoreCount(@Param("skuId") Integer skuId, @Param("num") Integer num);
	

}
