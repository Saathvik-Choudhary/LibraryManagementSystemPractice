package com.example.LibraryManagementSystemPractice.Library.Data;

public class GetStudentByRollNoRequest {

    private final String rollno;

    public GetStudentByRollNoRequest(final String rollno) {
        this.rollno = rollno;
    }

    public String getRollno() {
        return rollno;
    }
}
