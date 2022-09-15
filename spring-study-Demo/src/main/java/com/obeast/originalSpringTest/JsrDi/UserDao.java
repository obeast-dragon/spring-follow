package com.obeast.originalSpringTest.JsrDi;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	private String flag = "1";
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "UserDao{" +
				"flag='" + flag + '\'' +
				'}';
	}
}