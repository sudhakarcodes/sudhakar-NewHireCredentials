package com.greatlearning.Lab01;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please Enter the integer code for your department: \n");
		System.out.println("\nDepartment Codes\n 1 for Technical\n 2 for Admin\n 3 for Human Resource\n 4 for Legal\n 0 for None");

		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
	
		String dept;
	
		if (deptChoice == 1) {dept = "tech";}
		else if (deptChoice == 2) {dept = " admin";}
		else if (deptChoice == 3) {dept = "hr";}
		else if (deptChoice == 4) {dept = "lg";}
		else {dept = "wrong";}
		
		System.out.println("Please enter the first name:");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		
		System.out.println();
		
		System.out.println("Please enter the last name:");
		Scanner sc2 = new Scanner(System.in);
		String lastName = sc2.nextLine();
	
		System.out.println();
		
		Employee employee = new Employee(firstName, lastName, dept);
			
		NewHireCredentials service = new NewHireCredentials();
		String emailaddress = service.generateEmailAddress(employee);
		String password = service.generatePassword();
		service.showCredentials(employee, emailaddress, password);
		
		sc.close();
		sc2.close();
		in.close();
		
	}
	
}
