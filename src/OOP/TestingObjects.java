package OOP;

import java.util.Date;

public class TestingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCarClass();
		testEmployeeClass();
	}
	
	public static void testEmployeeClass() {
		Employee[] myEmployees = new Employee[3];
		myEmployees[0] = newEmployee();
		myEmployees[1] = newEmployee();
		myEmployees[2] = newEmployee();
		
		for(Employee employee: myEmployees) {
			System.out.println("Name " + employee.getName() + 
							   " Salary: " + employee.getSalary() +
							   " leave the company in: " + employee.getDate());
		}
	}
	
	public static Employee newEmployee() {
		int day, month, year;
		day = (int)((Math.random() * 30) + 1);
		month = (int)((Math.random() * 11));
		year = (int)((Math.random() * 10) + 2015);
		Employee employee = new Employee("Hitori " + day + month + year, 2500, new Date(day, month, year));
		return employee;
	}
	
	public static void testCarClass() {
		Car fakeCar = new Car();
		System.out.println(fakeCar.getName());
		fakeCar.setColor("Yellow");
		System.out.println(fakeCar.getColor());
	}

}
