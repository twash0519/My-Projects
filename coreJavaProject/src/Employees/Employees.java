package Employees;

public class Employees {
	
	long employeeId;
	String employeeName;
	String employeeAddress;	
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	
	
	//create a constructor because this is required with instance variables

	Employees(long id, String name, String address,long employeePhone){
				this.employeeId = id;
				this.employeeName=name;
				this.employeeAddress=address;
				this.employeePhone=employeePhone;
				
			
			}
			//method that calculates the salary
	void calculateSalary(){  //its is void because it doesn't return anything

			//local varable
			double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 

			System.out.println("This is the salary " + salary);
	}
			 
			 
	void calculateTransportAllowance(){
			double transportAllowance = 10.0/100*basicSalary;
			System.out.println("Transport Allowance " + transportAllowance);
	}

}
