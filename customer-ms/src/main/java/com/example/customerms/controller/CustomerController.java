package com.example.customerms.controller;

import com.example.customerms.dto.CustomerInfo;
import com.example.customerms.entities.Customer;
import com.example.customerms.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerInfo customerInfo;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable(name = "id") Long id) {
        Customer customer = customerService.getById(id);

        return ResponseEntity.ok().body(customer);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> getAllCustomers() {
       List<Customer> customers = customerService.getAll();

        return ResponseEntity.ok().body(customers);
    }

    @GetMapping(path = "info")
    public ResponseEntity<CustomerInfo> getInfo() {
        return ResponseEntity.ok().body(customerInfo);
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer response = customerService.create(customer);
        return ResponseEntity.status(201).body(response);
    }


}
