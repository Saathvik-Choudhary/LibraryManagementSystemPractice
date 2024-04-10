package com.example.LibraryManagementSystemPractice.Library.Domain;


import jakarta.persistence.*;

@Entity
@Table(name = "borrower")
public class Borrow {

    @Id
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;


    //@Embedded
    //private final Student student;

    //@Embedded
    //private final Book book;

}
