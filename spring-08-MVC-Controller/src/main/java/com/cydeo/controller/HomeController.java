package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")//localhost:8080/home  write your chrome
    public String home(){//not important mehodName//this method will work which endpoint?
        //www.amazon.com/register//
        return"home.html";
    }

    @RequestMapping("/ozzy") //localhost:8080/ozzy  write your chrome
    public String getHomePage(){

        return"home.html";
    }
    @RequestMapping //if you dont pu anything or just / still works as default
    public String getHome(){

        return"home.html";
    }

    @RequestMapping ({"/apple","/orange"})//same vieww can come with this couple of endpoints
    public String get(){

        return"home.html";
    }
    @RequestMapping("/home")
    public String getPage() {

        return "olaf.html";
    }

}
