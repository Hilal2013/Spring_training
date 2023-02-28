package com.cydeo;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static void main(String[] args) {
        Mentor mentor1=new Mentor("Mike","Smith",45, Gender.MALE);
        Mentor mentor2=new Mentor("Tom","Hanks",65, Gender.MALE);
        Mentor mentor3=new Mentor("Ammy","Bryan",25, Gender.FEMALE);
        StaticConstants.MENTOR_LIST.addAll(Arrays.asList(mentor1,mentor2,mentor3));
    }
}
