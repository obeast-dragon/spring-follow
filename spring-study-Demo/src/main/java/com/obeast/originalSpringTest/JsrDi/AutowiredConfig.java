package com.obeast.originalSpringTest.JsrDi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"com.obeast.springOwnTest.JsrDi"})
public class AutowiredConfig {

	/**
	 * 使用@Bean向容器中注入一个名称为userDao2，类型为UserDao的Bean
	 */
	@Primary
	@Bean("userDao2")
	public UserDao userDao() {
		UserDao userDao = new UserDao();
		userDao.setFlag("2");
		return userDao;
	}
}