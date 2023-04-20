package mk.ukim.finki.emtlab203012.service;

import mk.ukim.finki.emtlab203012.model.Author;
import mk.ukim.finki.emtlab203012.model.Book;
import mk.ukim.finki.emtlab203012.model.BookCategory;
import mk.ukim.finki.emtlab203012.model.Country;
import mk.ukim.finki.emtlab203012.model.dto.BookDto;
import mk.ukim.finki.emtlab203012.model.dto.CountryDto;

import java.util.List;
import java.util.Optional;

public interface CountryService {
    Country create(Long id,String name, String continent);
    List<Country> findAll();
    Optional<Country> findById(Long id);
    Optional<Country> save(CountryDto country);
    Optional<Country> save(String name,String continent);
    Optional<Country> edit(Long id, String name, String continent);
    Optional<Country> edit(Long id, CountryDto country);
    void deleteById(Long id);
}
