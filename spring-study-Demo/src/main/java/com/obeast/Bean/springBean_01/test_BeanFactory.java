package com.obeast.Bean.springBean_01;

import com.obeast.Bean.springBean_01.service.UserService;


/**
 * @author wxl
 * Date 2022/9/15 7:37
 * @version 1.0
 * Description:
 */
public class test_BeanFactory {
	public static void main(String[] args) {
		// 1.初始化 BeanFactory
		BeanFactory beanFactory = new BeanFactory();

		// 2.注册 bean
		BeanDefinition beanDefinition = new BeanDefinition(new UserService());
		beanFactory.registerBeanDefinition("UserService", beanDefinition);

		// 3.获取 bean
		UserService userService = (UserService) beanFactory.getBean("UserService");
		userService.queryUserInfo();
		UserService userService2 = (UserService) beanFactory.getBean("UserService");
		userService2.queryUserInfo();

		System.out.println(userService2 == userService);

	}
}
