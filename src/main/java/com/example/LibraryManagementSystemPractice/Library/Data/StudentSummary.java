package com.example.LibraryManagementSystemPractice.Library.Data;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class StudentSummary {

    private final String name;

    private final String rollNo;

    public StudentSummary(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }
}
