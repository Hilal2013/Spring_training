package com.cydeo.bootstrap;

import com.cydeo.Entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {
    private final CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public void run(String... args) throws Exception { //they will come from UI but we dont have
        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Honda","Civic");
        Car c3 = new Car("Toyota","Corolla");
// i want to save objects to database
        //do we havesave method =>inside car repostiroy
        //if you want to use any method belongs to other class you need to do inject
        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }



}
