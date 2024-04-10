package com.example.LibraryManagementSystemPractice.Library.Domain;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "borrower")
public class Borrower {

    @Id
    @Column(name = "id",nullable = false,updatable = false)
    @GeneratedValue
    private Long id;


    @JoinColumn(name = "name",nullable = false,updatable = false)
    private String name;



}
