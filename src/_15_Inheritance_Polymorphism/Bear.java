package _15_Inheritance_Polymorphism;

public class Bear extends Animal{

	public boolean isHibernating;
	
	
	@Override
	public void speak() {
		System.out.println("ROOOOOAAAAAAAARRRRRR!!!");
	}
	
}
