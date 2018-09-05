package com.karan.springdemo.dao;
import java.util.List;

import com.karan.springdemo.entity.Customer;
public interface CustomerDAO {

	public List<Customer> getCustomer();
	
	public void addCustomer(Customer cr);
}



