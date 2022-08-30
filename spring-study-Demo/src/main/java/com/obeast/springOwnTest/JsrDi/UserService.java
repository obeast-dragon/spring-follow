package com.obeast.springOwnTest.JsrDi;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService {


	@Resource(name = "userDao2")
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

}