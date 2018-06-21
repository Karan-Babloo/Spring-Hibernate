package com.luv2code.springdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
				
				// get customers from the service
				List<Customer> theCustomers = customerService.getCustomer();
						
				// add the customers to the model
				theModel.addAttribute("customers", theCustomers);
				
		return "list-customers";
		
		}
	
	@RequestMapping("/add")
	public ModelAndView addcustomer(HttpServletRequest req,HttpServletResponse res) {
	
		Customer customer=new Customer();
		customer.setFirstname(req.getParameter("firstname"));
		customer.setLastname(req.getParameter("lastname"));
		customer.setEmail(req.getParameter("email"));
		
		customerService.addCustomer(customer);
		
		return new ModelAndView("add-customer");
	}
	
	
	
	
}


