package _05_booleans;

public class _06_operaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Relational Operators
		 * >
		 * <
		 * >=
		 * <=
		 * ==
		 */
		
		//TODO - create an int called currBalance and assign it a value
		//use an if statement to check if that balance is greater then zero
		//use different relational operators to print different statemants
		
		int currentBalance = 200;
				
		if(currentBalance >= 0) {
					
			System.out.println("Thank God I have some Cash");
		} else{	
			System.out.println("Oh Know I'm Broke!");
					
		}
		
				

		
		System.out.println("");
				
		int currentBalance2 = 200;
				
		if( currentBalance2 <= 0) {
					
			System.out.println("I am Broke");
				
		} else{	
					
			System.out.println("I have plenty of cash");
					
		}
		
				
			System.out.println("");
				
				
				
				
			//TODO  - create a password string and check it
			
			//  === tests both type and value
			//google how to test string equality in Java
			
			
			int bankPin = 2016;
			int enteredBankPin = 2003;
			
			
			if (enteredBankPin == bankPin) {
				System.out.println("Your in!");
				
			} else {
				System.out.println("Tough Luck, want to play again?");
							
			}
			
			
			
			String password = "letmein";
	//		if(password.equals("letMeIn")
			
			
			
			
		
		
	}	
	

}
