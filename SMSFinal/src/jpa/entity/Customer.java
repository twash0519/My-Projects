package jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/*
 * @author ahmshahparan
 *
 */

@Entity
@Table

public class Customer {
	
	@Id
	@Column(name ="id")
	private int cId;
	@Column(name = "name")
	private String cName;
	
	@Column(name = "email")
	private String cEmail;
	
	@OneToMany
	List<Product> cProducts;
	
	
	public Customer() {
		this.cId = 0;
		this.cName = "defaultCustName";
		this.cEmail = "defaultCustEmail@email.com";
		this.cProducts = new ArrayList<Product>();
	}
	
	
	public Customer(int cId, String cName, String cEmail, List<Product> cProducts) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cEmail = cEmail;
		this.cProducts = cProducts;
	}
	
	
	public String toString() {
		return "Customer ID: "+this.getcId()
				+ " Customer Name: "+this.getcName()
				+ " Customer Email: "+this.getcEmail();
	}
	
	public int getcId() {
		return cId;
	}
	
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public String getcEmail() {
		return cEmail;
	}
	
	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public List<Product> getcProducts() {
		return cProducts;
	}

	public void setcProducts(List<Product> cProducts) {
		this.cProducts = cProducts;
	}
}
