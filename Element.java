package splab;
import java.util.*;
class Element {
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public void addParagraph(Paragraph p) { paragraphs.add(p); }
    public void addImage(Image i) { images.add(i); }
    public void addTable(Table t) { tables.add(t); }

    public void print() {
        System.out.println("Element");
        for (Paragraph p : paragraphs) p.print();
        for (Image i : images) i.print();
        for (Table t : tables) t.print();
    }
}
