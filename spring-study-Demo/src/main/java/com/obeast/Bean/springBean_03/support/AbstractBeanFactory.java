package com.obeast.Bean.springBean_03.support;

import com.obeast.Bean.springBean_03.BeanFactory;
import com.obeast.Bean.springBean_03.BeansException;
import com.obeast.Bean.springBean_03.factory.BeanDefinition;


/**
 * @author wxl
 * Date 2022/9/15 8:38
 * @version 1.0
 * Description: BeanFactory 的实现基类
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
	@Override
	public Object getBean(String beanName) {
		return doGetBean(beanName, null);
	}

	@Override
	public Object getBean(String beanName, Object... args) {
		return doGetBean(beanName, args);
	}

	private <T> T doGetBean(String beanName, Object[] args) {
		Object bean = getSingleton(beanName);
		if (bean != null) {
			return (T) bean;
		}
		BeanDefinition beanDefinition = getBeanDefinition(beanName);
		return (T) createBean(beanName, beanDefinition, args);

	}

	/**
	 * Description: 创建Bean
	 * @author wxl
	 * Date: 2022/9/15 8:44
	 * @param beanName the name of the bean
	 * @param beanDefinition the BeanDefinition
	 * @return java.lang.Object
	 */
	protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;

	/**
	 * Description: 获取BeanDefinition
	 * @author wxl
	 * Date: 2022/9/15 8:44
	 * @param beanName the name of the	bean
	 * @return com.obeast.springOwnTest.springBean_02.factory.BeanDefinition
	 */
	protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
