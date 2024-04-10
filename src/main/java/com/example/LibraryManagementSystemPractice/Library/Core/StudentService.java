package com.example.LibraryManagementSystemPractice.Library.Core;

import com.example.LibraryManagementSystemPractice.Library.Data.*;
import com.example.LibraryManagementSystemPractice.Library.Persistence.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public GetStudentByNameResponse getStudentByName(GetStudentByNameRequest request)
    {
        final var students=studentRepository.getStudentByName(request.getName());

        Collection<StudentSummary> responseAccumilator=new ArrayList<>();
        for(var student: students)
        {
            responseAccumilator.add(new StudentSummary(student.getName(),student.getRollNo()));
        }

        GetStudentByNameResponse response=new GetStudentByNameResponse(responseAccumilator);
        return (response);
    }

    public GetStudentByRollNoResponse getStudentByRollNo(GetStudentByRollNoRequest request)
    {
        final var students=studentRepository.getStudentByRollNo(request.getRollno());

        Collection<StudentSummary> responseAccumilator=new ArrayList<>();
        for(var student: students)
        {
            responseAccumilator.add(new StudentSummary(student.getName(),student.getRollNo()));
        }

        GetStudentByRollNoResponse response=new GetStudentByRollNoResponse(responseAccumilator);
        return (response);
    }

}
