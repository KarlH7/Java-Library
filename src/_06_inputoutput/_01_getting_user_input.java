package _06_inputoutput;

import java.util.Scanner;

public class _01_getting_user_input {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		String name;
		String birthCity;
		String age;
		
		// Scanner is a Javq class - used for user Input
		
		Scanner inputInfo = new Scanner(System.in);
		
		
		//Setup a simple user input

		System.out.println("Enter your name below \n");
		name = inputInfo.next();
		// you can try .nextline also
			
		System.out.println("Enter your birthCity below \n");
		birthCity = inputInfo.next();

			
		System.out.println("Enter your age below \n");
		age = inputInfo.next();
	
		
	//	String username = inputInfo.next();
		
		System.out.println(name);
		System.out.println(birthCity);
		System.out.println(age);
		
		System.out.println("Hello " + name + ", your were born in " + birthCity +" and you are " + age + "years old" );
		
		inputInfo.close();
		// you must close inputInfo to sqve memory !!!
		
		
		
		

	}
			
		
		
		
	}


