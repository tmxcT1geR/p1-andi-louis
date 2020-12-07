// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 1 Aufgabe 1-2

import java.util.Scanner;

public class Divide{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Eingabe für a: ");
		long fisch = sc.nextLong();

		System.out.print("Eingabe für b: ");
		long bruh = sc.nextLong();
		while (bruh == 0) {
		System.out.print("b darf nicht null sein, bitte erneut eingeben. b: ");
		bruh = sc.nextLong();
		}

		System.out.println("(a^2)/b=");
		System.out.println("Ergebnis als Gleitkomazahl: " + fisch*fisch/(double)bruh);
		System.out.println("Ergebnis als ganze Zahl mit Rest; Zahl: " + fisch*fisch/bruh + " Rest: " + (fisch * fisch) % bruh);
		
	}	
}