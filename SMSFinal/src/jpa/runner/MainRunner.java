/**
 * 
 */
package jpa.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;

import jpa.dao.CustomerDAO;
import jpa.dao.ProductDAO;
import jpa.entity.Customer;
import jpa.service.CustomerService;
import jpa.service.ProductService;

/**
 * @author ahmshahparan
 *
 */
public class MainRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		CustomerDAO customerDAO = new CustomerService();
		ProductDAO productDAO = new ProductService();

		// Unique ID
		customerDAO.addCustomer(1, "Maria", "a@live.com");
		customerDAO.addCustomer(2, "Max", "m@live.com");

		// Unique ID
		productDAO.addProduct(101, "Coffee");
		productDAO.addProduct(102, "Bagel");
		productDAO.addProduct(103, "Cup Cake");

		System.out.println("======================Get All Customers======================");
		customerDAO.getCustomers();

		System.out.println("======================Get All Products======================");
		productDAO.getProducts();

		System.out.println("======================Get Customer by ID======================");
		System.out.println(customerDAO.getCustomer(1));

		System.out.println("======================Get Product by ID======================");
		System.out.println(productDAO.getProduct(101));

		// One-to-many relation
		// Implement unique product item for each customer
		customerDAO.addProductToCustomer(1, 101);
		customerDAO.addProductToCustomer(1, 101); //Duplicate pair shouldn't be added into table, notify user
		customerDAO.addProductToCustomer(1, 102);
		customerDAO.addProductToCustomer(1, 103);
		customerDAO.addProductToCustomer(2, 101);
		customerDAO.addProductToCustomer(2, 102);

		// Customer-Products lookup
		System.out.println("======================Get Products by Customer======================");
		customerDAO.getCustomerProducts(1);
		
		// Remove A Customer
		customerDAO.removeCustomer(2);

		//Truncate the tables
//		em.getTransaction().begin();
//		em.createNativeQuery("DELETE FROM Customer_Product").executeUpdate();
//		em.createNativeQuery("DELETE FROM Customer").executeUpdate();
//		em.createNativeQuery("DELETE FROM Product").executeUpdate();
//		em.getTransaction().commit();
		

		// Close factory and manager
		CustomerService.closeManagerAndFactory();
		ProductService.closeManagerAndFactory();
	}
}
