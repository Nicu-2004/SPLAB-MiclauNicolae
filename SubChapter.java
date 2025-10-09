package splab;
import java.util.*;
class SubChapter {
    private String name;
    private List<Paragraph> paragraphs = new ArrayList<>();
    private List<Image> images = new ArrayList<>();
    private List<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void addParagraph(Paragraph p) { paragraphs.add(p); }
    public void addImage(Image i) { images.add(i); }
    public void addTable(Table t) { tables.add(t); }

    public void print() {
        System.out.println("  SubChapter: " + name);
        for (Paragraph p : paragraphs) p.print();
        for (Image i : images) i.print();
        for (Table t : tables) t.print();
    }
}