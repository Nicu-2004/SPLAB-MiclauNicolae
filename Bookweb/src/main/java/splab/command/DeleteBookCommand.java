package splab.command;

import splab.service.BooksService;

public class DeleteBookCommand implements Command {
    private final BooksService service;
    private final Long id;

    public DeleteBookCommand(BooksService service, Long id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public Object execute() {
        service.deleteBook(id);
        return "Book deleted successfully.";
    }
}

