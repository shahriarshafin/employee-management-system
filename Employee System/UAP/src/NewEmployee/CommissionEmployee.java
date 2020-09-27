package NewEmployee;

public class CommissionEmployee extends Employee {

	double commission;
	double sale;
	
	public CommissionEmployee(String name, String id, String designation, double commission, double sale) {
		super(name, id, designation);
		this.commission = commission;
		this.sale = sale;
	}
	
	double getSalary(double sale) {
		
		return commission*sale;
	}
	
	@Override
	double getSalary() {
		
		return commission*sale;
	}
	
	@Override
	void increaseSalary(double amt)
	{
		commission += amt;
	}

	@Override
	String display() {
		super.display();
		//System.out.println("Commission: "+commission);
                return  super.display()+"Commission: "+commission; 
	}

}