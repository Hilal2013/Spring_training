package com.cydeo.controller;

import com.cydeo.MentorData;
import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {
  @RequestMapping("/list")
  public String getMentorPage(Model model){
    model.addAttribute("mentors", MentorData.getAll());
return "mentor/mentorTable";

  }

}
