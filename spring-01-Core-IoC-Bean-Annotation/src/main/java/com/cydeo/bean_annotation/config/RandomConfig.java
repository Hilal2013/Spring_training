package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {

@Bean
    public String mySting(){
        return "Cydeo";
    }
    @Bean
    public Integer myInteger(){
        return 5;
    }
}
