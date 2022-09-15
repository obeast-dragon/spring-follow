package com.obeast.Bean.springBean_03.support;


import com.obeast.Bean.springBean_03.BeansException;
import com.obeast.Bean.springBean_03.factory.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author wxl
 * Date 2022/9/15 8:46
 * @version 1.0
 * Description:
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

	private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

	@Override
	protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws RuntimeException {
		Object bean = null;
		try {
			bean = createBeanInstance(beanDefinition, beanName, args);
		}catch (Exception e) {
			throw new BeansException("Instantiation of bean failed",e);
		}
		addSingletonBean(beanName, bean);
		return bean;
	}

	protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) throws NoSuchMethodException {
		Constructor<?> constructor = null;
		Class<?> clazz = beanDefinition.getBeanClass();
		Constructor<?>[] declaredConstructor = clazz.getDeclaredConstructors();
		for (Constructor<?> cotr : declaredConstructor) {
			if (cotr != null && cotr.getParameterTypes().length == args.length){
				constructor = cotr;
				break;
			}
		}
		return getInstantiationStrategy().instantiation(beanDefinition, beanName, constructor, args);
	}

	public InstantiationStrategy getInstantiationStrategy() {
		return instantiationStrategy;
	}

	public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
		this.instantiationStrategy = instantiationStrategy;
	}

}
