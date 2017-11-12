//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #1

import hsa.*;
// The "RainfallClass" class.
public class RainfallClass
{
    public static void main (String[] args)
    {
	//Variables
	int month = 12;
	double[] figures = new double [month];
	double total = 0;
	double average;
	double a, b;
	int c = 1, d = 1;

	//Input
	for (int i = 0 ; i < month ; i++)
	{
	    Stdout.println ("Please input the monthly rainfall figures of " + (i + 1) + " month.");
	    figures [i] = Stdin.readDouble ();
	    while (figures [i] < 0)
	    {
		Stdout.println ("The monthly rainfall figures of " + (i + 1) + " month shouldn't be negative.");
		figures [i] = Stdin.readDouble ();
	    }
	}
	a = figures [1];
	b = figures [1];

	//main
	for (int i = 0 ; i < month ; i++)
	{
	    total = total + figures [i];
	    if (a < figures [i])
	    {
		a = figures [i];
		c = i + 1;
	    }
	    if (b > figures [i])
	    {
		b = figures [i];
		d = i + 1;
	    }
	}
	average = total / 12;

	//Output
	Stdout.println ("The total rainfall for the year is " + total);
	Stdout.println ("That average monthly rainfall is " + average);
	Stdout.println ("That month with the most rain is " + c);
	Stdout.println ("That month with the least rain is " + d);


    } // main method
} // RainfallClass class
