package OOP;

import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;

public class TestingObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testCarClass();
		//testEmployeeClass();
		//testBossClass();
		//testPersonClass();
		testTimeExample();
		
	}
	
	public static void testTimeExample() {
		TimerExampleRefactoring example = new TimerExampleRefactoring(2500, true);
		example.init();
		
		showMessageDialog(null, "Click in accept if you need to close the program");
		
		System.exit(0);
		
	}
	
	public static void testPersonClass() {
		Person[] people = new Person[5];
		
	}
	
	public static void testBossClass() {
		Boss ceo = new Boss();
		ceo.setSalary(2800);
		ceo.setIncentive(200);
		System.out.println(ceo.getName());
		System.out.println(ceo.getSalary());
		System.out.println(ceo.getDate());
		System.out.println(ceo.salaryDetails());
	}
	
	public static void testEmployeeClass() {
		newEmployee();
		newEmployee();
		newEmployee();
		
		Employee[] myEmployees = Employee.getAllEmployees();
		//System.out.println(myEmployees[0]);
		
		for(Employee employee: myEmployees) {
			if(employee == null) {
				break;
			}
			
			System.out.println("Name " + employee.getName() + 
							   " Salary: " + employee.getSalary() +
							   " leave the company in: " + employee.getDate());
		}
		System.out.println("The number of employees in the company are: " + Employee.getNumOfEmployees());
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
