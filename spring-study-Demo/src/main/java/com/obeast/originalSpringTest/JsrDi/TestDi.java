package com.obeast.originalSpringTest.JsrDi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxl
 * Date 2022/8/29 15:20
 * @version 1.0
 * Description:
 */
public class TestDi {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
//		UserDao userDao = context.getBean(UserDao.class);
		UserService userService = context.getBean(UserService.class);
//		System.out.println(userDao);
		System.out.println(userService.getUserDao());
//		System.out.println(userService.getUserDao() == userDao);
	}
}
