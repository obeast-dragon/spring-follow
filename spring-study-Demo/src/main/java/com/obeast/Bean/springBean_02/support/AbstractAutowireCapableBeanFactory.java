package com.obeast.Bean.springBean_02.support;

import com.obeast.Bean.springBean_02.factory.BeanDefinition;


import java.lang.reflect.InvocationTargetException;

/**
 * @author wxl
 * Date 2022/9/15 8:46
 * @version 1.0
 * Description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

	@Override
	protected Object createBean(String beanName, BeanDefinition beanDefinition) throws RuntimeException {
		Object bean = null;
		try {
			bean = beanDefinition.getBeanClass().getConstructor().newInstance();
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
				 InvocationTargetException e) {
			throw new RuntimeException("Instantiation of bean failed", e);
		}
		addSingletonBean(beanName, bean);
		return bean;
	}

}
