package com.psrroofing.psrroofing.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class RoofingServController {

    @GetMapping("/servDash")
    public String servDash() {
        return "Services";
    }

}
