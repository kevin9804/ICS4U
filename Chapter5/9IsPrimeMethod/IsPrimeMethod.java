//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #9(13)

import hsa.*;
// The "IsPrimeMethod" class.
public class IsPrimeMethod
{
    public static void main (String[] args)
    {
	int j;
	Stdout.println("Enter a number and the program will check wether it is a prime or not");
	j = Stdin.readInt();
	if(isPrime(j))
	System.out.println(j + " is a prime");
	else
	System.out.println(j + " is not a prime");
    }
    
    public static boolean isPrime (int num)
    {
	if (num<2)
	return false; 
	for(int i = 2; i <= Math.sqrt(num); i++)
	{
	    if(num % i == 0)
	    return false;
	}
	return true;
    }
} // IsPrimeMethod class
