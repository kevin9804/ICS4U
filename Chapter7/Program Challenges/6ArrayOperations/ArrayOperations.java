//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #6

import hsa.*;
// The "ArrayOperations" class.
public class ArrayOperations
{
    public static void main (String[] args)
    {
	System.out.println ("Please enter how many data do you want to put in the array:");
	int num = Stdin.readInt ();
	double[] array = new double [num];

	System.out.println ("Please enter the data into your array.");
	for (int i = 0 ; i < array.length ; i++)
	{
	    array [i] = Stdin.readDouble ();
	}

	System.out.println ("Please choice which operation do you want to do with the array.");
	System.out.println ("1)getTotal\n"
		+ "2)getAverage\n"
		+ "3)getHighest\n"
		+ "4)getLowest\n"
		+ "5)all of the above");
	num = Stdin.readInt ();
	if (num == 1)
	    System.out.println (getTotal (array));
	else if (num == 2)
	    System.out.println (getAverage (array));
	else if (num == 3)
	    System.out.println (getHighest (array));
	else if (num == 4)
	    System.out.println (getLowest (array));
	else if (num == 5)
	{
	    System.out.println (getTotal (array));
	    System.out.println (getAverage (array));
	    System.out.println (getHighest (array));
	    System.out.println (getLowest (array));
	}
	else
	    System.out.println ("Your enter is wrong, please enter again.");
    }


    public static double getTotal (double[] in)
    {
	double total = 0;
	for (int i = 0 ; i < in.length ; i++)
	    total = total + in [i];
	return total;
    }


    public static double getAverage (double[] in)
    {
	double average;
	average = getTotal (in) / in.length;
	return average;
    }


    public static double getHighest (double[] in)
    {
	double high = in [0];
	for (int i = 1 ; i < in.length ; i++)
	    if (high < in [i])
		high = in [i];
	return high;
    }


    public static double getLowest (double[] in)
    {
	double low = in [0];
	for (int i = 1 ; i < in.length ; i++)
	    if (low > in [i])
		low = in [i];
	return low;
    }
} // ArrayOperations class


