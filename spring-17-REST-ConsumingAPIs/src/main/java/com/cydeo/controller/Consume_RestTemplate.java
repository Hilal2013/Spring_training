package com.cydeo.controller;

import com.cydeo.dto.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
@RequestMapping("/cydeo")
public class Consume_RestTemplate {
    private final String URI = "https://jsonplaceholder.typicode.com/users";// ready json
    private final RestTemplate restTemplate;

    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    //im gonna create my own method // im creating API endpoint//this endpoint is gonna consume Jsonplace holder

    @GetMapping
    public ResponseEntity<User[]> readAllUsers(){
     return   restTemplate.getForEntity(URI, User[].class);
//it is asking two things String and class//string is URI that you consumed
        //class is which dto you want to convert
//this already returns ResponseEntity

    }
@GetMapping("{id}")
    public Object readUser(@PathVariable("id") Integer id){

        String URL= URI+"{/id}";
        return restTemplate.getForObject(URL,Object.class,id);
        //I can use for every class
    //getfor entity's advantage=>you can manipulate that dto

}
    @GetMapping("/test")
    public ResponseEntity<Object> consumePostFromDummyApi(){
//we set the headers
        HttpHeaders headers =new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("app-id","6298ebfecd0551211fce37a6");

        HttpEntity<String> entity = new HttpEntity<>(headers);
//exchange we use for pass the headers
        return restTemplate.exchange("https://dummyapi.io/data/v1/user?limit=10", HttpMethod.GET,entity,Object.class);

    }


}
