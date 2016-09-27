package _080_DataCollection;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String>names = new ArrayList<String>();
		
		names.add("Karl");
		names.add("James");
		names.addAll(Arrays.asList("Sydney","John","Marrisa"));
		System.out.println(names);
		
		System.out.println();
		
		System.out.println(names.get(0));
		
		System.out.println();
		
		//TODO create an ArrayList of Integers and add some numbers to it
		
		ArrayList<Integer> myIntegers = new ArrayList<Integer>();
		
		myIntegers.add(10);
		myIntegers.add(9);
		myIntegers.addAll(Arrays.asList(8,7,6));
		System.out.println(myIntegers);
		
		System.out.println();
		
		
		
		//TODO create an ArrayList of type Doubles add some doubles to it and Print them out 1 by 1		
		
		ArrayList<Double> myDoubles = new ArrayList<Double>();
		
		myDoubles.addAll(Arrays.asList(3.999,4.999,5.999));
		System.out.println(myDoubles);
		System.out.println(myDoubles.get(0));
		System.out.println(myDoubles.get(1));
		System.out.println(myDoubles.get(2));
		
		System.out.println();
		
		
		
		
		
		
		
		
		
	}

}
