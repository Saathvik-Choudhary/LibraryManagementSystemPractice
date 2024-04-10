package com.example.LibraryManagementSystemPractice.Library.Data;

import jakarta.persistence.Column;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotEmpty;
import org.springframework.lang.NonNull;

public class PutBookRequest {
    @NotBlank
    @NotEmpty
    @NonNull
    private final String author;

    @NotBlank
    @NotEmpty
    @NonNull
    private final String isbn;

    @NotBlank
    @NotEmpty
    @NonNull
    private final String publisher;

    @NotBlank
    @NotEmpty
    @NonNull
    private final String title;

    public PutBookRequest(String author, String isbn, String publisher, String title) {
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.title = title;
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
}
