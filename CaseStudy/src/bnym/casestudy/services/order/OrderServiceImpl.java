package bnym.casestudy.services.order;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import bnym.casestudy.entity.Orders;
import bnym.casestudy.repository.OrdersRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService  {
	

	@Autowired
	private OrdersRepository repository;

	@Override
	public List<Orders> getAllOrders() {
		List<Orders> orderList = new ArrayList<Orders>();
		
		for(Orders orders : repository.findAll()) {
			orderList.add(orders);
		}
		return orderList;
	}
	
	


	@Override
	public Orders getOrderById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteOrderById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
