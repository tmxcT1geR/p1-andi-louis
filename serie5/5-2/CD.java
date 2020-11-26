// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 �bungsserie 5 Aufgabe 5-2

public class CD implements IArticle
{
	private int id;
	private String title;
	private String interpreter;
	private int year;
	private int price; // CHF

	/** constructor */
	public CD( int id, String title, String interpreter, int year, int price )
	{
		this.id = id;
		this.title = title;
		this.interpreter = interpreter;
		this.year = year;
		this.price = price;
	}
	

	public String getDescription()
	{
		return id + " (aufgabe5_2.CD) " + title + ", by " + interpreter +
			", " + year + ", " + price + " CHF";
	}

	public int getPrice() {
		return price; 
	}

	public int getId() { 
		return id; 
	}
}
