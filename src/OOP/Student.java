package OOP;

public class Student extends Person {
	
	public Student(String name) {
		super(name);
	}
	
	public String getInformationDetails() {
		return "The information about this " + this.getClass().getName() + " is " + this.getName();
	}
 }
