// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 7 Aufgabe 7-3


public class SortTest
{
	public static void main ( String[] args )
	{
		//sort an array of strings
		String[] wordlist = {"Z", "C", "B", "A", "X", "M", "F"};
		System.out.println( "Word list before sorting: " );
		for ( int i = 0; i < wordlist.length; i++ )
			System.out.println( wordlist[ i ] );
		MergeSort.sort( wordlist );
		System.out.println( "Word list after sorting: " );
		for ( int i = 0; i < wordlist.length; i++ )
			System.out.println( wordlist[ i ] );

		//sort an array of rectangles
		Rectangle[] rectangles = {new Rectangle( 100, 55 ),
		                          new Rectangle( 3, 4 ),
		                          new Rectangle( 30, 24 ),
		                          new Rectangle( 14, 9 ),
		                          new Rectangle( 90, 3 ),
		                          new Rectangle( 34, 12 ),
		                          new Rectangle( 1, 2 ),
		                          new Rectangle( 31, 24 ) };
		System.out.println( "\nRectangles before sorting:" );
		for ( int i = 0; i < rectangles.length; i++ )
			System.out.println( rectangles[ i ] );
		MergeSort.sort( rectangles );
		System.out.println( "\nRectangles after sorting:" );
		for ( int i = 0; i < rectangles.length; i++ )
			System.out.println( rectangles[ i ] );

		Man[] men = {
				new Man("Jeff Bezos", 171, 131000000, true, 70),
				new Man("Elon Musk", 188, 126000000, true, 93),
				new Man("Necklace Hürlimann", 185, 6, true, 111),
				new Man("Julius Caesar", 175, 10000, true, 70),
				new Man("James Charles", 174,12000, false, 60),
				new Man("Bob the builder", 190, 1000000000, false, 10),
				new Man("Big Chungus", 50000, 100000, false, 1),
				new Man("Conchita Wurst", 172, 105, false, 53 ),
				new Man("Big Ed", 149, 10, true, Integer.MAX_VALUE)
		};
		System.out.println( "\nmen before sorting:" );
		for ( int i = 0; i < men.length; i++ )
			System.out.println( men[ i ] );
		MergeSort.sort( men );
		System.out.println( "\nmen after sorting:" );
		for ( int i = 0; i < men.length; i++ )
			System.out.println( men[ i ] );
	}
}



