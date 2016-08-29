package persistent.prestige.platform.base.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import persistent.prestige.platform.api.annotation.MybatisScan;
import persistent.prestige.platform.base.model.Entity;

/**
 * @Title: 
 * @Package com.agile.platform.base.dao
 * @Description: 
 * @author dingw prestigeding@126.com
 * @date 2015年7月15日 上午11:57:54
 * @version V1.0
 */
@MybatisScan
public interface Dao<T extends Entity, PK extends Serializable> extends Serializable {
	/**
	 * 根据主键查找
	 * @param id
	 * @return
	 */
	T find(PK id);
	
	/**
	 *
	 * @param ids
	 * @return
	 */
	List<T> findByIds(PK[] ids);
	
	/**
	 * 根据查询条件查找 
	 * @param params
	 * @return
	 */
	List<T> query(Map params);
	
	/**
	 * 查询总数
	 * @return
	 */
	Long countAll();
	
	/**
	 * 查询总数
	 * @return
	 */
	Long count(Map params);
	
	/**
	 * 增加新实体
	 * 主键值会自动填充到entity
	 * @param entity
	 */
	void create(Object entity);
	
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	int update(Object entity);


	/**
	 * 根据ID 删除实体
	 * 
	 * @param id
	 */
	void deleteById(PK id);
	
	/**
	 * 此处不想设计成 T entity,主要是考虑在前端需要创建对象实体，设计成Map,灵活性更高
	 * @param entity
	 */
	void delete(Map params);
	
	/** 树型节点 方法  start */
	T findRoot();
	
	List<T> findRoots(Map params);
	
	/**
	 * 根据code 获取所有节点（包括子孙节点）
	 * @param code
	 * @return
	 */
	List<T> findAllChilds(String code);
	
	/**
	 * 根据父节点获取所有直接子节点
	 * @param parentId
	 * @return
	 */
	List<T> findChilds(Integer parentId);
	/** 树型节点 方法  end */
	
	void createExcelBatch(List<Map> datas);
	
	
}
