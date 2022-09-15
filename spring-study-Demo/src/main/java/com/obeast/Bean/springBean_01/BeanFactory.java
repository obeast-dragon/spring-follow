package com.obeast.Bean.springBean_01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wxl
 * Date 2022/9/15 7:33
 * @version 1.0
 * Description:
 */
public class BeanFactory {

	private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

	public Object getBean(String name) {
		return beanDefinitionMap.get(name).getBean();
	}

	public void registerBeanDefinition(String name, BeanDefinition definition) {
		beanDefinitionMap.put(name, definition);
	}
}
