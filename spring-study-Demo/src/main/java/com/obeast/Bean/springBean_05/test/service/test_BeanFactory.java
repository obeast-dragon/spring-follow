package com.obeast.Bean.springBean_05.test.service;

import com.obeast.Bean.springBean_05.PropertyValue;
import com.obeast.Bean.springBean_05.PropertyValues;
import com.obeast.Bean.springBean_05.factory.BeanDefinition;
import com.obeast.Bean.springBean_05.factory.BeanReference;
import com.obeast.Bean.springBean_05.support.DefaultListableBeanFactory;


/**
 * @author wxl
 * Date 2022/9/15 7:37
 * @version 1.0
 * Description:
 */
public class test_BeanFactory {
	public static void main(String[] args) {
		// 1.初始化 BeanFactory
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 2.注册 bean
		beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

		// 3. UserService 设置属性[uId、userDao]
		PropertyValues propertyValues = new PropertyValues();
		propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
		propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));

		// 4. UserService 注入bean
		BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
		beanFactory.registerBeanDefinition("userService", beanDefinition);


		// 3.第一次获取 bean
		UserService userService2 = (UserService) beanFactory.getBean("userService");
		userService2.queryUserInfo();





	}
}
