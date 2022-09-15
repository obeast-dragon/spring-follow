package com.obeast.Bean.springBean_04;

/**
 * @author wxl
 * Date 2022/9/15 14:10
 * @version 1.0
 * Description: 属性值
 */
public class PropertyValue {
	private final String name;

	private final Object value;

	public PropertyValue(String name, Object value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public Object getValue() {
		return value;
	}
}
