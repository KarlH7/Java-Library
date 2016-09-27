package _06_inputoutput;

public class _05_switch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		// switch statement
		
		int whiteCastlesEaten = 7;
		String response;
		
		switch(whiteCastlesEaten)
		{
		
			case 0:
				response = "That's proably smart";
				break;
				
			case 5:
				response = "Well are you feeling alright?";
				break;
				
			case 10:
				response = "Are you crazy?";
				break;
				
			case 20:
				response = "Aren't you dead?";
				break;	
		
				default:
				response = "White castles are the best!";
					
				break;
		
		}
		
		// this is outside of the Switch Statement code
		
		
				System.out.println(response);
				
				
	}
		
	
		
}