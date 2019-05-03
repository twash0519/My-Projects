package junityUser.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ JunityUserTest.class, JunityUserImplementationTest.class, UserEquals.class })
public class AllTests {

}
