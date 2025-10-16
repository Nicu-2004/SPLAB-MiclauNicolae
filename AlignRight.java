package splab;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, String context) {
        System.out.println(paragraph.getText() + " <<< Right aligned >>>");
    }
}

