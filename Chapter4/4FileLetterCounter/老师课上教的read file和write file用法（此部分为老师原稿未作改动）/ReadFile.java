import java.io.*;
import hsa.*;
// The "ReadFile" class.
public class ReadFile
{
    public static void main (String[] args) throws IOException
    {
	String inputFileLoc = "InputFile.txt";
	String str = "";    //empty string
	
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	//opens the file for reading
	
	while (true)//infile loop
	{
	    str = infile.readLine ();   //reads one complete line
	    if (str == null) // true only when you read end of file
		break;
	    else
		Stdout.println(str);
	}
	
	infile.close();
    } // main method
} // ReadFile class
