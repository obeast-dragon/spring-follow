package com.obeast.Bean.springBean_02.support;

import com.obeast.Bean.springBean_02.factory.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wxl
 * Date 2022/9/15 8:35
 * @version 1.0
 * Description: SingletonBeanRegistry的实现
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

	private Map<String, Object> stringObject = new HashMap<>();

	@Override
	public Object getSingleton(String beanName) {
		return stringObject.get(beanName);
	}

	protected void addSingletonBean(String beanName, Object bean) {
		stringObject.put(beanName, bean);
	}
}
