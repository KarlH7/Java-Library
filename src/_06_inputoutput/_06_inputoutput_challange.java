package _06_inputoutput;

import java.util.Scanner;

public class _06_inputoutput_challange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaire variables
		
		String West = "Right";
		String west = "right";
		String East	= "Left";
		String east = "left";
		String North = "Up";
		String north = "up";
		String South = "Down";
		String south = "down";
		String Back = "Back";
		String back = "back";
		String title = "";
		
		// Scanner is a Javq class - used for user Input
		
		Scanner inputInfo = new Scanner(System.in);
		
		title = inputInfo.nextLine().toLowerCase();
		
		// if (title.contains("queen")||title.contains("king")||title.contatins("lady"))

		
		String Direction = "";
		String use	= "";
		String say = "";
		
	
		

		
		
		//Setup a simple user input

		System.out.println("You are on a desert island you have a shovel, compuss, and water.");
		System.out.println("");
		System.out.println("Ahead of you is the ocean.");
		System.out.println("To behind you is dense brush.");
		System.out.println("To the right is a grate with a Beast in side the likes of which you have never seen.");
		System.out.println("To the left is a wrecked ship, with no one else around.");
		
		System.out.println("");		
		System.out.println("What direction do you want to go?");
		
		
		Direction = inputInfo.next();
		// you can try .nextline also
		
	//	case
		
		
		System.out.println("from here you can see the ");
		System.out.println("");
		System.out.println("Ahead of you is the ocean.");
		System.out.println("To behind you is dense brush.");
		System.out.println("To the right is a grate with a Beast in side the likes of which you have never seen.");
		System.out.println("To the left is a wrecked ship, with no one else around.");
		
		System.out.println("");		
		System.out.println("What direction do you want to go?");
		
		
		
		
		
		
		
		System.out.println("Looking to the " + Direction + " you now see ");
//		birthCity = inputInfo.next();

			
//		System.out.println("Enter your age below \n");
//		age = inputInfo.next();
	
		
	//	String username = inputInfo.next();
		
//		System.out.println(name);
//		System.out.println(birthCity);
//		System.out.println(age);
		
//		System.out.println("Hello " + name + ", your were born in " + birthCity +" and you are " + age + "years old" );
		
		inputInfo.close();
		// you must close inputInfo to sqve memory !!!
		
		//TODO THE CHALLENGE
		
		//CREATE A STORY USING THE SCANNER. DO your best to use everything you've learned so far.
		//Include strings, booleans, integer, operators, etc.
		//Consider attempting to make a choose your own adventure program.
		
		
		//   Adventure Game
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
