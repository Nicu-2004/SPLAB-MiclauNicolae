package splab;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* Book book = new Book("b1");
        Author author = new Author("ana", "ion");
        book.addAuthor(author);

        Section intro = new Section("Introducere");
        intro.add(new Paragraph("paragraf1"));
        intro.add(new Image("poza.png"));

        Section chapter1 = new Section("capitol1");
        chapter1.add(new Paragraph("paragraf2"));
        chapter1.add(new Table("table1"));

        book.add(intro);
        book.add(chapter1);
        book.add(new TableOfContents("tableofcontents1"));

        book.print(); */
        

       
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        p3.setAlignStrategy(new AlignLeft());

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}
