// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 7 Aufgabe 7-1

public class Factorial{
	public static void main(String[] args) {
		System.out.println(factorial(Integer.valueOf(args[0])));

	}
	
	public static long factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}

}