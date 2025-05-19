package com.psrroofing.psrroofing.Repositories;

import com.psrroofing.psrroofing.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findCustomerByIdNo(String idNo);
    Customer findCustomerByEmail(String email);

}
