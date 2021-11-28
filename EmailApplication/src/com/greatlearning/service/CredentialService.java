package com.greatlearning.service;
import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
	 String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	 String smallLetters="abcdefghijklmnopqrstuvwxyz";
	 String numbers="0123456789";
	 String specialCharacters="!@#$%^&*_=+-/.?<>)";
         String values = capitalLetters+smallLetters+numbers+specialCharacters;
   
         Random random = new Random();
         char[] password = new char[8];
      
           for (int i=0; i<8; i++) {
             int rand = random.nextInt(values.length());
             password[i] = values.charAt(rand);
	   }
		
        return password;
	}
	
	public String generateEmailAddress(String firstName,String lastname ,String department)	{
		return 	firstName+lastname+"@"+department+".greatlearning.com";
	}
	
	public void showCredentials(Employee employee, String email,char[] generatedPassword) 
	{
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email    ---> "+email);
		String pass= new String(generatedPassword);
		System.out.print("Password ---> "+pass);
	}
}
