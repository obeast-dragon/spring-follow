package com.obeast.originalSpringTest.pojo;

public class Person {
   private Integer id;
   private String name;
   private String nickName;

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", nickName='" + nickName + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
}