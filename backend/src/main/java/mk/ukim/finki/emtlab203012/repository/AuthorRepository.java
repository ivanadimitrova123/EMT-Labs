package mk.ukim.finki.emtlab203012.repository;

import mk.ukim.finki.emtlab203012.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
