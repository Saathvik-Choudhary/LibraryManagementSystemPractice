package com.example.LibraryManagementSystemPractice.Library.Persistence;

import com.example.LibraryManagementSystemPractice.Library.Data.StudentSummary;
import com.example.LibraryManagementSystemPractice.Library.Domain.Book;
import com.example.LibraryManagementSystemPractice.Library.Domain.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
 public interface StudentRepository extends CrudRepository<Student,String>, JpaSpecificationExecutor<Student> {         //should have been <Student,Long> as String comparison is resource intensive


    @Query("FROM Student WHERE name=?1")
    Collection<Student> getStudentByName(String name);

    default List<Student> findStudentByName(String name)
    {
        Specification<Student> specification=(root,query,builder)->builder.equal(root.get("name"),name);

        return findAll(specification);
    }


    @Query("FROM Student WHERE rollNo=?1")
    Collection<Student> getStudentByRollNo(String rollno);

    default List<Student> findStudentByRollNo(String rollNo)
    {
        Specification<Student> specification=(root, query, builder)->builder.equal(root.get("rollno"),rollNo);

        return findAll(specification);
    }
}
