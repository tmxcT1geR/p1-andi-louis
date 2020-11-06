// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 übungsserie 5 Aufgabe 5-2
public class DVD implements IArticle

{
	private int id;
	private String title;
	private int year;
	private int price; // CHF

	/** constructor */
	public DVD( int id, String title, int year, int price )
	{
		this.id = id;
		this.title = title;
		this.year = year;
		this.price = price;
	}
	

	public String getDescription()
	{
		return id + " (DVD) " + title +
			", " + year + ", " + price + " CHF";
	}

	public int getPrice() {
		return price; 
	}

	public int getId() { 
		return id; 
	}
}
