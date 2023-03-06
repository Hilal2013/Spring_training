package com.cydeo.bootstrap;

import com.cydeo.model.Mentor;
import com.cydeo.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<Student> createStudent(){
        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state()),
                new Student(new Faker().name().firstName(),new Faker().name().lastName(),new Faker().number().numberBetween(20,50),new Faker().address().state())
        );
        return students;
    }
    public static List<Mentor> createMentor(){
        return Arrays.asList(new Mentor("Mike","Smith",45, Gender.MALE),
                new Mentor("Tom","Hanks",65, Gender.MALE),
                new Mentor("Ammy","Bryan",25, Gender.FEMALE));

    }


}
