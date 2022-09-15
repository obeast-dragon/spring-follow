package com.obeast.Bean.springBean_03.support;

import com.obeast.Bean.springBean_03.factory.BeanDefinition;

/**
 * @author wxl
 * Date 2022/9/15 9:00
 * @version 1.0
 * Description:
 */
public interface BeanDefinitionRegistry {

	void registerBeanDefinition(String beanName, BeanDefinition definition);
}
