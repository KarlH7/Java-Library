package _09_loops;

public class _02_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 //for(initialize lcv(loop control variable); relational test lcv; modify lcv)

		for (int ii =0; ii <= 10; ii++)
		{
			System.out.println(ii);			
		}
		
		//TODO create a for loop that increments by 5 and 
		//counts 0-100 by 5
		
		for (int i = 0; i <= 100; i+=5)
		{
			System.out.println(i);			
		}
		
		System.out.println();	
		
		//TODO create a for loop that increments by 5 and 
		//counts 0-100 by 5
		// get it to print out nicely
		int sum = 0;
		System.out.println("sum +  iii  =  newSum" );
		for (int iii = 0; iii <= 10; iii++)
		{
			sum = sum + iii;	
			System.out.println(sum + " + " + iii + " = " + sum );
			
			System.out.println(sum);
		}
		System.out.println(sum);
		
		System.out.println();
		
		// Simple interest over time - comouund over 10 years
		
		double balance = 5000;
		double rate = 1.02; // 2% interest
				
		for(int i4 = 0; i4 < 10; i4++)
		{
			balance *= rate; // balance = balance * rate
			
		}
			
		System.out.println(balance);
		
		System.out.println();
				
		//
		
		String spaces = "There are spaces in this string";
		int numSpaces = 0;
		
	//System.out.println(spaces.length());  returns the length of the string
			
			for(int i5 = 0; i5 < spaces.length(); i5++)
			{
				System.out.println(spaces.charAt(i5));	
				if(spaces.charAt(i5) != ' ')
				{
					continue;
				}else
				{
					numSpaces++;
				}
			}
		System.out.println("There are " + numSpaces + " in the string");
		
		
		
		
		
	}

}
