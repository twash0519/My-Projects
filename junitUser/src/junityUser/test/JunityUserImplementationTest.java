package junityUser.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junitUserEntity.JunityUser;
import junityUserServices.JunityUserImplementation;

public class JunityUserImplementationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testCreateUser() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testLogin() {
		//email = "emailDefault@live.com"
		//password = "passwordDefault"
		//Before testing add the user to table JunityUser
		
		//test case1: email and password
		//fail("Not yet implemented"); // TODO
		
		//1. prepare expected values
			//testing for a valid login
		
		//2. get actual values
			//invoke the login with the test case data
		JunityUserImplementation us = new JunityUserImplementation();
		JunityUser user = new JunityUser();
		
		
		user.setEmail("emailDefault@live.com");
		user.setPassword("passwordDefault");
		
		
		boolean expected = us.login(user);
		//3. assert
			//login should return true
			assertTrue(true);
			
			
			
			us = new JunityUserImplementation();
			user = new JunityUser();
			user.setEmail("emailDefault@live.com");
			user.setPassword("passwordDefault");
			expected = us.login(user);
			assertFalse(expected);
			
	}

	@Test
	public final void testGetUserByEmail() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUserByState() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testFindUserByZipcode() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testDelete() {
		fail("Not yet implemented"); // TODO
	}

}
