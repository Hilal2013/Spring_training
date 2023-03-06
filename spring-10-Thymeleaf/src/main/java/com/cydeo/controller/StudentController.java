package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")

public class StudentController {
 //   @RequestMapping(value = "/register",method = RequestMethod.GET) //localhost:8080/student/register
    @GetMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping("/welcome")//http://localhost:8080/student/welcome
    public String welcome(Model model){
       model.addAttribute("students",DataGenerator.createStudent());
      //on console prints for example Titus
        return "student/welcome";
    }
   //Welcome to Cydeo!
    //Titus
    //Privacy Terms

    /*
    @RequestMapping("/welcome")
    public String welcome(){
        return "student/welcome";
    }


     */
}
