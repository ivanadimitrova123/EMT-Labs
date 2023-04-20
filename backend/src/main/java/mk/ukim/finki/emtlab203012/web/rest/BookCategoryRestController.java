package mk.ukim.finki.emtlab203012.web.rest;

import mk.ukim.finki.emtlab203012.model.BookCategory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/bookcategories")
public class BookCategoryRestController {

    @GetMapping("/list")
    public List<BookCategory> getAllCategories() {
        return Arrays.asList(BookCategory.values());
    }

}
