package bnym.casestudy.services.customer;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bnym.casestudy.entity.Customer;
import bnym.casestudy.repository.CustomerRepository;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{



		@Autowired
		private CustomerRepository repository;
		

		@Override
		public List<Customer> getAllCustomers() {
			List<Customer> customerList = new ArrayList<Customer>();
			
			for(Customer customer : repository.findAll()) {
				customerList.add(customer);
			}
			return customerList;
		}

	@Override
	public Customer getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
