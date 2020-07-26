package net.javaguides.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springmvc.entity.Customer;
import net.javaguides.springmvc.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	@PostMapping("/customer")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer) {
		
		long id=customerservice.saveCustomer(customer);
		
		return ResponseEntity.ok().body("Id has been added" +id);
	}
	@GetMapping("/customer/{id}")
   public ResponseEntity<Customer> getCustomer(@PathVariable("id") int  id)
   {
		      Customer customer=customerservice.getCustomer(id);
		
	return ResponseEntity.ok().body(customer);
	   
   }
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getCustomers()
	{
		List<Customer> cust=customerservice.getCustomers();
		return ResponseEntity.ok().body(cust);
		
	}
	@DeleteMapping("/customer/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") int id) {
		customerservice.deleteCustomer(id);
	      return ResponseEntity.ok().body("Book has been deleted successfully.");
	   }
}
