package com.psrroofing.psrroofing.Controllers;

import com.psrroofing.psrroofing.Models.Customer;
import com.psrroofing.psrroofing.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class SignupController {

    @Autowired
    private CustomerServices customerService;

    @GetMapping("/signup")
    public String viewDashbord(){
        return "SignUp";
    }

    @PostMapping("/signupUser")
    public String registerCustomer(@ModelAttribute Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/api/loginDash"; // redirect after successful signup
    }

}
