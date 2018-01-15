package com.pack.foundry.controller;

import java.lang.reflect.Method;
import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pack.foundry.bean.Customer;
import com.pack.foundry.service.CustomerService;

@RestController
public class Controller {

	  private static Logger log = LoggerFactory.getLogger(Controller.class);

	@Autowired
	CustomerService custService;
	

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String addRecord(@RequestBody Customer customer) {
		log.info("Controller customer:::" + customer.toString());
		custService.insert(customer);
		return "Added successful";
	}

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String getMessage() {
		return "Hello Praful from PCF";
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		return custService.getAllCustomers();
	}

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Customer getCustomers(@PathParam("id") String id) {
		return custService.getCustomer(Integer.valueOf(id));
	}

}
