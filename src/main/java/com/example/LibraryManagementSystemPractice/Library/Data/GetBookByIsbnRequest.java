package com.example.LibraryManagementSystemPractice.Library.Data;

public class GetBookByIsbnRequest {

    private final String isbn;

    public GetBookByIsbnRequest(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
