package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com",name="USER-CLIENT")
public interface UserClient {
    @GetMapping("/users")
    List<User> getUsers();
    //whenever you call this method=>this endpoint(URI) will be executed with the get mapping
    // it will hit this endpoint("https://jsonplaceholder.typicode.com)
   //and it will add this  "/users" endpoint too
//after executing Json is coming and Json is assigned to your DTO(User)

}
