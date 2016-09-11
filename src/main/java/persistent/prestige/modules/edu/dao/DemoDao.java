package persistent.prestige.modules.edu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import persistent.prestige.modules.edu.model.Organization;
import persistent.prestige.modules.edu.model.TeacherUser;
import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.dao.Dao;


@Repository("demoDao")
@MybatisScan
public interface DemoDao extends Dao {
	
	/** 查询用户新 */
	TeacherUser findUser(@Param("dbPos") Integer dbPos, @Param("account") String account, @Param("password") String password);
	
	List<Organization> searchOrgs(@Param("dbPos") Integer dbPos, @Param("title") String title);
	
	/** 保存机构*/
	void saveOrg(Organization org);
	

}
