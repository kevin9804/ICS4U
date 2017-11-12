//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #7

// The "SavingsAccount" class.
public class SavingsAccount
{
    private double balance, rate, interest;
    private double deposited = 0, withdrawn = 0;

    public SavingsAccount (double start)
    {
	balance = start;
    }


    public void setRate (double r)
    {
	rate = r;
    }


    public void deposited (double d)
    {
	deposited = deposited + d;
    }


    public void withdrawn (double w)
    {
	withdrawn = withdrawn + w;
    }


    public void last ()
    {
	balance = balance + deposited - withdrawn;
	interest = balance * rate / 12;
	balance = balance + interest;
	System.out.println ("The total amount of interest is " + interest);
	System.out.println ("The total balance is " + balance);
    }
} // SavingAccount class


