package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register
    public String register(Model model){
        model.addAttribute("mentor",new Mentor());
        //lets give this object to view through attribute
        //this mentor is holding new empty object//i need to pass this objet to view
        // object needs to be available in the form

        //    List<String> batchList = Arrays.asList("JD1","JD2","JD3");
        return "mentor/mentor-register";

    }

}
