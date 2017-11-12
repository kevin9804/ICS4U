//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #3

// The "RetailItem" class.
public class RetailItem
{
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem (String input, int units, double p)
    {
	description = input;
	unitsOnHand = units;
	price = p;
    }


    public String getDescription ()
    {
	return description;
    }


    public int getUnitsOnHand ()
    {
	return unitsOnHand;
    }


    public double getPrice ()
    {
	return price;
    }
}
