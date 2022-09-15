package com.obeast.Bean.springBean_05.support;


import com.obeast.Bean.springBean_05.factory.BeanDefinition;

/**
 * @author wxl
 * Date 2022/9/15 9:00
 * @version 1.0
 * Description: 提供bean接口注册的方法
 */
public interface BeanDefinitionRegistry {

	void registerBeanDefinition(String beanName, BeanDefinition definition);
}
