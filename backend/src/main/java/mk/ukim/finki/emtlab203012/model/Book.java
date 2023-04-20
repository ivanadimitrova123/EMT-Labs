package mk.ukim.finki.emtlab203012.model;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private BookCategory category;
    @ManyToOne
    private Author author;
    private Integer availableCopies;

    public Book() {
    }

    public Book(String name, BookCategory category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author=author;
        this.availableCopies=availableCopies;
    }
    public Book(Long id,String name, BookCategory category, Author author, Integer availableCopies) {
        this.id=id;
        this.name = name;
        this.category = category;
        this.author=author;
        this.availableCopies=availableCopies;
    }


}
