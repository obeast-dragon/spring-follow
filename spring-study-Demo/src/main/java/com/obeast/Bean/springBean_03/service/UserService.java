package com.obeast.Bean.springBean_03.service;

public class UserService {

	private String username;


	public UserService(String username) {
		this.username = username;
	}

	public void queryUserInfo(){
        System.out.println("查询用户信息" + username);
    }

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("");
		sb.append("").append(username);
		return sb.toString();
	}

}