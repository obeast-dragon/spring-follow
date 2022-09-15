package com.obeast.originalSpringTest.pojo;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2022/2/13 21:57
 */
public class User {

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

	// 初始化方法，在Student实例创建完，
	// name属性设置完成之后初始化的时候执行
	public void initUser() {
		System.out.println("user init...");
	}
	// 在调用容器的close方法关闭容器销毁bean的时候执行
	public void destroyUser() {
		System.out.println("user destory...");
	}
}
