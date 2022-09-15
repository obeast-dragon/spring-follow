package com.obeast.Bean.springBean_03.support;


import com.obeast.Bean.springBean_03.factory.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxl
 * Date 2022/9/15 8:58
 * @version 1.0
 * Description:
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

	private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition definition) {
		beanDefinitionMap.put(beanName, definition);
	}

	@Override
	protected BeanDefinition getBeanDefinition(String beanName) throws RuntimeException {
		BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
		if (beanDefinition == null) {
			throw new RuntimeException("No bean named '" + beanName + "' is defined");
		}
		return beanDefinition;
	}
}
