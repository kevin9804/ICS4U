//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Algorithm Workbench #3

// The "StringArray" class.
public class StringArray
{
    public static void main (String[] args)
    {
	String[] statement = {"Einstein", "Newton", "Copernicus", "Kepler"};
	int length = 0;
	for (int i = 0 ; i < 4 ; i++)
	{
	    System.out.println (statement [i]);
	    length = length + statement [i].length ();
	}
	System.out.println (length);

    } // main method
} // StringArray class
