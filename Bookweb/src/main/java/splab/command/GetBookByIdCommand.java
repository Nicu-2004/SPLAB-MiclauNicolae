package splab.command;

import splab.service.BooksService;

public class GetBookByIdCommand implements Command {
    private final BooksService service;
    private final Long id;

    public GetBookByIdCommand(BooksService service, Long id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public Object execute() {
        return service.getBookById(id);
    }
}
