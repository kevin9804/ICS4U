//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E17
 
import hsa.*;
// The "Factors" class.
public class Factors
{
    public static void main (String[] args)
    {
	//Variables
	int num,remainder;
	
	//Input
	Stdout.print("Enter a number: ");
	num = Stdin.readInt();
	
	//Loop
	for (int i=1;i<=num;i++)
	{
	remainder = num%i;
	if (remainder==0)
	Stdout.print(i+" ");
	}
	
    } // main method
} // Factors class
