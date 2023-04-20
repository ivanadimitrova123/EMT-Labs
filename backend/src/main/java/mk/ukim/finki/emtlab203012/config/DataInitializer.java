package mk.ukim.finki.emtlab203012.config;

import mk.ukim.finki.emtlab203012.model.Author;
import mk.ukim.finki.emtlab203012.model.Country;
import mk.ukim.finki.emtlab203012.service.AuthorService;
import mk.ukim.finki.emtlab203012.service.BookService;
import mk.ukim.finki.emtlab203012.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static mk.ukim.finki.emtlab203012.model.BookCategory.DRAMA;
import static mk.ukim.finki.emtlab203012.model.BookCategory.NOVEL;

@Component
public class DataInitializer {

    private final BookService bookService;
    private final CountryService countryService;
    private final AuthorService authorService;


    public DataInitializer(BookService bookService, CountryService countryService, AuthorService authorService) {
        this.bookService = bookService;
        this.countryService = countryService;
        this.authorService = authorService;
    }
    @PostConstruct
    public void initData(){
        Country country1 = new Country(1L,"France","Europe");
        this.countryService.create(1L,"France","Europe");
        Country country2 = new Country(2L,"Italy","Europe");
        this.countryService.create(2L,"Italy","Europe");

        Author author1 = new Author(1L,"Jules","Verne", country1);
        this.authorService.create(1L,"Jules","Verne", country1);
        Author author2 = new Author(2L,"Dante","Alighieri", country2);
        this.authorService.create(2L,"Dante","Alighieri", country2);

        this.bookService.create(1L,"Book1",NOVEL,author1,3);
        this.bookService.create(2L,"Book2",DRAMA,author1,1);
        this.bookService.create(3L,"Book3",NOVEL,author1,7);
        this.bookService.create(4L,"Book4",NOVEL,author2,2);
        this.bookService.create(5L,"Book5",NOVEL,author1,7);
        this.bookService.create(6L,"Book6",NOVEL,author2,8);
        this.bookService.create(7L,"Book7",NOVEL,author2,1);
        this.bookService.create(8L,"Book8",NOVEL,author1,2);
        this.bookService.create(9L,"Book9",NOVEL,author1,3);


    }
}
