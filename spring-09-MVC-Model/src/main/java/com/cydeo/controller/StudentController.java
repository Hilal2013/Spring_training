package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

  @RequestMapping("/welcome")
public String homePage(Model model){//I want to execute methode belongs to Model interface

model.addAttribute("name","Cydeo");//takes two attribute
    model.addAttribute("course","MVC");

    return "student/welcome"; //under student directory welcome file(no need .html)

}

}
