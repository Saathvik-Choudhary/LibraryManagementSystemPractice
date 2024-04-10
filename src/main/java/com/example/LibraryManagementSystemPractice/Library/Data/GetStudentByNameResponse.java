package com.example.LibraryManagementSystemPractice.Library.Data;


import com.example.LibraryManagementSystemPractice.Library.Domain.Student;

import java.util.Collection;

public class GetStudentByNameResponse {

    private final Collection<StudentSummary> students;

    public GetStudentByNameResponse(final Collection<StudentSummary> students) {
        this.students = students;
    }

    public Collection<StudentSummary> getStudents() {
        return this.students;
    }
}
