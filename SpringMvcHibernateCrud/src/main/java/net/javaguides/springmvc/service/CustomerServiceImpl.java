package net.javaguides.springmvc.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.javaguides.springmvc.dao.CustomerDAO;
import net.javaguides.springmvc.entity.Customer;

@Service
@Transactional(readOnly = true)
public class CustomerServiceImpl implements CustomerService{

	@Autowired 
	private CustomerDAO dao;
	
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		
		return dao.getCustomers();
	}

	@Override
	@Transactional
	public long saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return dao.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		dao.deleteCustomer(theId);
		
	}

}
