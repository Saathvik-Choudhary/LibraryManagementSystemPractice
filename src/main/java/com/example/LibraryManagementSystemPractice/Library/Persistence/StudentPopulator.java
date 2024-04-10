package com.example.LibraryManagementSystemPractice.Library.Persistence;

import com.example.LibraryManagementSystemPractice.Library.Domain.Book;
import com.example.LibraryManagementSystemPractice.Library.Domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@Repository
public class StudentPopulator implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public void run(String... args) throws Exception {
        populateStudent();
    }

    private void populateStudent() {

        Collection<Student> students= new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            students.add(new Student( "name"+i,
                    "rollno"+i,
                    LocalDate.parse("2002-05-12")
            ));
        }
        studentRepository.saveAll(students);

        System.out.println("Student Repository was populated");
    }
}

