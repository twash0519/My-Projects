package interfaceAssignment;

import interfaceAssignment.KidUsers;
import interfaceAssignment.AdultUser;

public class JavaInterfaceDemo {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

		
System.out.println("\n******************Kid1******************************");
		
		KidUsers kidUsers1 = new KidUsers(10,"Kids");
		kidUsers1.registerAccount();
		kidUsers1.requestBook();
		
System.out.println("\n*******************Kid2******************************");
		
		KidUsers kidUsers2 = new KidUsers(18,"Fiction");
			
		kidUsers2.registerAccount();
		kidUsers2.requestBook();
		
		
System.out.println("\n*******************Adult1*****************************");
		
		AdultUser adultUser1 = new AdultUser(5,"Kids");
		adultUser1.registerAccount();
		adultUser1.requestBook();
		
		System.out.println("\n**********Adult2************************");
		AdultUser adultUser2 = new AdultUser(23,"Fiction");
		adultUser2.registerAccount();
		adultUser2.requestBook();


	}

}
