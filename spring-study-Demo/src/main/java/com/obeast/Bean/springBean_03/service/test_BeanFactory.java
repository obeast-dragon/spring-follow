package com.obeast.Bean.springBean_03.service;

import com.obeast.Bean.springBean_03.factory.BeanDefinition;
import com.obeast.Bean.springBean_03.service.UserService;
import com.obeast.Bean.springBean_03.support.DefaultListableBeanFactory;


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
		BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
		beanFactory.registerBeanDefinition("userService", beanDefinition);

		// 3.第一次获取 bean
		UserService userService2 = (UserService) beanFactory.getBean("userService", "老六");
		userService2.queryUserInfo();

//		UserService userService1 = (UserService) beanFactory.getBean("userService");
//		userService1.queryUserInfo();



	}
}
