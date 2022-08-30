package com.obeast.springOwnTest.config;

import com.obeast.springOwnTest.pojo.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import java.util.UUID;

/**
 * @author wxl
 * Date 2022/8/29 13:26
 * @version 1.0
 * Description:
 */
@Configuration
public class TestConfig {

//	@Bean(value = "user",
//			initMethod = "initUser",
//			destroyMethod = "destroyUser"
//	)
//	public User user(){
//		return new User("路明非",999);
//	}


	@Bean(
			value = "student",
			initMethod = "initStudent",
			destroyMethod = "destroyStudent"
	)
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	@Lazy
	public Student student() {
		Student s = new Student();
		s.setName(UUID.randomUUID().toString());
		return s;
	}

}
