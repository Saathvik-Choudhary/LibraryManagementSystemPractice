package com.example.LibraryManagementSystemPractice.Library.Persistence;

import com.example.LibraryManagementSystemPractice.Library.Domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public class BookPopulator implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    public void populateBooks()
    {
        Collection<Book> books = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Book book = new Book("author"+i,
                    "isbn"+i,
                    "publisher"+i,
                    "title"+i);
            // You can set other properties as needed
            books.add(book);
        }
        bookRepository.saveAll(books);
        System.out.println("Books populated successfully!");
    }

    @Override
    public void run(String... args) throws Exception {
        populateBooks();
    }
}
