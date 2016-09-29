package _14_Constructors_Employee;

public class Janitor extends Employee{

	Janitor(String name, double salary, int startYear, int birthYear, String department) {
		super(name, salary, startYear, birthYear);
		this.department = department;
		
		// TODO Auto-generated constructor stub
	}
	public String department;
}
