//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #5

import hsa.*;
// The "FallingDistance" class.
public class FallingDistance
{
    public static void main (String[] args)
    {
	int time;
	double distance;
	for (time=1;time<=10;time++)
	{
	distance = fallingDistance(time);
	Stdout.println(distance);
	}
    } // main method
    
    public static double fallingDistance(int t)
    {
	double d;
	d = 9.8/2*t*t;
	return d;
    }
} // FallingDistance class
