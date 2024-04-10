package com.example.LibraryManagementSystemPractice.Library.Data;

import org.springframework.lang.NonNull;

public class GetBookByAuthorRequest {

    private final String author;

    public GetBookByAuthorRequest(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
