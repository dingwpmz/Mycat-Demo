package persistent.prestige.platform.base.model;

import java.util.Set;

/**
 * 树形结构
 * @Title:TreeNode.java
 * @Package persistent.prestige.platform.base.model
 * @Description TODO
 * @author prestigeding
 * @date 2012-12-12 下午10:51:28
 * @version V1.0
 */

public interface TreeNode<T extends Entity> extends Entity{
	
	public abstract int getOrderIndex();
	public abstract void setOrderIndex(int orderIndex);
	
	public abstract Integer getNodeId();
	public abstract void setNodeId(Integer nodeId);

	public abstract String getLabel();
	public abstract void setLabel(String label);
	
	public abstract String getCode();
	public abstract void setCode(String code);
	
	public abstract String getLeaf();
	public abstract void setLeaf(String leaf);
	
	public int getLevel();
	public void setLevel(int level);
	
	public abstract String getState();
	public abstract void setState(String state);
	
	public abstract String getUrl();
	public abstract void setUrl(String url);
	
	public abstract T getParent();
	public abstract void setParent(T parent);
	
	public abstract Set<T> getChilds();
	public abstract void setChilds(Set<T> childs);
	
}

