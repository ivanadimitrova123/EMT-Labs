package mk.ukim.finki.emtlab203012.model.dto;

import lombok.Data;
import mk.ukim.finki.emtlab203012.model.Author;
import mk.ukim.finki.emtlab203012.model.BookCategory;

@Data
public class BookDto {
    private String name;
    private BookCategory category;
    private Author author;
    private Integer availableCopies;

    public BookDto() {
    }

    public BookDto(String name, BookCategory category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author=author;
        this.availableCopies=availableCopies;
    }
}
