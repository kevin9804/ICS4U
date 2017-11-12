import java.io.*;
import hsa.*;
// The "WriteFile" class.
public class WriteFile
{
    public static void main (String[] args) throws IOException
    {
	String outputFileLoc = "OutputFile.txt";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	
	output.println("numbers");
	
	for (int i = 1; i<=10; i++)
	    output.println(i);
	
	output.close();
	
    } // main method
} // WriteFile class
