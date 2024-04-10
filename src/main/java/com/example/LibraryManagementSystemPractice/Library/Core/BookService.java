package com.example.LibraryManagementSystemPractice.Library.Core;

import com.example.LibraryManagementSystemPractice.Library.Data.*;
import com.example.LibraryManagementSystemPractice.Library.Persistence.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public GetBookByAuthorResponse getBooksByAuthor(final GetBookByAuthorRequest request) {
        //final var books=bookRepository.getBooksByAuthor(request.getAuthor());

        final  var books=bookRepository.findBooksByAuthor(request.getAuthor());

        Collection<BookSummary> responsebooks=new ArrayList<>();
        for(var i:books)
        {
            BookSummary bookSummary=new BookSummary(i.getTitle(), i.getAuthor(), i.getIsbn(), i.getPublisher(), i.getId());
            //bookSummary.validate();
            responsebooks.add(bookSummary);
        }
        return (new GetBookByAuthorResponse(responsebooks));
    }

    public GetBookByTitleResponse getBooksByTitle(final GetBookByTitleRequest request) {
        //final var books=bookRepository.getBooksByTitle(request.getTitle());

        final var books=bookRepository.findBookByTitle(request.getTitle());

        Collection<BookSummary> responsebooks=new ArrayList<>();
        for(var i : books)
        {
            responsebooks.add(new BookSummary(i.getTitle(), i.getAuthor(), i.getIsbn(), i.getPublisher(), i.getId()));
        }
        return (new GetBookByTitleResponse(responsebooks));
    }

    public GetBookByIsbnResponse getBooksByIsbn(final GetBookByIsbnRequest request) {
        //final var books=bookRepository.getBooksByIsbn(request.getIsbn());

        final var books=bookRepository.findBooksByIsbn((request.getIsbn()));

        Collection<BookSummary> responsebooks=new ArrayList<>();
        for(var i:books)
        {
            responsebooks.add(new BookSummary(i.getTitle(), i.getAuthor(), i.getIsbn(), i.getPublisher(), i.getId()));
        }
        return (new GetBookByIsbnResponse(responsebooks));
    }

}
