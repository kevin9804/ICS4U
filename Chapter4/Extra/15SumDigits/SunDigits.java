//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E15

import hsa.*;
// The "SunDigits" class.
public class SunDigits
{
    public static void main (String[] args)
    {
	//Variables
	int a, num;
	String b;
	int c = 1;
	int e = 0, f, g;
	//Input
	Stdout.println ("Please enter the number you want to sum.");
	a = Stdin.readInt ();
	b = a + "";
	num = b.length ();

	//Loop
	while (num > 0)
	{
	    c = c * 10;
	    num = num - 1;
	}

	while (c > 0)
	{
	    e = e + a / c;
	    f = a % c;
	    a = f;
	    c = c / 10;
	}

	Stdout.println (e);
    } // main method
} // SunDigits class


