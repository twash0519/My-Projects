package bnym.casestudy.services.orderDetail;

import java.util.List;

import bnym.casestudy.entity.OrderDetail;

public interface OrderDetailService {
	public List<OrderDetail> getAllOrderDetails();
	public OrderDetail getAllOrderDetailsById(Long id);
	public boolean deleteAllOrderDetailsById(Long id);

}
