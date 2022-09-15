package com.obeast.Bean.springBean_03.support;

import com.obeast.Bean.springBean_03.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author wxl
 * Date 2022/9/15 10:51
 * @version 1.0
 * Description: 实例化策略
 */
public interface InstantiationStrategy {

	Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args);
}
