package com.psrroofing.psrroofing.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomePage() throws IOException {
        return "Welcome";
    }

}
