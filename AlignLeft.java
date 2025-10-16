package splab;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, String context) {
        System.out.println("<<< Left aligned >>> " + paragraph.getText());
    }
}
