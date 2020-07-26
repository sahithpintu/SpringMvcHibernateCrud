package net.javaguides.springmvc.service;

import java.util.List;

import net.javaguides.springmvc.entity.*;
public interface CustomerService {
	
	public List<Customer> getCustomers();
	public long saveCustomer(Customer customer);
	public Customer getCustomer(int theId);
    public void deleteCustomer(int theId);

}
