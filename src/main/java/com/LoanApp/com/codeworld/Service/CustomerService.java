package com.LoanApp.com.codeworld.Service;


import com.LoanApp.com.codeworld.Domian.Customer;
import com.LoanApp.com.codeworld.Repositery.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;
    public List<Customer> getAllCustomer() {
        List<Customer>customerList=repository.findAll();
        return customerList;
    }

    public void updateCustomer(Customer customer) {
        repository.save(customer);
    }

    public void addNewCustomer(Customer customer) {
        repository.save(customer);
    }

    public void deleteByCId(int id) {
        repository.deleteById(id);
    }
}
