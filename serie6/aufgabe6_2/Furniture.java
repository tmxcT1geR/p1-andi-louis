//********************************************************************
//  Furniture.java
//********************************************************************

package aufgabe6_2;

public class Furniture
{
   public static String material = "Weisse Eiche";
   protected float pricePerHour;
   protected float workedHours;

   //----------------------------------------------------------------
   //  Constructor: Sets up furniture with pricePerHour, workedHours
   //----------------------------------------------------------------
   public Furniture (float pricePerHour, float workedHours)
   {
	  this.pricePerHour = pricePerHour;
	  this.workedHours = workedHours;
   }

   public float calculateEffort(){
	   return pricePerHour * workedHours;
   }
}