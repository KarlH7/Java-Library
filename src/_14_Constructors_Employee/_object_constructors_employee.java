package _14_Constructors_Employee;

public class _object_constructors_employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Employee paul = new Employee("Paul", 100000.00, 1980, 2015);
		Manager e200 = new Manager("Sydney", 100000.00,1996,2016);
		Janitor j900 = new Janitor("Mr. Lorman", 30000, 1930, 1990 );
		
		System.out.println(paul.salary);
		System.out.println(j900.salary);
		
		
	}

}
