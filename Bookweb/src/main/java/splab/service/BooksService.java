package splab.service;

import org.springframework.stereotype.Service;
import splab.model.Book;
import splab.persistence.CrudRepositoryLab;

import java.util.List;

@Service
public class BooksService {

    private final CrudRepositoryLab<Book, Long> repository;


    public BooksService(CrudRepositoryLab<Book, Long> repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Book addBook(Book book) {
        // id-ul este generat de baza de date
        return repository.save(book);
    }

    public Book updateBook(Long id, Book book) {
     
        book.setId(id);
        return repository.save(book);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}

