//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #2

import hsa.*;
// The "Main" class.
public class Main
{
    public static void main (String[] args)
    {
	String maker;
	int year;

	Car car1 = new Car ();
	System.out.println ("Please enter the year model of the car.");
	year = Stdin.readInt ();
	System.out.println ("Please enter the year maker of the car.");
	maker = Stdin.readLine ();

	car1.Constructor (year, maker);
	for (int i = 1 ; i <= 5 ; i++)
	{
	    car1.accelerate ();
	    System.out.println (car1.getSpeed ());
	}
	for (int i = 1 ; i <= 5 ; i++)
	{
	    car1.brake ();
	    System.out.println (car1.getSpeed ());
	}
    } // main method
} // Main class
