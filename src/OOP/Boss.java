package OOP;

public class Boss extends Employee {
	
	private double incentive;
	
	public Boss() {
		super();
	}
	
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	public double getSalary() {
		return super.getSalary() + this.incentive; 
	}
	
	public String salaryDetails() {
		return "Salary:    " + super.getSalary() + "\n" +
			   "Incentive: " + this.incentive + "\n" +
			   "           ----------------" + "\n" +
			   "           " + (super.getSalary() + this.incentive);
	}
}
