package com.obeast.Bean.springBean_03.factory;

/**
 * @author wxl
 * Date 2022/9/15 7:32
 * @version 1.0
 * Description:
 */
public class BeanDefinition {

	private Class<?> beanClass;

	public BeanDefinition(Class<?> beanClass) {
		this.beanClass = beanClass;
	}

	public Class<?> getBeanClass() {
		return beanClass;
	}
}
