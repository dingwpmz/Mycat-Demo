package persistent.prestige.platform.base.model;

import java.io.Serializable;


/**
 * 实体
 * @author prestigeding
 *
 */
public interface Entity extends Serializable {

	public abstract void setId(Integer id);
	
	public abstract Integer getId();
	
	public void setPropValue(String propName, Object value);
	
	public Object getPropValue(String propName);
	
	
}
