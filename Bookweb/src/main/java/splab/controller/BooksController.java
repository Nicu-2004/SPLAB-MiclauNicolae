package splab.controller;
import splab.command.*;
import splab.model.Book;
import splab.service.BooksService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService service;
    private final CommandExecutor executor;

    public BooksController(BooksService service, CommandExecutor executor) {
        this.service = service;
        this.executor = executor;
    }

    @GetMapping
    public Object getAllBooks() {
        return executor.execute(new GetAllBooksCommand(service));
    }

    @GetMapping("/{id}")
    public Object getBookById(@PathVariable Long id) {
        return executor.execute(new GetBookByIdCommand(service, id));
    }

    @PostMapping
    public Object createBook(@RequestBody Book book) {
        return executor.execute(new CreateBookCommand(service, book));
    }

    @PutMapping("/{id}")
    public Object updateBook(@PathVariable Long id, @RequestBody Book book) {
        return executor.execute(new UpdateBookCommand(service, id, book));
    }

    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable Long id) {
        return executor.execute(new DeleteBookCommand(service, id));
    }
}