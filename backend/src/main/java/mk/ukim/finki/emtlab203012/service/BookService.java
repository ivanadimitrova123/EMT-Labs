package mk.ukim.finki.emtlab203012.service;

import mk.ukim.finki.emtlab203012.model.Author;
import mk.ukim.finki.emtlab203012.model.Book;
import mk.ukim.finki.emtlab203012.model.BookCategory;
import mk.ukim.finki.emtlab203012.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();
    Book create(Long id,String name,BookCategory category,Author author,Integer availableCopies);
    Optional<Book> findById(Long id);
    Optional<Book> findByName(String name);
    Optional<Book> save(BookDto bookDto);
    Optional<Book> save(String name, BookCategory category, Long authorId, Integer availableCopies);
    Optional<Book> edit(Long id, String name, BookCategory category, Author author, Integer availableCopies);
    Optional<Book> edit(Long id, BookDto bookDto);
    void deleteById(Long id);
    void markBookAsTaken(Long id);

}
