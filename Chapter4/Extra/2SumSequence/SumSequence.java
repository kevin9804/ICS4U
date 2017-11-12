//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E2

import hsa.*;
// The "SumSequence" class.
public class SumSequence
{
    public static void main (String[] args)
    {
	//Variables
	int num,sum=0;
	
	//Input
	Stdout.println("Please enter the number you want to sum to.");
	num = Stdin.readInt();
	
	//Loop
	for (int i=1;i<=num;i++)
	sum = sum+i;
	
	//Output
	Stdout.println("The sum sequence is "+sum);
	
    } // main method
} // SumSequence class
