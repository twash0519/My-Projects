package bnym.casestudy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	private int quantity;
	@OneToOne
	private Product product;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQuantiy() {
		return quantity;
	}
	public void setQuantiy(int quantiy) {
		this.quantity = quantiy;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
