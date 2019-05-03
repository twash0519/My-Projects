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
public interface ProductDAO {	
	
	//Add A Product
	public void addProduct(int pId, String pName);
	
	//Get All Products
	public List<Product> getProducts();
	
	//Get A Product
	public Product getProduct(int pId);
	
}
