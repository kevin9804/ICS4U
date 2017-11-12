import hsa.*;
// The "StringReverser" class.
public class StringReverser
{
    public static void main (String[] args)
    {
	String input;
	Stdout.println ("Please enter a String");
	input = Stdin.readLine ();
	Stdout.println (Reverser (input, input.length ()));
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
} // StringReverser class
