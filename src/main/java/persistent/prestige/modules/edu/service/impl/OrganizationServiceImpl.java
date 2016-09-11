/*
 * Powered By agile
 * Web Site: http://www.agile.com
 * Since 2008 - 2016
 */

package persistent.prestige.modules.edu.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import persistent.prestige.modules.edu.dao.OrganizationDao;
import persistent.prestige.modules.edu.service.OrganizationService;

/**
 * beanId     为@Service配置中的名称
 * modelClass 对应实体类的名称
 * type       AwareType.SERVICE
 */
@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService{
	
	@Autowired
	private OrganizationDao organizationDao;
	
	
	
	/**
	 * 保存信息
	 * @param datas
	 * @return
	 */
	@Override
	public Integer saveOrganization(Map datas) {
		return null;
	}

}
