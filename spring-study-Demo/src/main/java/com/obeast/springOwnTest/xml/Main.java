package com.obeast.springOwnTest.xml;

import com.obeast.springOwnTest.pojo.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author wxl
 * Date 2022/8/30 10:34
 * @version 1.0
 * Description:
 */
@Component
public class Main {

	//直接在value中写死了name属性的值为wb
	@Value("wb")
	private String name;


	// SpEL表达式的语法就是#{}，{}中可以写运算表达式
	@Value("#{1+2}")
	private Integer id;


	/**
	 * 语法是: ${}，{}中写变量名称，变量名称后的冒号:后面是变量的默认值，
	 * 通常 建议加上默认值，否则如果配置文件中忘添加了该变量，应用启动会报错
	 * SpEL表达式的语法就是#{}，{}中可以写运算表达式
	 */
	@Value("${person.nick:兵}")
	private String nickName;

	public static void main(String[] args) {
		Main main = new Main();
		System.out.println("name" + main.name);
		System.out.println("id" + main.id);
		System.out.println("nickName" + main.nickName);

		ApplicationContext acx1 =
				new ClassPathXmlApplicationContext("classpath:person.xml");
		Person person = (Person) acx1.getBean("person");
		System.out.println(person);
	}
}
