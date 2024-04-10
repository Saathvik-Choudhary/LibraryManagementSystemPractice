package com.example.LibraryManagementSystemPractice.Library.Domain;


import jakarta.persistence.*;

@Entity
@Table(name = "borrower")
public class Borrow {

    @Id
    @Column(name = "id",nullable = false,updatable = false)
    @GeneratedValue
    private Long id;


    @Embedded
    private final Student student;

    @Embedded
    private final Book book;


    public Borrow(Student student, Book book) {
        this.student = student;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Book getBook() {
        return book;
    }
}
