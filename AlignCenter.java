package splab;

public class AlignCenter implements AlignStrategy {
	 @Override
	    public void render(Paragraph paragraph, String context) {
	        System.out.println("<<< Center aligned >>> " + paragraph.getText() + " <<< Center aligned >>>");
	    }
}
