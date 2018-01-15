package com.pack.foundry.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.foundry.bean.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
