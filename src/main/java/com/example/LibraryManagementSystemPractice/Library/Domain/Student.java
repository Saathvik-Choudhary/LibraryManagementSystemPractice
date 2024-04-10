package com.example.LibraryManagementSystemPractice.Library.Domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "student")
public class Student {

    private int age;

    @Column(name = "dob",nullable = false,updatable = false)
    private LocalDate dob;

    @Column(name = "name",nullable = false,updatable = false)
    private String name;

    @Id
    @Column(name = "rollno",nullable = false,updatable = false)
    private String rollNo;

    public Student(String name, String rollNo, LocalDate dob) {
        this.name = name;
        this.rollNo = rollNo;
        this.dob = dob;

    }
    public Student()
    {
        super();
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and current date
        Period period = Period.between(this.dob, currentDate);

        // Extract the years from the period
        this.age = period.getYears();
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

}
