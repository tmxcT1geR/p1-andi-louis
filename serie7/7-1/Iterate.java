// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 7 Aufgabe 7-1

public class Iterate {

	public static void main(String[] args) {
		iterative();

	}
	static void iterative(int n) {
		if(n<=30) {
			 System.out.println(n);
			 iterative(n+3);
		}
	}
	static void iterative() {
			 System.out.println(0);
			 iterative(3);
	}
	

}
