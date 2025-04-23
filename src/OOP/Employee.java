package OOP;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
	
	private String name;
	private double salary;
	private Date date;
	
	public Employee() {
		this.name = "Fake employee";
		this.salary = 1200.0;
		GregorianCalendar calendar = new GregorianCalendar(2025, 4, 22);
		this.date = calendar.getTime();
	}
		
	public Employee(String name, double salary, Date date) {
		this.name = name;
		this.salary = salary;
		this.date = date;
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
	
	public void setName(String name) {
		this.name = name;
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
}
