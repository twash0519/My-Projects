package bnym.casestudy.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import bnym.casestudy.entity.Orders;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long> {///the t s applicant and id is long
	List<Orders> findByOrderDateAndShippedDate(Date orderDate, Date shippedDate);
	//List<Orders> findBynameAndSAddressCity(String name, String city);
};
