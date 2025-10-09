package splab;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ion Creangă");
        Book book = new Book("Amintiri din copilărie");
        book.addAuthor(author);

        Chapter chapter1 = new Chapter("Capitolul 1");
        SubChapter sub1 = chapter1.createSubChapter("Subcapitolul 1.1");
        Element elem1 = new Element() ;
        elem1.addParagraph(new Paragraph("Acesta este primul paragraf."));
        elem1.addImage(new Image("coperta.jpg"));
        elem1.addTable(new Table("Tabelul 1"));
        sub1.addElement(elem1);
        book.addChapter(chapter1);

        book.print();
    }
}