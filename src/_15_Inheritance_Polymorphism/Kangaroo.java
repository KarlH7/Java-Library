package _15_Inheritance_Polymorphism;

public class Kangaroo  extends Animal {
	
	boolean bigFeet;
	int numTeeth;
	
	// USE POLYMORPHISM TO OVERRIDE THE SPEADK METHD FROM ANIML
	//MAKE THE KANGAROO SAY SOMETHING NEW
	
	@Override
	public void speak() {
		System.out.println(" HAY MATE!!!");
	}
	

}
