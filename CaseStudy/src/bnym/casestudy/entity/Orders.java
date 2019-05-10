package bnym.casestudy.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	private Date orderDate;
	private Date shippedDate;
	
	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=true )
	private OrderAddress orderAddress;
	
	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
	private PointOfSale pointOfSale;
	
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL, orphanRemoval=true)
	private List<OrderDetail> orderDetails;

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public OrderAddress getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(OrderAddress orderAddress) {
		this.orderAddress = orderAddress;
	}

	public PointOfSale getPointOfSale() {
		return pointOfSale;
	}

	public void setPointOfSale(PointOfSale pointOfSale) {
		this.pointOfSale = pointOfSale;
	}

}
