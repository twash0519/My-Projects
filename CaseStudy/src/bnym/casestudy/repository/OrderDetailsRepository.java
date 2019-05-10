package bnym.casestudy.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bnym.casestudy.entity.OrderDetail;



@Repository
	public interface OrderDetailsRepository extends CrudRepository<OrderDetail, Long> {///the t s applicant and id is long
		
		//List<Orders> findBynameAndSAddressCity(String name, String city);
	};

