package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer();
	}
	
	@Transactional
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDAO.addCustomer(customer);
		return;
	}


}