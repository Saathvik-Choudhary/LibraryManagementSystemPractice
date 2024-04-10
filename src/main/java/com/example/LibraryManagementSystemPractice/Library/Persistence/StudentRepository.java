package com.example.LibraryManagementSystemPractice.Library.Persistence;

import com.example.LibraryManagementSystemPractice.Library.Data.StudentSummary;
import com.example.LibraryManagementSystemPractice.Library.Domain.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
 public interface StudentRepository extends CrudRepository<Student,String> {         //should have been <Student,Long> as String comparison is resource intensive


    @Query("FROM Student WHERE name=?1")
    Collection<Student> getStudentByName(String name);

    @Query("FROM Student WHERE rollNo=?1")
    Collection<Student> getStudentByRollNo(String rollno);
}
