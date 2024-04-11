package com.example.LibraryManagementSystemPractice.Library.Api;

import com.example.LibraryManagementSystemPractice.Library.Core.BookService;
import com.example.LibraryManagementSystemPractice.Library.Data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/books")
@RestController
public class BookApi {

    @Autowired
    BookService bookService;


    @GetMapping("/all")
    public ResponseEntity<GetBookByAuthorResponse> getAllBooks()
    {
        return  ResponseEntity.ok(bookService.getAll());
    }

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

    @PutMapping("/save")
    public ResponseEntity<PutBookResponse> putBook(@RequestBody final PutBookRequest request)
    {
        PutBookResponse response=bookService.putBook(request);
        return response.isok()?ResponseEntity.ok(response):ResponseEntity.badRequest().body(response);
    }

    /**
     * @GetMapping("/put/{author}/{isbn}/{publisher}/{title}")
     *     public ResponseEntity<PutBookResponse> putBook(@PathVariable final String author,@PathVariable final String isbn,@PathVariable final String publisher,@PathVariable final String title)
     *     {
     *         System.out.println(isbn);
     *         return ResponseEntity.ok(bookService.putBook(new PutBookRequest(author, isbn, publisher, title)));
     *     }
     */
}
