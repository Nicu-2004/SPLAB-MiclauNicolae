package splab.command;

import splab.service.BooksService;

public class GetAllBooksCommand implements Command {
    private final BooksService service;

    public GetAllBooksCommand(BooksService service) {
        this.service = service;
    }

    @Override
    public Object execute() {
        return service.getAllBooks();
    }
}

