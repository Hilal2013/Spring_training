package com.cydeo.Entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class Department extends BaseEntity{

  private  String department, division;
}
