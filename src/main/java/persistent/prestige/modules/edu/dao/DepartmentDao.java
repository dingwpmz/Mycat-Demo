/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.dao;

import org.springframework.stereotype.Repository;

import persistent.prestige.modules.edu.model.Department;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;

/**
 * Department DAO类
 * @author 雅居乐 2016-9-10 22:21:19
 * @version 1.0
 */
@Repository("departmentDao")
@MybatisScan
public interface DepartmentDao extends Dao<Department,java.lang.Integer>{
	

}
