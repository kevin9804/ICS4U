//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #8

import hsa.*;
// The "TwoDArrayOperations" class.
public class TwoDArrayOperations
{
    public static void main (String[] args)
    {
	System.out.println ("Please enter how many Column do you want to have in the array:");
	int column = Stdin.readInt ();
	System.out.println ("Please enter how many Row do you want to have in the array:");
	int row = Stdin.readInt ();

	double[] [] array = new double [column] [row];

	System.out.println ("Please enter the data into your array.");
	for (int i = 0 ; i < array.length ; i++)
	{
	    for (int n = 0 ; n < array [i].length ; n++)
	    {
		System.out.print ((i + 1) + "," + (n + 1) + ":\t");
		array [i] [n] = Stdin.readDouble ();
	    }
	}
	System.out.println (getTotal (array));
	System.out.println (getAverage (array));
	getRowTotal (array);
	getColumnTotal (array);
	getHighestInRow (array);
	getLowestInRow (array);
    } // main method


    public static double getTotal (double[] [] in)
    {
	double total = 0;
	for (int i = 0 ; i < in.length ; i++)
	    for (int n = 0 ; n < in [i].length ; n++)
		total = total + in [i] [n];
	return total;
    }


    public static double getAverage (double[] [] in)
    {
	double average;
	int num = 0;
	for (int i = 0 ; i < in.length ; i++)
	    num = num + in [i].length;
	average = getTotal (in) / num;
	return average;
    }


    public static void getRowTotal (double[] [] in)
    {
	double total = 0;
	for (int i = 0 ; i < in.length ; i++)
	{
	    for (int n = 0 ; n < in [i].length ; n++)
		total = total + in [i] [n];
	    System.out.println ("The total number of row " + (i + 1) + " is " + total);
	    total = 0;
	}
    }


    public static void getColumnTotal (double[] [] in)
    {
	double total = 0;
	for (int n = 0 ; n < in [0].length ; n++)
	{
	    for (int r = 0 ; r < in.length ; r++)
		total = total + in [r] [n];
	    System.out.println ("The total number of Column " + (n + 1) + " is " + total);
	    total = 0;
	}
    }


    public static void getHighestInRow (double[] [] in)
    {
	double high;
	for (int i = 0 ; i < in.length ; i++)
	{
	    high = in [i] [0];
	    for (int n = 1 ; n < in [i].length ; n++)
		if (high < in [i] [n])
		    high = in [i] [n];
	    System.out.println ("The highest in row " + (i + 1) + " is " + high);
	}
    }


    public static void getLowestInRow (double[] [] in)
    {
	double low;
	for (int i = 0 ; i < in.length ; i++)
	{
	    low = in [i] [0];
	    for (int n = 1 ; n < in [i].length ; n++)
		if (low > in [i] [n])
		    low = in [i] [n];
	    System.out.println ("The lowest in row " + (i + 1) + " is " + low);
	}
    }
} // TwoDArrayOperations class


