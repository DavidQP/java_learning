package OOP;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private static int id; 
	private static Employee[] myEmployees = new Employee[100] ;
	
	private final String name;
	private double salary;
	private Date date;
	
	
	public Employee() {
		this.name = "Fake employee";
		this.salary = 1200.0;
		GregorianCalendar calendar = new GregorianCalendar(2025, 4, 22);
		this.date = calendar.getTime();
		myEmployees[Employee.id] = this;
		Employee.id++;
	}
		
	public Employee(String name, double salary, Date date) {
		this.name = name;
		this.salary = salary;
		this.date = date;
		myEmployees[Employee.id] = this;
		Employee.id++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	
	public Date getDate() {
		return this.date;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void updateSalary(double percentage) {
		double increment = this.salary * percentage;
		this.salary += increment;
	}
	
	public static int getNumOfEmployees() {
		return Employee.id;
	}
	
	public static Employee[] getAllEmployees() {
		return myEmployees;
	}
}
