// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 6 Aufgabe 6-2

public class Order
{
   public static void main (String[] args)
   {
		// Table mit pricePerHour=25, workedHours=340, materialCosts=600
		Table table = new Table (25, 300, 600);

		System.out.println("Ihre Bestellung beinhaltet einen Tisch aus dem folgenden Material: " + table.material);
		System.out.println("Der Preis für den Aufwand ist: " + table.calculateEffort() + " CHF");
		System.out.println("Der totale Preis für dieses Objekt ist: " + table.totalPrice() + " CHF");
   }
}