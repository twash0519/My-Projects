package bnym.casestudy.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entity.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {///the t s applicant and id is long
	List<Customer> findByfirstNameAndLastName(String firstName, String lastName);
	//List<Orders> findBynameAndSAddressCity(String name, String city);
	
	
};