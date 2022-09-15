package com.obeast.Bean.springBean_03.support;

import com.obeast.Bean.springBean_03.factory.BeanDefinition;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wxl
 * Date 2022/9/15 11:20
 * @version 1.0
 * Description: JDK 实例化
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{


	@Override
	public Object instantiation(BeanDefinition beanDefinition, String beanName, Constructor<?> constructor, Object[] args) {

		Class clazz = beanDefinition.getBeanClass();
		try{
			if (constructor != null){
				//有参构造
				return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
			}
			else {
				//无参构造
				return clazz.getDeclaredConstructor().newInstance();
			}
		} catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}
