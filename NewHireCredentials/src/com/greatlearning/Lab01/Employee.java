package com.greatlearning.Lab01;

public class Employee {

	private String firstName;
	private String lastName;
	private String deptName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getDeptName() {
		return deptName;
	}

	public Employee (String firstName, String lastName, String deptName){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.deptName = deptName;
	}
	
}