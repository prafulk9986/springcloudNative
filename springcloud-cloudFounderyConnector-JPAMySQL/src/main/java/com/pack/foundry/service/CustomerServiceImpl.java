package com.pack.foundry.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.foundry.bean.Customer;
import com.pack.foundry.controller.Controller;
import com.pack.foundry.dao.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	  private static Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository custRepo;

	@Override
	public void insert(Customer customer) {
		log.info("CustomerServiceImpl customer:::" + customer);
		custRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return (List<Customer>) custRepo.findAll();
	}

	@Override
	public Customer getCustomer(Integer custId) {
		return custRepo.findOne(custId);
	}

}
