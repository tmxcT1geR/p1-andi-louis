//********************************************************************
//  Table.java
//********************************************************************

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
		return super.calculateEffort() + materialCosts;
   }
}