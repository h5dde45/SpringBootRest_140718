package com.example.SpringBootRest_140718.service;

import com.example.SpringBootRest_140718.model.Customer;
import com.example.SpringBootRest_140718.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        log.info("getById id = {} ", id);
        return customerRepository.findById(id).get();
    }

    @Override
    public void save(Customer customer) {
        log.info("save customer = {} ", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("delete id = {} ", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("getAll");
        return customerRepository.findAll();
    }
}
