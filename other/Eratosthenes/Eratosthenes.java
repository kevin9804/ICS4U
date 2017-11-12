//Leyao Li
//Kevin-Lee

import hsa.*;
// The "Eratosthenes" class.
public class Eratosthenes
{
    public static void main (String[] args)
    {
	int a = 0;
	System.out.println ("The prime numbers from 1 - 1000 are:");
	for (int i = 2 ; i <= 1000 ; i++)
	{
	    if (isPrime (i))
		if (a < 10)
		{
		    System.out.print (i + " ");
		    a = a + 1;
		}
		else
		{
		    System.out.print ("\n" + i + " ");
		    a = 1;
		}
	}
    }


    public static boolean isPrime (int num)
    {
	for (int i = 2 ; i <= Math.sqrt (num) ; i++)
	{
	    if (num % i == 0)
		return false;
	}
	return true;
    }
} // Eratosthenes class
