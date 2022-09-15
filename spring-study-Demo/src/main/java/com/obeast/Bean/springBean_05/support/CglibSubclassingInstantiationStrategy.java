package com.obeast.Bean.springBean_05.support;

import com.obeast.Bean.springBean_05.factory.BeanDefinition;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

import java.lang.reflect.Constructor;

/**
 * @author wxl
 * Date 2022/9/15 11:35
 * @version 1.0
 * Description:
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
	@Override
	public Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(beanDefinition.getBeanClass());
		enhancer.setCallback(new NoOp() {
			@Override
			public int hashCode() {
				return super.hashCode();
			}
		});
		if (constructor != null) {
			return enhancer.create(constructor.getParameterTypes(), args);
		}
		return enhancer.create();
	}
}
