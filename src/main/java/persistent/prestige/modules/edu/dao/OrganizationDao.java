/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.edu.model.Organization;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * Organization DAO类
 * @author 雅居乐 2016-9-10 22:28:24
 * @version 1.0
 */
@Repository("organizationDao")
@MybatisScan
public interface OrganizationDao extends Dao<Organization,java.lang.Integer>{
	

}
