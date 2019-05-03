package junityUser.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junitUserEntity.JunityUser;

public class UserEquals {

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
	public final void testEqualsObject() {
		
		
		JunityUser expected = new JunityUser();
		expected.setId(1);
		expected.setEmail("emailSample");
		expected.setPassword("passwordSample");
		expected.setName("Mike");
		expected.setAddress("222");
		expected.setState("NY");
		expected.setZipCode("23421");
		
		
		JunityUser	actual = new JunityUser();
		actual.setId(1);
		actual.setEmail("emailSample");
		actual.setPassword("passwordSample");
		actual.setName("Mike");
		actual.setAddress("222");
		actual.setState("NY");
		actual.setZipCode("23421");
		
		assertEquals(expected,actual);
		
		
		//fail("Not yet implemented"); // TODO
	}

}
