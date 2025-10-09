package splab;
import java.util.*; 
class Paragraph {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("    Paragraph: " + text);
    }
}