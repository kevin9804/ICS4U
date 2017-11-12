//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #8

import java.io.*;
import hsa.*;
// The "UppercaseFileConverter" class.
//此题要求将所有file1中字母转为大写抄录至file2，此程序中用InputFile和OutputFile代替
public class UppercaseFileConverter
{
    public static void main (String[] args) throws IOException
    {
	//Variables
	String inputFileLoc = "InputFile.txt";
	String str = "";
	String outputFileLoc = "OutputFile.txt";
	BufferedReader infile;
	PrintWriter output;

	//Input
	infile = new BufferedReader (new FileReader (inputFileLoc));
	output = new PrintWriter (new FileWriter (outputFileLoc));

	//Output Print
	while (true)
	{
	    str = infile.readLine ();
	    //读取infile中的一行字符串暂存到str
	    if (str == null)
		//读到InputFile没有内容为止
		break;
	    else
		output.println (str.toUpperCase ());
	    //将InputFile中读到的字符串用toUpperCase指令转为大写并output
	}

	//File Close
	infile.close ();
	output.close ();
	//完成后关闭两个文件
    } // main method
} // UppercaseFileConverter class
