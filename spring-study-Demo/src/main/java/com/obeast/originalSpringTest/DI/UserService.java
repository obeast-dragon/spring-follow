package com.obeast.originalSpringTest.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//	@Qualifier("userDao2")
	@Autowired(required = false)
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
}