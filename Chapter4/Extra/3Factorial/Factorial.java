//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E3

import hsa.*;
// The "Factorial" class.
public class Factorial
{
    public static void main (String[] args)
    {
	//Variables
	int num,total=1;
	
	//Input
	Stdout.println("Please enter the number you want to times to.");
	num = Stdin.readInt();
	
	//Loop
	for (int i=1;i<=num;i++)
	total = total * i;
	
	//Output
	Stdout.println("The final answer is "+total);
	
    } // main method
} // Factorial class
