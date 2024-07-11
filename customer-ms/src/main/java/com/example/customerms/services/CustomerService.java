package com.example.customerms.services;

import com.example.customerms.entities.Customer;
import com.example.customerms.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer getById(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer create(Customer customer) {
        Customer saveCustomer = customerRepository.save(customer);
        return saveCustomer;
    }
}
