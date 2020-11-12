package aufgabe3_2;

import aufgabe3_1.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test
{
	public static void main(String args[]) throws ParseException
	{
		SimpleDateFormat fmt = new SimpleDateFormat(Book.DATE_FORMAT);

		// Creating aufgabe3_1.aufgabe5_2.Book-objects...
		Book b1 = new Book(1, "Homo Faber", "Max Frisch", fmt.parse("01.01.1957"));
		Book b2 = new Book(2, "Harry Potter", "J.K. Rowling", fmt.parse("25.7.2000"));
		Book b3 = new Book(3, "Krieg und Frieden", "Leo Tolstoi", fmt.parse("24.01.1867"));
		Book b4 = new Book(4, "Freedom", "Jonathan Franzen", fmt.parse("08.06.2010"));
		Book b5 = new Book(5, "Goedel, Escher, Bach", "Douglas Hofstadter", fmt.parse("05.11.1979"));

		// Creating two orders containing theses books...

		Order order = new Order();
		order.setCustomerName("Sophie Muster");
		order.setCustomerAddress("Mittelstrasse 10, 3011 Bern");
		order.addBook(b1);
		order.addBook(b2);
		order.addBook(b3);
		order.addBook(b4);
		order.addBook(b4);
		order.addBook(b5);
		System.out.println(order);

		System.out.print("\n");

		Order order2 = new Order();
		order2.setCustomerName("Woody Allen");
		order2.setCustomerAddress("5th Avenue 7, 10001 New York");
		order2.addBook(b5);
		System.out.println(order2);
	}
}
