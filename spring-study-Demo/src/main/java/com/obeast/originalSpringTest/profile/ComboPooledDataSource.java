package com.obeast.originalSpringTest.profile;

/**
 * @author wxl
 * Date 2022/8/30 9:23
 * @version 1.0
 * Description:
 */
public class ComboPooledDataSource {

	private String JdbcUrl;
	private String User;
	private String Password;
	private String DriverClass;

	public String getJdbcUrl() {
		return JdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		JdbcUrl = jdbcUrl;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDriverClass() {
		return DriverClass;
	}

	public void setDriverClass(String driverClass) {
		DriverClass = driverClass;
	}
}
