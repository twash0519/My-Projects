package bnym.casestudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import bnym.casestudy.entity.OrderDetail;
import bnym.casestudy.entity.Orders;

import bnym.casestudy.services.order.OrderService;
import bnym.casestudy.services.orderDetail.OrderDetailService;


@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderDetailService orderDetailService;
	
	@RequestMapping("/orderDisplay")
	public ModelAndView displayAllOrders() {
		
		
		ModelAndView model = new ModelAndView("sales");
		List<Orders>orderList = orderService.getAllOrders();
		List<OrderDetail>orderDetailList = orderDetailService.getAllOrderDetails();
		
		model.addObject("orderList", orderList);
		model.addObject("orderDetailList", orderDetailList);
		return model;
		
		
	}

}
