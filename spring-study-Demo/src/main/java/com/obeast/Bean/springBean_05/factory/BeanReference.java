package com.obeast.Bean.springBean_05.factory;

/**
 * @author wxl
 * Date 2022/9/15 14:04
 * @version 1.0
 * Description: 类引用
 */
public class BeanReference {

	private final String beanName;

	public BeanReference(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}
}
