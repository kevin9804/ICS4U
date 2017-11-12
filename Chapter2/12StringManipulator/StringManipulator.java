//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #12

import hsa.*;
// The "StringManipulator" class.
public class StringManipulator
{
    public static void main (String[] args)
    {
	//Declare Variables
	String name;

	//Input
	Stdout.println ("Please enter your favourate city name.");
	name = Stdin.readLine ();

	//Output
	int num = name.length ();
	String cityU = name.toUpperCase ();
	String cityL = name.toLowerCase ();
	char first = name.toUpperCase ().charAt (0);
	Stdout.println (num);
	Stdout.println (cityU);
	Stdout.println (cityL);
	Stdout.println (first);

    } // main method
} // StringManipulator class
