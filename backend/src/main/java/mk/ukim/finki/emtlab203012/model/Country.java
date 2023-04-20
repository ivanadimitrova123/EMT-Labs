package mk.ukim.finki.emtlab203012.model;
import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String continent;

    public Country() {
    }
    public Country(Long id,String name, String continent) {
        this.id=id;
        this.name = name;
        this.continent=continent;
    }
    public Country(String name, String continent) {
        this.name = name;
        this.continent=continent;
    }
}
