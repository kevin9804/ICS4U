//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E4

import hsa.*;
// The "Fibonacci" class.
public class Fibonacci
{
    public static void main (String[] args)
    {
	//Variables
	int num,a=1,b=1,total=0;
	
	//Input
	Stdout.println("Enter the number of number you want to show");
	num = Stdin.readInt();
	
	//Loop
	if (num==1)
	Stdout.println(a);
	else if (num==2)
	Stdout.println(a+" "+b);
	else
	{
	     Stdout.print(a+" "+b+" ");
	     for (int i=3;i<=num;i++)
	     {
	     total = a + b;
	     a = b;
	     b = total;
	     Stdout.print(total+" ");
	     }
	}
    } // main method
} // Fibonacci class
