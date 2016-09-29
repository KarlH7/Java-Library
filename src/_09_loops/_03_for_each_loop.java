package _09_loops;

public class _03_for_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of the best comedians of all time.
		
		String [] comedians = {"Paul O'Connor","Bull Hicks", "Katt Williams", "Chris Farley"};
		
		for(String comedian : comedians)
		{
		System.out.println(comedian);
		}
		String[]greatestBossesofAllTime = {"Jenn Aikins","Bob Alcorn","Robin Holer"};
		for(String boss:greatestBossesofAllTime)
		{
		System.out.println(boss);
		}
		
		String s = "hello";
		for(char ch:s.toCharArray()){
			System.out.println(ch);
		
		}
	}

}
