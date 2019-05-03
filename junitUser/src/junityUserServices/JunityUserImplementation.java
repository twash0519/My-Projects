package junityUserServices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import junitUserEntity.JunityUser;

public class JunityUserImplementation implements  JunityUserInterface{
	
	public void createUser(JunityUser pUser ) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("junitUser");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
			
	//	JunityUser book1 = new JunityUser(1, "m@olive.com", "Mike", "123456", "22 Brook", "NY","11368");
		manager.persist(pUser);

		System.out.println("user created");
		
		
		//commit the database action
		manager.getTransaction().commit();
		
		//close factory and manager
		manager.close();
		factory.close();
		
		
		
	}
	
	
	

	@Override
	public boolean login(JunityUser jUser) {
		
		// TODO Auto-generated method stub
		
		//1 factory & manager
		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("junitUser");
		EntityManager entityManager = entityManagerfactory.createEntityManager();
		
		//2  transaction
		//you do not need transaction begin when you do query
		//entityManager.getTransaction().begin();
		
		String givenEmail = jUser.getEmail();
		String givenPassword = jUser.getPassword();
		
		Query queryLogin = entityManager.createQuery("select u from JunityUser u where u.email = :givenEmail and u.password = :givenPassword");
		queryLogin.setParameter("givenEmail", givenEmail);
		queryLogin.setParameter("givenPassword", givenPassword);
		
		List<JunityUser> userList = queryLogin.getResultList();
		
		
		
		
		//3 close manager & factory
		entityManager.close();
		entityManagerfactory.close();
		
		
		if (userList.size()< 0) { System.out.println("User = " + userList.get(0).getEmail());
			return true;
		}
		return false;
		}
		
	

	@Override
	public JunityUser getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JunityUser> findUserByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JunityUser> findUserByZipcode(String zipcode) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void delete(int uId) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("junitUser");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		JunityUser findUser = manager.find(JunityUser.class, uId);
		manager.remove(findUser);
		
		System.out.println("user deleted");
		
		manager.getTransaction().commit();
		
		
		manager.close();
		factory.close();
		
		
		
		


		
	}
	

}
