package com.example.SpringBootRest_140718.rest;

import com.example.SpringBootRest_140718.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CustomerRestController {

    @Autowired
    private CustomerService customerService;


}
