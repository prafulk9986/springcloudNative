package com.pack.foundry.service;

import java.util.List;

import com.pack.foundry.bean.Customer;

public interface CustomerService {

	public void insert(Customer customer);

	public List<Customer> getAllCustomers();

	public Customer getCustomer(Integer custId);
}
