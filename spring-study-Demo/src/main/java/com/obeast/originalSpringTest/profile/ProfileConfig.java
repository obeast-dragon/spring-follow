package com.obeast.originalSpringTest.profile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * @author wxl
 * Date 2022/8/29 18:01
 * @version 1.0
 * Description:
 */
@Configuration
@ComponentScan("com.obeast.springOwnTest.profile")
@PropertySource("classpath:db.properties")
// 表示当运行环境为测试环境时，激活该配置中的所有Bean组件
@Profile("test")
public class ProfileConfig {

	@Value("${db.user}")
	private String user;

	@Value("${db.password}")
	private String password;

	@Value("${db.driverClass}")
	private String driverClass;

	// 开发环境数据源
	@Bean
	@Profile("dev")
	public ComboPooledDataSource devDataBase() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		setParams(dataSource, "jdbc:mysql://127.0.0.1:3306/db_dev");
		return dataSource;

	}

	// 测试环境数据源
	@Bean
	@Profile("test")
	public ComboPooledDataSource testDataBase() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		setParams(dataSource, "jdbc:mysql://127.0.0.1:3306/db_test");
		return dataSource;


	}

	// 测试环境数据源
	@Bean
	@Profile("prod")
	public ComboPooledDataSource prodDataBase() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		setParams(dataSource, "jdbc:mysql://127.0.0.1:3306/db_prod");
		return dataSource;


	}

	// 测试环境数据源
	@Bean
	public ComboPooledDataSource workDataBase() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		setParams(dataSource, "jdbc:mysql://127.0.0.1:3306/db_work");
		return dataSource;

	}

	// 公共方法
	private void setParams(ComboPooledDataSource dataSource,
						   String jdbcUrl) throws Exception {
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		dataSource.setDriverClass(driverClass);

	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProfileConfig.class);
		String[] dataSources =
				context.getBeanNamesForType(ComboPooledDataSource.class);
		for(String dataSource : dataSources) {
			System.out.println(dataSource);
		}
	}



}

