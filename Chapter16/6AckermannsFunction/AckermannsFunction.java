import hsa.*;
// The "AckermannsFunction" class.
public class AckermannsFunction
{
    public static void main (String[] args)
    {
	int m, n;
	Stdout.print ("Please enter the number m: ");
	m = Stdin.readInt ();
	Stdout.print ("Please enter the number n: ");
	n = Stdin.readInt ();
	Stdout.println (ackermann (m, n));
	// Place your code here
    } // main method


    public static int ackermann (int m, int n)
    {
	if (m == 0)
	    return n + 1;
	else if (n == 0)
	    return ackermann (m - 1, 1);
	else
	    return ackermann (m - 1, ackermann (m, n - 1));
    }
} // AckermannsFunction class
