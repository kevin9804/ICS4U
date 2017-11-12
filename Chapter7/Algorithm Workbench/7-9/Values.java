//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Algorithm Workbench #9

// The "Values" class.
public class Values
{
    public static void main (String[] args)
    {
	double[] [] values = new double [10] [20];
	double total = 0;

	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int n = 0 ; n < 20 ; n++)
	    {
		total = total + values [i] [n];
	    }
	}
    } // main method
} // Values class
