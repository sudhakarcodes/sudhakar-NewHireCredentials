package com.greatlearning.Lab01;
import java.util.Scanner;
import java.util.Random;

public class NewHireCredentials {

	public String generatePassword() 
	{
		
		String passwordChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+/;";
		
		char[] passwordArray = new char[8];
		Random random = new Random();
		
		for (int i=0; i < passwordArray.length; i++) 
		{
			passwordArray[i] = passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
		
		return new String(passwordArray);
	}
	
	public String generateEmailAddress(Employee employee) 
	{
		return employee.getFirstName()+employee.getLastName()+"@"+employee.getDeptName()+".amazon.com";
	}

	public void showCredentials(Employee employee, String emailAddress, String passwordArray) {
		
		System.out.println("Dear " + employee.getFirstName()+","+ " Your generated credentials area as follows"); 
	
		System.out.println("Your email address is ---> " + emailAddress);
		
		System.out.println("Your password is      ---> " + passwordArray);
		
	}
}
