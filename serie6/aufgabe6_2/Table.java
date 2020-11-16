// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 6 Aufgabe 6-2

package aufgabe6_2;//

public class Table extends Furniture
{
	private float materialCosts;
   //-----------------------------------------------------------------
   //  Sets up a table with pricePerHour and workedHours
   //-----------------------------------------------------------------
   public Table (float pricePerHour, float workedHours, float materialCosts)
   {
      super (pricePerHour, workedHours);
	  this.materialCosts = materialCosts;
   }
   
   public float totalPrice(){
       return calculateEffort() + materialCosts;
   }
}