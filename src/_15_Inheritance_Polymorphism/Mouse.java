package _15_Inheritance_Polymorphism;

public class Mouse extends Animal{

		
		int numFeet;
		String wiskers;
		
		@Override
		public void speak() {
			System.out.println(" Squeek Squeek Squeek ");
		}
}
