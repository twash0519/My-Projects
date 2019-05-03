/**
 * 
 */
package jpa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CustomerDAO;
import jpa.dao.ProductDAO;
import jpa.entity.Customer;
import jpa.entity.Product;

/**
 * @author ahmshahparan
 *
 */
public class CustomerService implements CustomerDAO {
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMSFinal");
	static EntityManager entitymanager = emf.createEntityManager();
	
	
	public void addCustomer(int cId, String cName, String cEmail) {
		Customer customer = new Customer();
		customer.setcId(cId);
		customer.setcName(cName);
		customer.setcEmail(cEmail);
		saveCustomer(customer);
	}
	
	
	public void saveCustomer(Customer customer) {
		entitymanager.getTransaction().begin();
		entitymanager.persist(customer);
		entitymanager.getTransaction().commit();
	}
	
	
	public List<Customer> getCustomers() {
		Query query = entitymanager.createQuery("select c from Customer c");
		List<Customer> cList = query.getResultList();
		for (Customer customer : cList) {
			System.out.println(customer.toString());
			System.out.println("++++++++++++++++++++++");
		}
		return cList;
	}
	
	
	public void addProductToCustomer(int cId, int pId) {
		Product product = entitymanager.find(Product.class, pId);
		Customer customer = getCustomer(cId);
		List<Product> pList = customer.getcProducts();
		if(pList.contains(product)) {
			System.out.println("You've ordered the product already!");
		}else {
			customer.getcProducts().add(product);
			saveCustomer(customer);
		}
	}
	
	
	public Customer getCustomer(int cId) {
		Customer customer = entitymanager.find(Customer.class, cId);
		return customer;
	}
	
	
	public void getCustomerProducts(int cId) {
		Customer customer = entitymanager.find(Customer.class, cId);
		List<Product> cProducts = customer.getcProducts();
		System.out.println("Customer ID: "+customer.getcId());
		for(Product product : cProducts) {
			System.out.println(product.toString());
			System.out.println("++++++++++++++++++++++");
		}
	}


	/* (non-Javadoc)
	 * @see jpa.dao.CustomerDAO#removeCustomer(int)
	 */
	@Override
	public void removeCustomer(int cId) {
		// TODO Auto-generated method stub
		Customer customer = getCustomer(cId);
		EntityTransaction tx = entitymanager.getTransaction();
		tx.begin();
		entitymanager.remove(customer);
		tx.commit();
		System.out.println("Customer removed with id: "+cId);
	}
	
	
	public static void closeManagerAndFactory() {
		entitymanager.close();
		emf.close();
	}
	
}
