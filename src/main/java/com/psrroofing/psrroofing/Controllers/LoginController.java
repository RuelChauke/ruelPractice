package com.psrroofing.psrroofing.Controllers;

import ch.qos.logback.core.model.Model;
import com.psrroofing.psrroofing.Models.Customer;
import com.psrroofing.psrroofing.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping("/loginDash")
    public String viewDashbord(){
        return "Login";
    }

    @PostMapping("/loggedIn")
    public String getDashboard(@RequestParam String email,
                               @RequestParam String password,
                               Model model){

        Customer cust = customerServices.findUser(email, password);

        if(cust != null){

            return "Customers";

        }else{

            return "Login";

        }

    }

}
