package _14_Constructors_Employee;

public class Employee {

	
// Super overrides Properties
// @Overrides Methods
	
//	public String wholeName;
	public String name;
	double salary;
	int startYear;
	int birthYear;
	
	//
	//Constructor
	//A constructor is a method that has the same name as the Class itself - it builds
	//our instances or objects of the class type
	// "this."  is the constructor
	
	//properties
	Employee(String name, double salary,int startYear, int birthYear){
	
		this.name = name;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
