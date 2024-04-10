package com.example.LibraryManagementSystemPractice.Library.Data;

import java.util.Collection;

public class GetStudentByRollNoResponse {
    private final Collection<StudentSummary> students;

    public GetStudentByRollNoResponse(Collection<StudentSummary> students) {
        this.students = students;
    }

    public Collection<StudentSummary> getStudents() {
        return students;
    }
}
