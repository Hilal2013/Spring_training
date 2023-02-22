package com.cydeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.cydeo")
//@Component(basePackages = {"com.cydeo.proxy","com.cydeo.service","com.cydeo.repository"})
public class CommentConfig {

}
