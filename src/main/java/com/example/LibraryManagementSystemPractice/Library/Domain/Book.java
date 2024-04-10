package com.example.LibraryManagementSystemPractice.Library.Domain;

import jakarta.persistence.*;

@Entity
@Table(name="book")
public class Book {

    @Column(name="author",nullable = false,updatable = false)
    private String author;

    @Column(name="isbn",nullable = false,updatable = false)
    private String isbn;

    @Column(name="publisher",nullable = false,updatable = false)
    private String publisher;

    @Column(name="title",nullable = false,updatable = false)
    private String title;

    @Id
    @GeneratedValue
    private Long id;


    public Book()
    {super();
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public Long getId() {
        return id;
    }

    public Book(String author, String iSBN, String publisher, String title) {
        this.author = author;
        this.isbn = iSBN;
        this.publisher = publisher;
        this.title = title;
    }
}
