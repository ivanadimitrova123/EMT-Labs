package mk.ukim.finki.emtlab203012.service;

import mk.ukim.finki.emtlab203012.model.Author;
import mk.ukim.finki.emtlab203012.model.Book;
import mk.ukim.finki.emtlab203012.model.BookCategory;
import mk.ukim.finki.emtlab203012.model.Country;
import mk.ukim.finki.emtlab203012.model.dto.AuthorDto;
import mk.ukim.finki.emtlab203012.model.dto.BookDto;
import mk.ukim.finki.emtlab203012.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Author create(Long id,String name, String surname, Country country);
    List<Author> findAll();
    Optional<Author> findById(Long id);
    Optional<Author> edit(Long id,String name, String surname, Country country);
    Optional<Author> edit(Long id, AuthorDto authorDto);
    void deleteById(Long id);
    Optional<Author> save(String name, String surname, Country country);
    Optional<Author> save(AuthorDto authorDto);

}
