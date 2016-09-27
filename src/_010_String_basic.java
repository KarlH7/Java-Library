import java.util.Scanner;

public class _010_String_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hisName = "Paul";
		String address = "123 Awesome Court";
		
		String toLowerCase = hisName.toLowerCase();
		String allCaps = address.toUpperCase();
		
		System.out.println("hisName = "+ allCaps);
		System.out.println("hisName = "+ toLowerCase);
	
		
		
		String fullName ="John Bon Jovi";
		String first = fullName.substring(0, 5);
		String middle = fullName.substring(5,9);
		String last = fullName.substring(9,13);
		
		System.out.print(first);
		System.out.print(middle);
		System.out.print(last);
		
		
		
		String firstTwoLetters = fullName.substring(0, 2);
		
String myString = "Soda Can";
		
		Scanner fromStr = new Scanner(myString);
		
		System.out.println("The words in the String are: ");
		
		while(fromStr.hasNext())
		
		{
		System.out.println(fromStr.next());
		
		}
		
		// use concatenation to make a sentence using these inputs
		

		
		
	}

}
