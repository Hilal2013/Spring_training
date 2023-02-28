package com.cydeo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class CarController {
@RequestMapping("/info")
    public String carInfo(){

        return "car/car-info";
    }

}
