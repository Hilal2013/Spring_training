package com.cydeo.Entity;

import com.cydeo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor// you should use
@AllArgsConstructor //lombok doesnt get parent field =>id
@Table(name = "employees")
public class Employee extends BaseEntity{
    private String firstName;//column name will befirst_name
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;
}
