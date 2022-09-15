package com.obeast.originalSpringTest.Aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author wxl
 * Date 2022/8/29 16:26
 * @version 1.0
 * Description:
 */
@Component
public class Pen implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

	/**
	 * 用于保持自定义之后的applicationContext applicationContext引用
	 * 保存Spring容器的引用，如果在本类中其他地方使用，可以直接用
	 */
	protected ApplicationContext applicationContext;

	@Override
	public void setBeanName(String name) {
		System.out.println("当前Bean的名称为：" + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("当前IOC容器对象为：" + applicationContext);
		// 获取到上下文之后，就可以操作里面的某个bean定义，或者添加自定义的property属性，或者自己注册一个bean定义等等操作
		this.applicationContext = applicationContext;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("当前Bean工厂对象为：" + beanFactory);
	}
}
