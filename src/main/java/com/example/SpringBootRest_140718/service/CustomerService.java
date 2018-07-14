package com.example.SpringBootRest_140718.service;

import com.example.SpringBootRest_140718.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();

}
