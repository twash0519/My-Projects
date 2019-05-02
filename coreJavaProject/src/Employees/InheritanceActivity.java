package Employees;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Manager");
		Manager manager1= new Manager(126534,"Peter","Chennai India", 237844,65000);
		manager1.calculateSalary();
		manager1.calculateTransportAllowance();
		
		System.out.println("Trainee");
		Trainee trainee1= new Trainee(29846,"Jack","Mumbai India", 44085,45000);
		trainee1.calculateSalary();
		trainee1.calculateTransportAllowance();
		
	}
	


}
