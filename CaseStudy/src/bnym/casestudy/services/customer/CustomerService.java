package bnym.casestudy.services.customer;

import java.util.List;

import bnym.casestudy.entity.Customer;



public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(Long id);
	public boolean deleteCustomerById(Long id);

}
