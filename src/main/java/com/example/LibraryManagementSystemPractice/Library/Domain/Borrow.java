package com.example.LibraryManagementSystemPractice.Library.Domain;


import jakarta.persistence.*;

@Entity
@Table(name = "borrower")
public class Borrow {

    @Id
    @Column(name = "id",nullable = false,updatable = false)
    private Long id;


    //@Embedded
    // embedded entity can't be used as it will include the entire student entity into
    // the borrower entity so it is going to club the two entities
    //so you can't use id multiple times including the embedded entities
    //private final Student student;

    //@Embedded
    //private final Book book;

}
