import hsa.*;
// The "PallndromeDetector" class.
public class PallndromeDetector
{
    public static void main (String[] args)
    {
	String input, res;
	Stdout.println ("Please enter a String");
	input = Stdin.readLine ();
	input = input.replaceAll (" ", "");
	input = input.replaceAll (",", "");
	input = input.toLowerCase ();
	res = Reverser (input, input.length ());
	Stdout.println (input.compareTo (res) == 0);
	// Place your code here
    } // main method


    public static String Reverser (String input, int len)
    {
	String res;
	if (len > 0)
	{
	    len--;
	    res = Reverser (input.substring (1, len + 1), len) + input.substring (0, 1);
	}
	else
	    res = input;
	return res;
    }
} // PallndromeDetector class
