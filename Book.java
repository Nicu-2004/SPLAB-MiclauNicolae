package splab;
import java.util.*;
 class Book {
    private String title;
    private List<Chapter> chapters = new ArrayList<>();
    private TableOfContents toc = new TableOfContents();
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("\n--- Authors ---");
        for (Author a : authors) 
	a.print();
        System.out.println("\n--- Table of Contents ---");
        toc.print();
        System.out.println("\n--- Chapters ---");
        for (Chapter c : chapters) 
	c.print();
    }
}