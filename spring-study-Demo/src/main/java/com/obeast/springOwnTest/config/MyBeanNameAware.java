package com.obeast.springOwnTest.config;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author wxl
 * Date 2022/8/29 14:59
 * @version 1.0
 * Description:
 */
public class MyBeanNameAware implements BeanNameAware {
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
		System.out.println("setBeanName...");
	}
}
