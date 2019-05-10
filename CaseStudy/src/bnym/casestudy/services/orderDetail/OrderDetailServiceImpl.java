package bnym.casestudy.services.orderDetail;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entity.OrderDetail;
import bnym.casestudy.repository.OrderDetailsRepository;



@Service
@Transactional
public class OrderDetailServiceImpl implements OrderDetailService {


	@Autowired
	private OrderDetailsRepository repository;
	
	@Override
	public List<OrderDetail> getAllOrderDetails() {
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
		
		for(OrderDetail orderDetail : repository.findAll()) {
			orderDetailList.add(orderDetail);
		}
		return orderDetailList;
	}

	@Override
	public OrderDetail getAllOrderDetailsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAllOrderDetailsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
