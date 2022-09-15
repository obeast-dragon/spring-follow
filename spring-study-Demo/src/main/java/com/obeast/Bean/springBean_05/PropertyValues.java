package com.obeast.Bean.springBean_05;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wxl
 * Date 2022/9/15 14:10
 * @version 1.0
 * Description: 属性值集合
 */
public class PropertyValues {

	private final List<PropertyValue> propertyValueList  = new ArrayList<>();

	public void addPropertyValue(PropertyValue propertyValue) {
		this.propertyValueList.add(propertyValue);
	}

	public PropertyValue[] getPropertyValues() {
		//传值是为了防止NullPointerException
		return this.propertyValueList.toArray(new PropertyValue[0]);

	}

	public PropertyValue getPropertyValue(String propertyName) {
		for (PropertyValue propertyValue : this.propertyValueList) {
			if (propertyValue.getName().equals(propertyName)){
				return propertyValue;
			}
		}
		return null;
	}

}
