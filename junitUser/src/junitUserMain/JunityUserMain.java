package junitUserMain;


import junitUserEntity.JunityUser;
import junityUserServices.JunityUserImplementation;
import junityUserServices.JunityUserInterface;

public class JunityUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		JunityUserInterface us = new JunityUserImplementation();

		//create user
		//JunityUserInterface junitCustomer= new JunityUserImplementation();
		//junitCustomer.createUser();


		JunityUser newUser = new JunityUser();
		
		newUser.setId(3);
		 newUser.setEmail("emailDefault@live.com");
		 newUser.setAddress("addressDefault");
		 newUser.setName("nameDefault");
		 newUser.setPassword("passwordDefault");
		 newUser.setState("stateDefault");
		 newUser.setZipCode("zipcodeDefault");
		// us.createUser(newUser);

		 us.delete(1);
		 
		
		

/*
		
		if(us.login(newUser)) {
			System.out.println("welcome");
		}else {
			System.out.println("bye bye");
		}
*/
	}

}
