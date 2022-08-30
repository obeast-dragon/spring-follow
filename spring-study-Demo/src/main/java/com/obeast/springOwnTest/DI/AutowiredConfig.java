package com.obeast.springOwnTest.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan({"com.obeast.springOwnTest.DI"})
public class AutowiredConfig {

	/**
	 * 使用@Bean向容器中注入一个名称为userDao2，类型为UserDao的Bean
	 */
	@Bean("userDao2")
	public UserDao userDao2() {
		UserDao userDao = new UserDao();
		userDao.setFlag("2");
		return userDao;
	}


	@Primary
	@Bean("userDao")
	public UserDao userDao2_1() {
		UserDao userDao = new UserDao();
		userDao.setFlag("9");
		return userDao;
	}

	@Bean("userDao3")
	public UserDao userDao3() {
		UserDao userDao = new UserDao();
		userDao.setFlag("3");
		return userDao;
	}
}