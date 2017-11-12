//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E21

import hsa.*;
// The "AllFactors" class.
public class AllFactors
{
    public static void main (String[] args)
    {
	//Variables
	int remainder;
	
	//Loop
	for (int num=1;num<=50;num++)
	{
	if (num==1)
	Stdout.print(num);
	else
	Stdout.print("\n"+num);
	    for (int i=1;i<=num;i++)
		{
		remainder = num%i;
		if (remainder == 0)
		Stdout.print(" "+i);
		}
	}
	
	
    } // main method
} // AllFactors class
