package com.example.LibraryManagementSystemPractice.Library.Persistence;

import com.example.LibraryManagementSystemPractice.Library.Domain.Book;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

    @Query("FROM Book WHERE author=?1")
    Collection<Book> getBooksByAuthor(String author);


    @Query("FROM Book WHERE title=?1")
    Collection<Book> getBooksByTitle(String title);

    @Query("FROM Book WHERE iSBN=?1")
    Collection<Book> getBooksByIsbn(String isbn);

    // @Query(value="SELECT * FROM Book b WHERE b.author=?1",nativeQuery = true)
    //Collection<Book> getBookByTitle(String title);

/*
    default Collection<Book> getBookByIsbn(String isbn){
    final Specification<Book> specification=((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("isbn"),isbn));
    return findAll(specification);
    }
 */

}
