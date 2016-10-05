package _15_Inheritance_Polymorphism;

public class Main {

	public static void main(String[] args){
	
// make all ithe instances up here before all outputs
		
		
	Animal george = new Animal();
	george.name = "George the Animal";
	
	
	Bear barney = new Bear();
	barney.name = "Barney";
	barney.isHibernating= true;
	barney.habitat = "Woods";
	
	
	Kangaroo jack = new Kangaroo();
	jack.name = "jack";
	jack.bigFeet = true;
	jack.habitat = "outback";
	jack.getHabitat();
	jack.numTeeth = 25;  //
	jack.getNumTeeth();   //
	
	
	Mouse pixie = new Mouse();
	pixie.name = "pixie";
	pixie.numEyes = 2;
	pixie.numTeeth = 17;
	pixie.habitat = "House";
	

	
	pixie.getPrintName();

	barney.speak();
	jack.speak();
	
	pixie.speak();
	
	
	
	}
}
					