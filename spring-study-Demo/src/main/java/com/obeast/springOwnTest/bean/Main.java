package com.obeast.springOwnTest.bean;

import com.obeast.springOwnTest.pojo.User;
import com.obeast.springOwnTest.service.TestService;
import com.obeast.springOwnTest.service.impl.TestServiceImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @Author lin
 * @Create 2022/5/8 19:28
 */
public class Main {
	public static void main(String[] args) {
		/** 第一种获取bean对象的方法*/
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(TestServiceImpl.class);
		context.refresh();
		TestService testService = (TestService) context.getBean("TestService");
		testService.sayHello("林北");


		/**第二种获取bean对象的方法*/
		ApplicationContext context1 = new ClassPathXmlApplicationContext("userBeansc.xml");
		User user = (User) context1.getBean("user");
		System.out.println(user.getName() + user.getAge());


		/**第三种获取bean对象的方法*/
		Resource classPathResource = new ClassPathResource("userBeansc.xml");
		//创建默认工厂
		//DefaultListableBeanFactory 默认实现了BeanDefinitionRegistry接口
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//初始化加载器
		XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(factory);
		//加载配置文件
		definitionReader.loadBeanDefinitions(classPathResource);
		User user2 = (User) factory.getBean("user");
		System.out.println(user2);

	}

//	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
//		Object student1 = context.getBean("student");
//		Object student2 = context.getBean("student");
//		System.out.println(student2 == student1);
//	}

//	public static void main(String[] args) {
//		ApplicationContext acx =
//				new AnnotationConfigApplicationContext(
//						ConditionalConfig.class);
//		String[] names = acx.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}
//		// 如果在linux系统上运行上述测试类，linuxCalc组件将会被注册到容器中
//		// windows系统上运行则不会注入linuxCalc，只会打印出conditionalConfig
//	}

//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
//	}
}

