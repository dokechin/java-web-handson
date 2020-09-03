package com.example.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.persistence.entity.Customer;

// TODO 1-07 Spring DataのCrudRepository<Customer, Integer>を継承する
public interface  CustomerRepository extends CrudRepository<Customer, Integer>{
}
