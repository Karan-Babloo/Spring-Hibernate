package com.karan.springdemo.service;

import java.util.List;

import com.karan.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();

	public void addCustomer(Customer customer);
	
	
}
