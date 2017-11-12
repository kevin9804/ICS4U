import hsa.*;
// The "RecursiveMultiplicatoin" class.
public class RecursiveMultiplicatoin
{
    public static void main (String[] args)
    {
	int x, y;
	int sum = 0;
	System.out.print ("Please enter the value: ");
	x = Stdin.readInt ();
	System.out.print ("Please enter recursive times: ");
	y = Stdin.readInt ();
	System.out.println (Multiplication (x, y, sum));
    } // main method


    public static int Multiplication (int x, int y, int sum)
    {
	if (y > 0)
	{
	    y--;
	    sum = Multiplication (x, y, sum) + x;
	}
	else
	{
	    sum = 0;
	}
	return sum;
    }
} // RecursiveMultiplicatoin class


