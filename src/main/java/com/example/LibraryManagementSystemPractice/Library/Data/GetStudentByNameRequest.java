package com.example.LibraryManagementSystemPractice.Library.Data;

public class GetStudentByNameRequest {

    private final String name;

    public GetStudentByNameRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
