package splab.command;

import splab.model.Book;
import splab.service.BooksService;

public class CreateBookCommand implements Command {
    private final BooksService service;
    private final Book book;

    public CreateBookCommand(BooksService service, Book book) {
        this.service = service;
        this.book = book;
    }

    @Override
    public Object execute() {
        return service.addBook(book);
    }
}

