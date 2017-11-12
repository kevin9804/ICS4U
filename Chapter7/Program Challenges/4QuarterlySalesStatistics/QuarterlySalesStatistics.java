//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #4

import hsa.*;
// The "QuarterlySalesStatistics" class.
public class QuarterlySalesStatistics
{
    public static void main (String[] args)
    {
	double[] [] company = new double [6] [4];

	for (int d = 0 ; d < company.length ; d++)
	{
	    for (int q = 0 ; q < company [d].length ; q++)
	    {
		System.out.println ("Please enter the sales figures for the " + (d + 1) + " divisions in the " + (q + 1) + " quarter");
		company [d] [q] = Stdin.readDouble ();
	    }
	}

	System.out.println ("\nThe list of sales figures by division:");
	System.out.println ("Division\tquarter 1\tquarter 2\tquarter 3\tquarter 4");
	for (int d = 0 ; d < company.length ; d++)
	{
	    System.out.print ((d + 1) + "\t\t");
	    for (int q = 0 ; q < company [d].length ; q++)
	    {
		System.out.print (company [d] [q] + "\t\t");
	    }
	    System.out.print ("\n");
	}

	System.out.println ("\nThe division increase of decrease from the previous quarter.");
	System.out.println ("Division\tquarter 2\tquarter 3\tquarter 4");
	for (int d = 0 ; d < company.length ; d++)
	{
	    System.out.print ((d + 1) + "\t\t");
	    for (int q = 1 ; q < company [d].length ; q++)
	    {
		System.out.print ((company [d] [q] - company [d] [q - 1]) + "\t\t");
	    }
	    System.out.print ("\n");
	}

	double quarter1 = 0;
	double quarter2 = 0;
	double quarter3 = 0;
	double quarter4 = 0;
	System.out.println ("\nThe total sales for the quarter.");
	System.out.println ("quarter 1\tquarter 2\tquarter 3\tquarter 4");
	for (int d = 0 ; d < company.length ; d++)
	{
	    quarter1 = quarter1 + company [d] [0];
	}
	for (int d = 0 ; d < company.length ; d++)
	{
	    quarter2 = quarter2 + company [d] [1];
	}
	for (int d = 0 ; d < company.length ; d++)
	{
	    quarter3 = quarter3 + company [d] [2];
	}
	for (int d = 0 ; d < company.length ; d++)
	{
	    quarter4 = quarter4 + company [d] [3];
	}
	System.out.println (quarter1 + "\t\t" + quarter2 + "\t\t" + quarter3 + "\t\t" + quarter4);

	System.out.println ("\nThe company's increase of decrease from the previous quarter.");
	System.out.println ("quarter 2\tquarter 3\tquarter 4");
	System.out.println ((quarter2 - quarter1) + "\t\t" + (quarter3 - quarter2) + "\t\t" + (quarter4 - quarter3));

	System.out.println ("\nThe average sales for all divisions in quarter 1 is " + (quarter1 / 6));
	System.out.println ("The average sales for all divisions in quarter 2 is " + (quarter2 / 6));
	System.out.println ("The average sales for all divisions in quarter 3 is " + (quarter3 / 6));
	System.out.println ("The average sales for all divisions in quarter 4 is " + (quarter4 / 6));

	int quarter;
	double d1, d2;
	for (int q = 0 ; q < company [0].length ; q++)
	{
	    d1 = company [0] [q];
	    quarter = 1;
	    for (int d = 1 ; d < company.length ; d++)
	    {
		d2 = company [d] [q];
		if (d2 > d1)
		{
		    d1 = d2;
		    quarter = d + 1;
		}
	    }
	    System.out.println ("The highest sales for " + q + " quarter is " + quarter);
	}
    } // main method
} // QuarterlySalesStatistics class


