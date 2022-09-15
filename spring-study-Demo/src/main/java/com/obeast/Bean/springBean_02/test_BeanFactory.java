package com.obeast.Bean.springBean_02;

import com.obeast.Bean.springBean_02.factory.BeanDefinition;
import com.obeast.Bean.springBean_02.service.UserService;
import com.obeast.Bean.springBean_02.support.DefaultListableBeanFactory;


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
		UserService userService = (UserService) beanFactory.getBean("userService");
		userService.queryUserInfo();

		// 4.第二次获取 bean
		UserService userService2 = (UserService) beanFactory.getBean("userService");
		userService2.queryUserInfo();

		System.out.println(userService2 == userService);


	}
}
