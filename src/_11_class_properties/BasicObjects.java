package _11_class_properties;

public class BasicObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is creating an Object (called paulsDreamCar) or instance of the Car class 
		// new establiahes paulsDreamCar as a new item of type Car();
		
		Car paulsDreamCar = new Car();
		
		paulsDreamCar.make="Tesla";
		paulsDreamCar.model="Model 2";
		paulsDreamCar.color="Black";
		paulsDreamCar.isFast=true;
		paulsDreamCar.isEectric=true;
		paulsDreamCar.milesPerCharge=300;
		
		//Make another car that is your dream car and add 8 properties
		
		//This is my Object
		Car karlsCar=new Car();
		
		karlsCar.color="Red";
		karlsCar.type="Truck";
		karlsCar.leatherSeats=true;
		karlsCar.frontWheel=true;
		karlsCar.make="Ford";
		karlsCar.mpgCity=30;
		karlsCar.mpgHighway=50;
		karlsCar.isFast=true;
		
		Integer number = new Integer(5);
		System.out.println(number);
//		System.out.println(number.toString())
//		System.out.println(number.toString(i, radix))
		
				
		
		
		
		
		
		
		
		
		
		
	}

}
