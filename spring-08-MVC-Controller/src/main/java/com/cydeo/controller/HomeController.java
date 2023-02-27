package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){//not important mehodName//this method will work which endpoint?
        //www.amazon.com/register
        return"home.html";
    }
}
