package com.cydeo.repository;

import com.cydeo.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
    //my car repository has now 25 methods
    //why we used Car, Long=>why interface is looking those?
    //implemantation is sql/Table name,primary key

}
