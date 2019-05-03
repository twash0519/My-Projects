package junityUserServices;

import java.util.List;

import junitUserEntity.JunityUser;

public interface JunityUserInterface {
	


	
	public boolean  login(JunityUser user);
	
	public JunityUser getUserByEmail(String email);
	
	public List<JunityUser> findUserByState(String state);
	
	public List<JunityUser> findUserByZipcode(String zipcode);

	public void createUser(JunityUser newUser);
	
	public void delete(int uId);

}
