package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	private SessionFactory sf;
	

	
	@Override
	public List<Customer> getCustomer() {
		// get the current hibernate session
				Session currentSession = sf.getCurrentSession();
						
				// create a query
				Query<Customer> theQuery = 
						currentSession.createQuery("from Customer", Customer.class);
				
				// execute query and get result list
				List<Customer> customers = theQuery.list();
				System.out.println("here is the "+customers);		
				// return the results		
				return customers;
	}




	@Override
	public void addCustomer(Customer cr) {
		// TODO Auto-generated method stub
		cr.setId(5);
		System.out.println(cr.getFirstname());
		System.out.println(cr.getLastname());
		System.out.println(cr.getEmail());
		Session currentSession = sf.getCurrentSession();
		currentSession.save(cr);
		
	}

}
