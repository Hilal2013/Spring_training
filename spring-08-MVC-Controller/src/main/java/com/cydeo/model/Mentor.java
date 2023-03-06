package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Mentor {
    private String firstName,lastName;
    private int age;
    private Gender gender;
}
