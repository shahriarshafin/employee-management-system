
package NewEmployee;

public class SalariedEmployee extends Employee {
	
	double monthlySalary;

	public SalariedEmployee(String name, String id, String designation, double monthlySalary) {
		super(name, id, designation);
		this.monthlySalary = monthlySalary;
	}
	
    @Override
	void increaseSalary(double amt) {
		 
		monthlySalary = monthlySalary+amt;
	 }

    @Override
	double getSalary() {
		
		return monthlySalary;
	}
	
	@Override
	String display() {
		
		//System.out.println("Salary: "+monthlySalary);
                return super.display()+"Salary: "+monthlySalary;
	}
}