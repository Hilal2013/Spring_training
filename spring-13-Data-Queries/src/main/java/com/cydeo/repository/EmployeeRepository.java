package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //Display all employees with email address ""

List<Employee> findByEmail(String email);

    //Display all employees with firstname "" and last name "",
    //also show all employees with an email address ""
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName,String lastName, String email);

    //Display all employees that first name is not ""
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ""
    List<Employee> findByLastNameStartsWith(String pattern);

    //Display all employees with salaries higher than ""
    List<Employee> findBySalaryGreaterThan(Integer salary);
    //Display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer salary);
    //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateIsBetween(LocalDate startDate, LocalDate endDate);
    //Display all employees where salaries greater and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);
    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);
    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();


    @Query("select employee from Employee employee where employee.email='amcnee1@google.es'  ")
    Employee retrieveEmployeeDetail();//it doesnt derive query method name cann be everything
    @Query("select e.salary from Employee e WHERE e.email='amcnee1@google.es' ")
    Integer retrieveEmployeeSalary();// i need to get salary field //through object//object.salary e. salary

   // List<Employee> retrieveEmployeeFirstNameLike(String pattern);

   // List<String> retrieveEmployeeSalaryGreaterThan(int salary);
   // List<Employee> retrieveEmployeeSalaryBetween(int salary1,int salary2);
}
