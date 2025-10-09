package splab;

public class Book {
private String title;
public Book(String title)
{
	this.title=title;
}
public String getTile()
{
	return title;
}
public String print()
{
	return "Titlu:" + title;
}
}
