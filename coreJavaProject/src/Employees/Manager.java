package Employees;

public class Manager extends Employees {
	

	//sending these parameters
	Manager(long id, String name, String address, long employeePhone,double salary) {
		super(id, name, address, employeePhone);
		// TODO Auto-generated constructor stub
		this.basicSalary = salary;//ctlr and click to see where basicSalary(paranet) is coming from
	}
	
	




	 void calculateTransportAllowance(){
		 double transportAllowance = (15./100)*basicSalary;
		 System.out.println("This is the transport allowance " +transportAllowance);
	 }

	
	
}