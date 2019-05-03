/**
 * 
 */
package jpa.dao;

import java.util.List;

import jpa.entity.Customer;
import jpa.entity.Product;

/**
 * @author ahmshahparan
 *
 */
public interface CustomerDAO {	
	
	//Add A Customer
	public void addCustomer(int cId, String cName, String cEmail);
	
	//Get All Customer
	public List<Customer> getCustomers();
	
	//Get A Customer
	public Customer getCustomer(int cId);
	
	//Add Product to Customer
	public void addProductToCustomer(int cId, int pId);
	
	//Get A Customer Products
	public void getCustomerProducts(int cId);
	
	//Remove A Customer
	public void removeCustomer(int cId);

}
