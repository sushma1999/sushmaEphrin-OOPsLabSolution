package com.greatlearning.service;
import java.util.Scanner;
import java.lang.System;
import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main (String args[])
	{
	Employee employee = new Employee("Sushma","Ephrin");
	
	CredentialService cs = new CredentialService();
	String generatedEmail;
	char[] generatedPassword;
	
	
	System.out.println("Please enter the department");
    System.out.println("1. Technical");
    System.out.println("2. Admin");
    System.out.println("3. Human Resource");
    System.out.println("4. Legal");
    
    Scanner scan= new Scanner(System.in);
    int option = scan.nextInt();
    
    switch(option)
    {
    case 1:{
    	generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
    			employee.getLastName().toLowerCase(),"tech");
    	generatedPassword=cs.generatePassword();
    	cs.showCredentials(employee, generatedEmail, generatedPassword);
    	break;
    } 
    case 2:{generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
			employee.getLastName().toLowerCase(),"adm");
	generatedPassword=cs.generatePassword();
	cs.showCredentials(employee, generatedEmail, generatedPassword);
	break;
    	
        }
    case 3:{generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
			employee.getLastName().toLowerCase(),"hr");
	generatedPassword=cs.generatePassword();
	cs.showCredentials(employee, generatedEmail, generatedPassword);
	break;
    }
    case 4:{
    	
    	generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
    			employee.getLastName().toLowerCase(),"lg");
    	generatedPassword=cs.generatePassword();
    	cs.showCredentials(employee, generatedEmail, generatedPassword);
    	break;
    }
    default:{
    	System.out.println("Enter correct Department");
    	break;

    }
    }
    scan.close();
}
}

