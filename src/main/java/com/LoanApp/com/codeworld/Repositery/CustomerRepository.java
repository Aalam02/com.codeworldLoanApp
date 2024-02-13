package com.LoanApp.com.codeworld.Repositery;


import com.LoanApp.com.codeworld.Domian.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "Select * from customer",nativeQuery = true)
    List<Customer>getAllCustomer();
}
