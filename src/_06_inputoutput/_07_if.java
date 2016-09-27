package _06_inputoutput;

import java.util.Scanner;

public class _07_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		boolean meatLoafForLunch = false;
		
		if(meatLoafForLunch)
		{
			System.out.println("I will be happy!");
			
		}
		
		boolean pizzaForLunch = true;
		
		if(pizzaForLunch)
		{
			System.out.println("Yes!!!!");
		}
		
		
		
		// if
		
		boolean isFreezingColdInHere = true;
		
		if(isFreezingColdInHere)
		{
			System.out.println("Please turn on the heat.");
		}else
		{
			System.out.println("It's not too bad");
		}
		
	
		
		
		
		
		
		Scanner inputInfo = new Scanner(System.in);
		
		String passWord = "2016";
		String response = "";
		
		System.out.println("Enter your password please.");
				
		response = inputInfo.next();
				
		if(response.equals(passWord))
		{
			System.out.println("Right!");
		}else
		{
				System.out.println("Wrong!");
		}
		}

	
	
	
	
	
	
}
