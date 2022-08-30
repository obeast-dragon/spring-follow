package com.obeast.springOwnTest.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxl
 * Date 2022/8/30 10:15
 * @version 1.0
 * Description:
 */
public class Main {
	public static void main(String[] args) {

		// 1.创建上下文对象，使用无参构造函数
		AnnotationConfigApplicationContext acx =
				new AnnotationConfigApplicationContext();
		// 2.设置需要激活的环境表示，可以写多个
		//  此处表示同时激活开发环境dev和测试环境test.
//		acx.getEnvironment().setActiveProfiles("dev","test");

		//激活所有环境
		acx.getEnvironment().setActiveProfiles("test");
		// 3.注册配置类
		acx.register(ProfileConfig.class);
		// 4.执行刷新
		acx.refresh();
		String[] dataSources =
				acx.getBeanNamesForType(ComboPooledDataSource.class);
		for(String dataSource : dataSources) {
			System.out.println(dataSource);
		}
	}
}
