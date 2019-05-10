package bnym.casestudy.services.order;

import java.util.List;


import bnym.casestudy.entity.Orders;

public interface OrderService {
	public List<Orders> getAllOrders();
	public Orders getOrderById(Long id);
	public boolean deleteOrderById(Long id);

}
