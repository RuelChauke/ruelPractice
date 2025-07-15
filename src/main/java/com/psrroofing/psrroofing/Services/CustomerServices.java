package com.psrroofing.psrroofing.Services;

import com.psrroofing.psrroofing.Models.Customer;
import com.psrroofing.psrroofing.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

}
