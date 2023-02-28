package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Mentor {
    private String firstName,lastName;
    private Gender gender;
}
