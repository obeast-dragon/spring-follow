package com.obeast.Bean.springBean_02.support;

import com.obeast.Bean.springBean_02.BeanFactory;
import com.obeast.Bean.springBean_02.factory.BeanDefinition;


/**
 * @author wxl
 * Date 2022/9/15 8:38
 * @version 1.0
 * Description: BeanFactory 的实现基类
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
	@Override
	public Object getBean(String beanName) {
		Object singletonBean = getSingleton(beanName);
		if (singletonBean != null) {
			return singletonBean;
		}
		BeanDefinition beanDefinition = getBeanDefinition(beanName);
		return createBean(beanName, beanDefinition);
	}

	/**
	 * Description: 创建Bean
	 * @author wxl
	 * Date: 2022/9/15 8:44
	 * @param beanName the name of the bean
	 * @param beanDefinition the BeanDefinition
	 * @return java.lang.Object
	 */
	protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws RuntimeException;

	/**
	 * Description: 获取BeanDefinition
	 * @author wxl
	 * Date: 2022/9/15 8:44
	 * @param beanName the name of the	bean
	 * @return com.obeast.springOwnTest.springBean_02.factory.BeanDefinition
	 */
	protected abstract BeanDefinition getBeanDefinition(String beanName)throws RuntimeException;
}
