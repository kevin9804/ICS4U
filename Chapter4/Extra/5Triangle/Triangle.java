//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E5

import hsa.*;
// The "Triangle" class.
public class Triangle
{
    public static void main (String[] args)
    {
	//Variables
	String a;
	int num;
	
	//Input
	Stdout.println("Please enter the size of triangle.");
	num = Stdin.readInt();
	a="*";
	
	//Loop
	for (int i=1;i<=num;i++)
	{
	Stdout.println(a);
	a = a+"*";
	}
    } // main method
} // Triangle class
