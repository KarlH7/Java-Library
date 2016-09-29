package _15_Inheritance_Polymorphism;

import java.util.Scanner;

public class Animal {
	
	Scanner scan = new Scanner(System.in);
	
//Properties
	public int numLegs;
	public int numTeeth;
	public int numEyes;
	public int lifeSpan;
	
	public boolean isWarmBlooded;
	public String name;
	public String habitat;
	
//Methods
	public String getName(){
	System.out.println("Name is " + name);
	return name;
	}
	
	public String getHabitat(){
	System.out.println("I live in " + habitat);
	return habitat;
	}
	
	public void getNumTeeth(){
		System.out.println(name + " has " + numTeeth + " teeth");
	}
	
	
	public void getPrintName(){
		System.out.println("My name is " + name);
	}

	
	public void speak() {
		System.out.println("I am an animal");
	}
		
	
//TODO
	//CREATE A MOUSE CLASS INSIDE THIS FOLDER
	//HAVE THE MOUSE CLASS INHERIT FROM THE ANIMAL
	//MAKE THE MOUSE CLASS USE POLYMORPHISM TO WVERRIDE SPEAK()
	//WITHIN ANNIMAL CREAT A NEW METHOD
	//OVERRIDE IT WITHIN KANGAROO, MOUSE AND BEAR TO MAKE IT A SPECIFIC TO  THAT TYPE OF ANIMAL
	
	
	
	
	
	
	
}
