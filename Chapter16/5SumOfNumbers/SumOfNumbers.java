import hsa.*;
// The "SunOfNumbers" class.
public class SumOfNumbers
{
    public static void main (String[] args)
    {
	int num;
	Stdout.print ("Please enter a number: ");
	num = Stdin.readInt ();
	Stdout.println (Sum (num));
	// Place your code here
    } // main method


    public static int Sum (int num)
    {
	int res;
	if (num > 0)
	{
	    num--;
	    res = Sum(num) + num + 1;
	}
	else
	    res = num;
	return res;
    }
} // SumOfNumbers class
