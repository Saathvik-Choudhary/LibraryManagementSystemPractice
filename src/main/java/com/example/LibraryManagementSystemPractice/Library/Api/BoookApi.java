package com.example.LibraryManagementSystemPractice.Library.Api;

import com.example.LibraryManagementSystemPractice.Library.Core.BookService;
import com.example.LibraryManagementSystemPractice.Library.Data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/books")
@RestController
public class BoookApi {

    @Autowired
    BookService bookService;

    @GetMapping("/author/{author}")
    public ResponseEntity<GetBookByAuthorResponse> getBookByAuthor(@PathVariable final String author)
    {
        return ResponseEntity.ok(bookService.getBooksByAuthor(new GetBookByAuthorRequest(author)));
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<GetBookByTitleResponse> getBookByTitle(@PathVariable final String title)
    {
        return ResponseEntity.ok(bookService.getBooksByTitle(new GetBookByTitleRequest(title)));
    }

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<GetBookByIsbnResponse> getBookByIsbn(@PathVariable final String isbn)
    {
        return ResponseEntity.ok(bookService.getBooksByIsbn(new GetBookByIsbnRequest(isbn)));
    }
}
