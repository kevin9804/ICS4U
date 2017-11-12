//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E14

import hsa.*;
// The "Point" class.
public class Point
{
    public static void main (String[] args)
    {
	//Variables
	int a,b,c;
	
	//Input
	a = (int)(1+Math.random()*6);
	b = (int)(1+Math.random()*6);
	c = 1;
	
	//Output
	Stdout.println("Your point is "+a);
	Stdout.print(b+" ");
	
	//Loop
	while (a!=b)
	{
	c++;
	b = (int)(1+Math.random()*6);
	Stdout.print(b+" ");
	}
	
	//Output
	Stdout.println("\nYou have rolled "+c+" times");
	
    } // main method
} // Point class
