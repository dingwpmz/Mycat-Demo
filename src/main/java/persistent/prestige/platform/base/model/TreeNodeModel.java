package persistent.prestige.platform.base.model;

import java.util.Set;


/**
 * @Title:TreeNodeModel.java
 * @Package persistent.prestige.platform.base.model
 * @Description TODO
 * @author prestigeding
 * @date 2012-12-12 下午10:57:00
 * @version V1.0
 */
public class TreeNodeModel<T extends TreeNodeModel<T>> extends Model implements
		TreeNode<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2454578838490489889L;

	/** 结点ID */
	private Integer nodeId;

	/** 结点名称 */
	private String label;

	/** 结点编码 */
	private String code;

	/** 是否是叶子结点 */
	private String leaf;

	private int orderIndex;

	/** 节点层级，根据节点 为 -1 */
	private int level;

	/** 父结点ID */
	private T parent;

	/** 子结点集合 */
	private Set<T> childs;

	public Integer getNodeId() {
		return nodeId == null || nodeId.intValue() == -1  ? getId() : this.nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public String getUrl() {
		return null;
	}

	public void setUrl(String url) {
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLeaf() {
		return this.leaf;
	}

	public void setLeaf(String leaf) {
		this.leaf = leaf;
	}

	public String getState() {
		if ("1".equals(this.leaf)) {
			return "open";
		} else {
			return "closed";
		}
	}

	public void setState(String state) {
	}

	public T getParent() {
		return parent;
	}

	public void setParent(T parent) {
		this.parent = parent;
	}

	public Set<T> getChilds() {
		return childs;
	}

	public void setChilds(Set<T> childs) {
		this.childs = childs;
	}

	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
