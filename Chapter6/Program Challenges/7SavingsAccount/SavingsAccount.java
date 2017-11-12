//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #7

// The "SavingsAccount" class.
public class SavingsAccount
{
    private double balance, rate, monthly;
    private double deposited = 0, withdrawn = 0, interest = 0;

    public SavingsAccount (double start)
    {
	balance = start;
    }


    public void setRate (double r)
    {
	rate = r;
    }


    public void calculate (double d, double w)
    {
	deposited = deposited + d;
	withdrawn = withdrawn + w;
	balance = balance + d - w;
	monthly = balance * rate / 12;
	interest = interest + monthly;
	System.out.println ("This month get the interest is " + monthly);
    }


    public void last ()
    {
	System.out.println ("The total amount of deposited is " + deposited);
	System.out.println ("The total amount of withdrawn is " + withdrawn);
	System.out.println ("The total amount of interest is " + interest);
    }
} // SavingAccount class


