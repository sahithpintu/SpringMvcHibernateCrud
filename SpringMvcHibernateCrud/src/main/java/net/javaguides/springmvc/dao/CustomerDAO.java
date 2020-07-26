package net.javaguides.springmvc.dao;

import java.util.List;

import net.javaguides.springmvc.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	public long saveCustomer(Customer customer);
	public Customer getCustomer(int theId);
    public void deleteCustomer(int theId);

}
