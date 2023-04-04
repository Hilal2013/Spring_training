package com.cydeo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data//getter setter
//@AllArgsConstructor if I put this, i need to provide object for id//but id is provided by postgres
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make, model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
