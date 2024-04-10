package com.example.LibraryManagementSystemPractice.Library.Data;

import java.util.ArrayList;
import java.util.Collection;

public class GetBookByIsbnResponse {

    private final Collection<BookSummary> books=new ArrayList<>();

    public GetBookByIsbnResponse(Collection<BookSummary> books) {
        this.books.addAll(books);
    }

    public Collection<BookSummary> getBooks() {
        return books;
    }

}
