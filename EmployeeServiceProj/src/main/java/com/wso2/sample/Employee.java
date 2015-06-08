package com.wso2.sample;

public class Employee {
	private String fName;
	private int salary;
	
	public Employee(String firstName, int salary){
		this.fName = firstName;
		this.salary = salary;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
