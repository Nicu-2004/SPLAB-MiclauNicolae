package splab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import splab.model.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}
