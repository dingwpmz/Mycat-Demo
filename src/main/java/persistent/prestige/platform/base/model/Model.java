package persistent.prestige.platform.base.model;

/**
 * @Title:Model.java
 * @Package persistent.prestige.platform.base.model
 * @Description TODO
 * @author prestigeding
 * @date May 20, 2013 11:14:53 PM
 * @version V1.0
 */

public class Model implements Entity {
	
	private Integer id;
	
	public Model(){
	}
	
	public Model(Model model){
		this.id = model.id;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/** 设置值 */
	public void setPropValue(String propName, Object value) {
		// TODO Auto-generated method stub
		
	}

	// 获取实体 属性名为 propName 的值
	public Object getPropValue(String propName) {
		return null;
	}
	
	/** 列举实体类属性和值. */
	/*
    public String toString() {
        //        return ToStringBuilder.reflectionToString(this,
        //            ToStringStyle.MULTI_LINE_STYLE);
        StringBuffer result = new StringBuffer();

        PropertyDescriptor[] descriptorArray = PropertyUtils.getPropertyDescriptors(this);

//        for (PropertyDescriptor aDescriptorArray : descriptorArray) {
          PropertyDescriptor aDescriptorArray=null;
          for (int i = 0;i<descriptorArray.length;i++) {
        	aDescriptorArray = descriptorArray[i];
            String propName = aDescriptorArray.getName();
            Class propType = aDescriptorArray.getPropertyType();

            if (propType == null) {
                continue;
            }

            if ("class".equals(propName)) {
                continue;
            }

            if (!PropertyUtils.isReadable(this, propName)) {
                continue;
            }

            if (Collection.class.isAssignableFrom(propType)
                    || Model.class.isAssignableFrom(propType)) {
                result.append('\n').append(propName).append('(').append(propType.getName())
                        .append(')').append("IGNORED");
            } else {
                Object propValue;

                try {
                    propValue = PropertyUtils.getProperty(this, propName);
                } catch (Exception e) {
                    propValue = "error when getting property:" + e.getMessage();
                }

                result.append('\n').append(propName).append(':').append(propValue);
            }
        }

        return result.toString();
    }
	*/
	
	
}

