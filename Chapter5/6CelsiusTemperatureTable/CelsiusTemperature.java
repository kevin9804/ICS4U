//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #6

import hsa.*;
// The "CelsiusTemperature" class.
public class CelsiusTemperature
{
    public static void main (String[] args)
    {
	double celsius;
	int fahrenheit;
	for (fahrenheit=0;fahrenheit<=20;fahrenheit++)
	{
	    celsius(fahrenheit);
	}
    } // main method
    
    public static void celsius(int f)
    {
	double c;
	int ct;
	c = (f-32)*5;
	ct = (int)(Math.round(c/9));
	Stdout.println(f+"  "+ct);
    }
} // CelsiusTemperature class
