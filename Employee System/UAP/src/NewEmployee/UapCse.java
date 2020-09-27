package NewEmployee;

import java.util.ArrayList;

public class UapCse {
	
	ArrayList<Employee> employees = new ArrayList<>();
	String name;
	
	public UapCse(String name) {
		super();
		this.name = name;
	}
	
	private void addNewEmployee(Employee e)
	{
		employees.add(e);
	}
	
	public void addNewEmployees(String n, String i, String d, double s)
	{
		Employee E = new SalariedEmployee(n,i,d,s);
		addNewEmployee(E);
	}
	
	public void addNewEmployees(String n, String i, String d, double hr,int hw)
	{
		Employee E = new HourlyEmployee(n,i,d,hr,hw);
		addNewEmployee(E);
	}
	
	public void addNewEmployees(String n, String i, String d, double p,double s)
	{
		Employee E = new CommissionEmployee(n,i,d,p,s);
		addNewEmployee(E);
	}
	
	public Employee findEmployee(String id)
	{
		for (int i = 0; i < employees.size(); i++) {
			
			Employee E = employees.get(i);
			if(E.getId().equals(id))
			{
				return E;
			}
		}
		return null;
	}
}
	
//	public void increaseSalary(String id,double amt)
//	{
//	 	Employee E = findEmployee(id);
//		
//		if(E != null)
//		{
//			E.increaseSalary(amt);
//		}
//		
//		else
//		{
//			System.out.println("Employee isn't Exits");
//		}
//	}
//	
//	double getSalary(String id)
//	{
//		Employee E = findEmployee(id);
//		
//		if(E != null)
//		{
//			double salary = E.getSalary();
//			return salary;
//		}
//		
//		else
//		{
//			System.out.println("Employee isn't Exits");
//			return 0;
//		}
//	}
//	
//	void displayInfo(String id)
//	{
//		Employee E = findEmployee(id);
//		
//		if(E!=null)
//		{
//			E.display();
//		}
//		else
//		{
//			System.out.println("Employee isn't Exits");
//		}
//	}
//	
//	void  display()
//	{
//		for (int i = 0; i < employees.size(); i++) {
//			
//			Employee E = employees.get(i);
//			E.display();
//		}
//	}
//}