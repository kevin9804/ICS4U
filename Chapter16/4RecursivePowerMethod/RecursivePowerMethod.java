import hsa.*;
// The "RecursivePowerMethod" class.
public class RecursivePowerMethod
{
    public static void main (String[] args)
    {
	int num, exponent;
	Stdout.println ("Please enter a number to be raised: ");
	num = Stdin.readInt ();
	Stdout.println ("Please enter the exponent: ");
	exponent = Stdin.readInt ();
	Stdout.println (PowerMethod (num, exponent));
	// Place your code here
    } // main method


    public static int PowerMethod (int num, int exponent)
    {
	int res;
	if (exponent > 0)
	{
	    exponent--;
	    res = PowerMethod (num, exponent) * num;
	}
	else
	    res = 1;
	return res;
    }
} // RecursivePowerMethod class
