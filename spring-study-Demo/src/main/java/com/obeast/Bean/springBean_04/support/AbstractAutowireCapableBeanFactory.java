package com.obeast.Bean.springBean_04.support;


import cn.hutool.core.bean.BeanUtil;
import com.obeast.Bean.springBean_04.BeansException;
import com.obeast.Bean.springBean_04.PropertyValue;
import com.obeast.Bean.springBean_04.PropertyValues;
import com.obeast.Bean.springBean_04.factory.BeanDefinition;
import com.obeast.Bean.springBean_04.factory.BeanReference;

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
			//有属性才注入
			if (beanDefinition.getPropertyValues() != null){
				//注入属性
				applyPropertyValues(beanName, bean, beanDefinition);
			}

		}catch (Exception e) {
			throw new BeansException("Instantiation of bean failed",e);
		}
		addSingletonBean(beanName, bean);
		return bean;
	}

	/**
	 * Description: 属性注入
	 * @author wxl
	 * Date: 2022/9/15 14:36
	 * @param beanName the name of the bean
	 * @param bean the bean
	 * @param beanDefinition the bean definition
	 */
	protected void applyPropertyValues(String beanName, Object bean, BeanDefinition beanDefinition) {
		try {
			PropertyValues propertyValues = beanDefinition.getPropertyValues();
			for (PropertyValue pv : propertyValues.getPropertyValues()) {
				String name = pv.getName();
				Object value = pv.getValue();

				if (value instanceof BeanReference){
					// A 依赖 B，获取 B 的实例化
					BeanReference beanReference = (BeanReference) value;
					value = getBean(beanReference.getBeanName());
				}
				//属性填充
				BeanUtil.setFieldValue(bean, name, value);
			}
		}catch (Exception e){
			throw new BeansException("Error setting property values：" + beanName);
		}
	}

	/**
	 * Description: 实例化bean
	 * @author wxl
	 * Date: 2022/9/15 14:36
	 * @param beanDefinition the bean definition
	 * @param beanName the name of the bean
	 * @param args the arguments to the bean
	 * @return java.lang.Object
	 */
	protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args)  {
		Constructor<?> constructor = null;
		Class<?> clazz = beanDefinition.getBeanClass();
		Constructor<?>[] declaredConstructor = clazz.getDeclaredConstructors();
		for (Constructor<?> cotr : declaredConstructor) {
			if (args != null && cotr != null && cotr.getParameterTypes().length == args.length){
				constructor = cotr;
				break;
			}
		}
		return getInstantiationStrategy().instantiation(beanDefinition, beanName, constructor, args);
	}

	/**
	 * Description: 获取实例化策略
	 * @author wxl
	 * Date: 2022/9/15 14:37
	 * @return com.obeast.Bean.springBean_04.support.InstantiationStrategy
	 */
	public InstantiationStrategy getInstantiationStrategy() {
		return instantiationStrategy;
	}

	public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
		this.instantiationStrategy = instantiationStrategy;
	}

}
