package com.example.LibraryManagementSystemPractice.Library.Data;

import com.opensymphony.xwork2.validator.annotations.Validations;
import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotEmpty;
import org.springframework.boot.web.reactive.error.ErrorWebExceptionHandler;
import org.springframework.lang.NonNull;
import org.springframework.web.ErrorResponse;
import org.xml.sax.ErrorHandler;

import javax.xml.transform.ErrorListener;


public class PutBookResponse {

    @NotBlank(message = "can't be blank")
    @NotEmpty(message = "can't be empty")
    @NonNull
    private final String author;

    @NotBlank(message = "can't be blank")
    @NotEmpty(message = "can't be empty")
    @NonNull
    private final String isbn;

    @NotBlank(message = "can't be blank")
    @NotEmpty(message = "can't be empty")
    @NonNull
    private final String publisher;

    @NotBlank(message = "can't be blank")
    @NotEmpty(message = "can't be empty")
    @NonNull
    private final String title;

    public PutBookResponse(String author, String isbn, String publisher, String title) {
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
