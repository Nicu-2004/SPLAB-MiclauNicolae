package splab.persistence;

import org.springframework.stereotype.Component;
import splab.model.Book;

import java.util.List;
import java.util.Optional;

@Component
public class BookRepositoryAdapter implements CrudRepositoryLab<Book, Long> {

    private final BooksRepository booksRepository;

    public BookRepositoryAdapter(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Override
    public Book save(Book entity) {
        return booksRepository.save(entity);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return booksRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        booksRepository.deleteById(id);
    }
}
