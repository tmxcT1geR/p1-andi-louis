// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 3 Aufgabe 3-1

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Book
{
	private int id;
	private String title;
	private String author;
	private Date dateOfPublication;

	public static final String DATE_FORMAT = "dd.MM.yyyy";
	public static final SimpleDateFormat FORMAT = new SimpleDateFormat(DATE_FORMAT);

	//--- constructors ---
	public Book(int id, String title, String author,Date dateOfPublication) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.dateOfPublication = dateOfPublication;
	}

	public Book(int id, String author) {
		this.id = id;
		this.author = author;
	}

	public Book() {
	}

	// TODO: Insert your code here!
	public static void main(String[] args) throws ParseException {
		Book beispiel = new Book(123, "Die Blechtrommel", "Günter Grass", FORMAT.parse("1.01.1959"));
		System.out.println(beispiel);
		System.out.println("Tage seit Publikation: " + beispiel.age());
		Book methodentest = new Book();
		methodentest.input();
		System.out.println(methodentest);
	}

	/** Returns the age of the book in days since publication */
	public int age()
	{
		// TODO: Insert your code here!
		long now = System.currentTimeMillis();
		long diff = now - dateOfPublication.getTime();
		int days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return days; //this is to avoid compiler errors, replace it!
	}
	/** Returns a String representation of the book */
	public String toString()
	{
		// TODO: Insert your code here!

		return id + ", " + title + ", " + author + ", " + FORMAT.format(dateOfPublication); //this is to avoid compiler errors, replace it!
	}

	/** Reads all book data from user input */
	public void input() throws ParseException
	{
		// TODO: Insert your code here!
		Scanner scn = new Scanner( System.in );
		System.out.print( "Please enter id: " );
		id = scn.nextInt();
		System.out.print( "Please enter tittle: " );
		title = scn.next();
		System.out.print( "Please enter author: " );
		author = scn.next();
		System.out.print( "Please enter dateOfPublication: " );
		dateOfPublication = FORMAT.parse(scn.next());
	}

	//--- Get-/Set-methods ---

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(Date dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}

	// TODO: Insert your code here!

	//--- helper methods -- DO NOT CHANGE ------------------------------------
	/** Converts the Date object d into a String object */
	public static String dateToString( Date d )
	{
		SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
		return fmt.format( d );
	}

	/** Converts the String object s into a Date object */
	public static Date stringToDate( String s ) 
	{
		Date r = null;
		try {
			SimpleDateFormat fmt = new SimpleDateFormat( DATE_FORMAT );
			r = fmt.parse( s );
		} catch ( ParseException e ){
			System.err.println( e );
			System.exit(1);
		}
		return r;
	}
}
