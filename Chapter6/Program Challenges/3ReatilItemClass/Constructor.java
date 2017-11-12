//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #3

// The "Constructor" class.
public class Constructor
{
    public static void main (String[] args)
    {
	RetailItem retailitem1 = new RetailItem ("Jacket", 12, 59.95);
	RetailItem retailitem2 = new RetailItem ("Designer Jeans", 40, 34.95);
	RetailItem retailitem3 = new RetailItem ("Shirt", 20, 24.95);

	System.out.println ("\tDescription\tUnits on Hand\t Price");
	System.out.println ("Item #1\t" + retailitem1.getDescription () + "\t\t" + retailitem1.getUnitsOnHand () + "\t\t" + retailitem1.getPrice ());
	System.out.println ("Item #2\t" + retailitem2.getDescription () + "\t" + retailitem2.getUnitsOnHand () + "\t\t" + retailitem2.getPrice ());
	System.out.println ("Item #3\t" + retailitem3.getDescription () + "\t\t" + retailitem3.getUnitsOnHand () + "\t\t" + retailitem3.getPrice ());
    } // main method
} // Constructor class
