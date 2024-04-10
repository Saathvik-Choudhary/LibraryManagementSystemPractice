package com.example.LibraryManagementSystemPractice.Library.Data;

import java.util.ArrayList;
import java.util.Collection;

public class GetBookByAuthorResponse {

    private final Collection<BookSummary> books=new ArrayList<>();

    public GetBookByAuthorResponse(Collection<BookSummary> books) {
        this.books.addAll(books);
    }

    public Collection<BookSummary> getBooks() {
        return books;
    }
}
