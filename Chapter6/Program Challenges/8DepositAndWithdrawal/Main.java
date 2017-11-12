//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #7

import hsa.*;
import java.io.*;
// The "Main" class.
public class Main
{
    public static void main (String[] args) throws IOException
    {
	SavingsAccount account = new SavingsAccount (500.00);
	double num;

	System.out.println ("Please enter the annual interest rate");
	num = Stdin.readDouble ();
	account.setRate (num);

	String DepositsLoc = "Deposits.txt";
	String WithdrawalsLoc = "Withdrawals.txt";
	String str1 = "";
	String str2 = "";
	double deposited, withdrawn;
	BufferedReader Deposits, Withdrawals;
	Deposits = new BufferedReader (new FileReader (DepositsLoc));
	Withdrawals = new BufferedReader (new FileReader (WithdrawalsLoc));

	while (true)
	{
	    str1 = Deposits.readLine ();
	    if (str1 == null)
		break;
	    else
	    {
		deposited = Double.parseDouble (str1);
		account.deposited (deposited);
	    }
	}
	Deposits.close ();

	while (true)
	{
	    str2 = Withdrawals.readLine ();

	    if (str2 == null)
		break;
	    else
	    {
		withdrawn = Double.parseDouble (str2);
		account.withdrawn (withdrawn);
	    }
	}
	Withdrawals.close ();

	account.last ();
    }
}

