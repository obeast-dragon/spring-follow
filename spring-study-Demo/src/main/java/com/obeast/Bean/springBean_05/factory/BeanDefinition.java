package com.obeast.Bean.springBean_05.factory;

import com.obeast.Bean.springBean_05.PropertyValues;

/**
 * @author wxl
 * Date 2022/9/15 7:32
 * @version 1.0
 * Description:  Bean 注册的过程中是需要传递 Bean 的信息
 */
public class BeanDefinition {

	private Class<?> beanClass;

	private PropertyValues propertyValues;

	public BeanDefinition(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

	//所以为了把属性一定交给 Bean 定义，所以这里填充了 PropertyValues 属性，同时把两个构造函数做了一些简单的优化，避免后面 for 循环时还得判断属性填充是否为空。
	public BeanDefinition(Class<?> beanClass, PropertyValues propertyValues) {
		this.beanClass = beanClass;
		this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
	}

	public void setBeanClass(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public Class<?> getBeanClass() {
		return beanClass;
	}
}
