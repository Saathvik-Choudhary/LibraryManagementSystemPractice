package com.example.LibraryManagementSystemPractice.Library.Api;

import com.example.LibraryManagementSystemPractice.Library.Core.StudentService;
import com.example.LibraryManagementSystemPractice.Library.Data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentApi {

    @Autowired
    StudentService studentService;

    @GetMapping("/name/{name}")
    public ResponseEntity<GetStudentByNameResponse> getStudentByName(@PathVariable final String name)
    {
        return ResponseEntity.ok(studentService.getStudentByName(new GetStudentByNameRequest(name)));
    }

    @GetMapping("/rollno/{rollno}")
    public ResponseEntity<GetStudentByRollNoResponse> getStudentByRollNo(@PathVariable final String rollno)
    {
        return ResponseEntity.ok(studentService.getStudentByRollNo(new GetStudentByRollNoRequest(rollno)));
    }

}
