package com.wso2.samples;

public class Person {
	private String fName;
	private int age;
	
	public Person(String firstName, int age){
		this.fName = firstName;
		this.age = age;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
