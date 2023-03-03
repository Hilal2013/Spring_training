package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @RequestMapping("/register") //localhost:8080/mentor/register
    public String register(Model model){
model.addAttribute("mentors",DataGenerator.createMentor());
        return "mentor/register";
    }


}
