package mk.ukim.finki.emtlab203012.model.dto;

import lombok.Data;
import mk.ukim.finki.emtlab203012.model.Country;

@Data
public class AuthorDto {

    private String name;
    private String surname;
    private Country country;

    public AuthorDto() {

    }
    public AuthorDto(String name, String surname, Country country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }
}
