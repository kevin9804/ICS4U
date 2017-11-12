//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Pre 5
//Chapter 3 Programming Challenges # 3

import hsa.*;
// The "TimeCalculator" class.
public class TimeCalculator
{
    public static void main (String[] args)
    {
	//variables
	int a, b, c, d;

	//input
	Stdout.println ("Please inter the seconds");
	a = Stdin.readInt ();
	b = 0;
	c = 0;
	d = 0;
	//calculate
	b = a / 60;
	a = a % 60;
	c = b / 60;
	b = b % 60;
	d = c / 24;
	c = c % 24;

	//output
	Stdout.println ("The time you input is " + d + " day(s) " + c + " hour(s) " + b + " min " + a + " s");

    } // main method
} // TimeCalculator class
