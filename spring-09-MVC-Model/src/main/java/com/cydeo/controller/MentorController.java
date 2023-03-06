package com.cydeo.controller;

import com.cydeo.MentorData;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String getMentorPage(Model model) {
        model.addAttribute("mentors", MentorData.getAll());
        return "mentor/mentorTable";

    }



}
