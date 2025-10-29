package splab.command;

import splab.model.Book;
import splab.service.BooksService;

public class UpdateBookCommand implements Command {
    private final BooksService service;
    private final Long id;
    private final Book book;

    public UpdateBookCommand(BooksService service, Long id, Book book) {
        this.service = service;
        this.id = id;
        this.book = book;
    }

    @Override
    public Object execute() {
        return service.updateBook(id, book);
    }
}
