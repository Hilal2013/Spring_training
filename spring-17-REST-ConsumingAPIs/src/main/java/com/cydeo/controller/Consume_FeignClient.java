package com.cydeo.controller;

import com.cydeo.client.EmployeeClient;
import com.cydeo.client.UserClient;
import com.cydeo.dto.ResponseWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consume_FeignClient {
private final UserClient userClient;
private final EmployeeClient employeeClient;
    public Consume_FeignClient(UserClient userClient, EmployeeClient employeeClient) {
        this.userClient = userClient;
        this.employeeClient = employeeClient;
    }

    //I want to show this class
    @GetMapping("/api/v1/users")//Im creating endpoint
    public ResponseEntity<ResponseWrapper> getUsers(){

return ResponseEntity.ok(new ResponseWrapper("UserLIst Retrieved",userClient.getUsers()));
    }
//whenever we say localhost:8080/api/v1/users (we hit endpoint) //is gonna go dispatcher servlet //
// dispaatcher servlet is gonna find correct controller with the this endpoint
//we found method
//now we are gonna try to figure out the body //what can I put the body//to modify customize body I use ResponseWrapper
//what I see as a Data go to UserClient =>getUsers method//this method is consuming//whenever execute this method
//it will go to URI endpoint//it will execute this URI endpoint with the getMapping endpoint
//it will get the response and it will convert to the my DTO through Jackson

    //dummy

@GetMapping("/api/v1/employee")
    public ResponseEntity<ResponseWrapper> getEmployee(){
//im creating my own Api
return ResponseEntity.ok(new ResponseWrapper("Employee retrieved",
        employeeClient.getEmployee("6298ebfecd0551211fce37a6") ));

}


}

