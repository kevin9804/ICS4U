//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #7

import hsa.*;
// The "Main" class.
public class Main
{
    public static void main (String[] args)
    {
	double num;
	double deposited, withdrawn;
	int inum;
	System.out.println ("Please enter your start balance.");
	num = Stdin.readDouble ();
	SavingsAccount account = new SavingsAccount (num);

	System.out.println ("Please enter the annual interest rate");
	num = Stdin.readDouble ();
	account.setRate (num);
	System.out.println ("Please enter the number of months that have passed.");
	inum = Stdin.readInt ();

	for (int i = 1 ; i <= inum ; i++)
	{
	    System.out.println ("Please enter the amount deposited into the account in the " + i + " month");
	    deposited = Stdin.readDouble ();
	    System.out.println ("Please enter the amount withdrawn into the account in the " + i + " month");
	    withdrawn = Stdin.readDouble ();
	    account.calculate (deposited, withdrawn);
	}

	account.last ();
    } // main method
} // Main class

