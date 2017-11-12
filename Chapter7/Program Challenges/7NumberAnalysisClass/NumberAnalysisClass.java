//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #7

import hsa.*;
import java.io.*;
// The "NumberAnalysisClass" class.
public class NumberAnalysisClass
{
    public static void main (String[] args) throws IOException
    {
	String inputFileLoc = "InputFile.txt";
	String input = "";
	int line = 0;
	BufferedReader infile;

	infile = new BufferedReader (new FileReader (inputFileLoc));
	while (true)
	{
	    input = infile.readLine ();
	    if (input == null)
		break;
	    line++;
	}

	double[] num = new double [line];
	infile.close ();

	infile = new BufferedReader (new FileReader (inputFileLoc));
	for (int i = 0 ; i < num.length ; i++)
	{
	    num [i] = Double.parseDouble (infile.readLine ());
	}
	infile.close ();

	System.out.println (getLowest (num));
	System.out.println (getHighest (num));
	System.out.println (getTotal (num));
	System.out.println (getAverage (num));


    } // main method


    public static double getTotal (double[] in)
    {
	double total = 0;
	for (int i = 0 ; i < in.length ; i++)
	    total = total + in [i];
	return total;
    }


    public static double getAverage (double[] in)
    {
	double average;
	average = getTotal (in) / in.length;
	return average;
    }


    public static double getHighest (double[] in)
    {
	double high = in [0];
	for (int i = 1 ; i < in.length ; i++)
	    if (high < in [i])
		high = in [i];
	return high;
    }


    public static double getLowest (double[] in)
    {
	double low = in [0];
	for (int i = 1 ; i < in.length ; i++)
	    if (low > in [i])
		low = in [i];
	return low;
    }
} // NumberAnalysisClass class
