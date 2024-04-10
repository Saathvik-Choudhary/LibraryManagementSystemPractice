package com.example.LibraryManagementSystemPractice.Library.Data;


import net.sf.oval.constraint.NotBlank;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.Size;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

@Validated
public class BookSummary {

    @Size(max = 100,min = 2)
    @NonNull
    @NotEmpty(message = "The Title can't be empty")
    @NotBlank(message = "The Title can't be blank")
    private final String title;

    @NonNull
    @NotEmpty(message = "The Author name can't be empty")
    @NotBlank(message = "The Author name can't be blank")
    private final String author;

    @NonNull
    @NotEmpty(message = "The isbn can't be empty")
    @NotBlank(message = "The isbn can't be blank")
    private final String iSBN;

    @NonNull
    @NotEmpty(message = "The Publisher name can't be empty")
    @NotBlank(message = "The Publisher name can't be blank")
    private final String publisher;

    @NonNull
    @NotEmpty(message = "The id can't be empty")
    @NotBlank(message = "The id can't be blank")
    private final Long id;

    public BookSummary(@NonNull final String title, @NonNull final String author, @NonNull final String iSBN, @NonNull final String publisher, @NonNull final Long id) {
        this.title = title;
        this.author = author;
        this.iSBN = iSBN;
        this.publisher = publisher;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getiSBN() {
        return iSBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public Long getId() {
        return id;
    }
}
