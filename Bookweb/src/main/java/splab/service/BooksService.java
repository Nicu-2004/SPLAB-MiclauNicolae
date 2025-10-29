package splab.service;
import org.springframework.stereotype.Service;
import splab.model.Book;
import java.util.*;

@Service
public class BooksService {
    private final Map<Long, Book> books = new HashMap<>();
    private long nextId = 1;

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(Long id) {
        return books.get(id);
    }

    public Book addBook(Book book) {
        book.setId(nextId++);
        books.put(book.getId(), book);
        return book;
    }

    public Book updateBook(Long id, Book book) {
        book.setId(id);
        books.put(id, book);
        return book;
    }

    public void deleteBook(Long id) {
        books.remove(id);
    }
}
