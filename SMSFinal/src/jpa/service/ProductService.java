/**
 * 
 */
package jpa.service;

import java.util.List;

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
public class ProductService implements ProductDAO{

	/* (non-Javadoc)
	 * @see jpa.dao.ProductDAO#addProduct(int, java.lang.String)
	 */
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SMSFinal");
	static EntityManager entitymanager = emf.createEntityManager();
	
	public void addProduct(int pId, String pName) {
		Product product = new Product();
		product.setpId(pId);
		product.setpName(pName);
		saveProduct(product);
	}
	
	
	public void saveProduct(Product product) {
		entitymanager.getTransaction().begin();
		entitymanager.persist(product);
		entitymanager.getTransaction().commit();
	}

	/* (non-Javadoc)
	 * @see jpa.dao.ProductDAO#getProducts()
	 */
	@Override
	public List<Product> getProducts() {
		Query query = entitymanager.createQuery("select p from Product p");
		List<Product> pList = query.getResultList();
		for (Product product : pList) {
			System.out.println(product.toString());
			System.out.println("++++++++++++++++++++++");
		}
		return pList;
	}
	
	
	public Product getProduct(int pId) {
		Product product = entitymanager.find(Product.class, pId);
		return product;
		
	}
	
	public static void closeManagerAndFactory() {
		entitymanager.close();
		emf.close();
	}
	
	
}
