//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #8

import java.io.*;
import hsa.*;
// The "UppercaseFileConverter" class.
//����Ҫ������file1����ĸתΪ��д��¼��file2���˳�������InputFile��OutputFile����
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
	    //��ȡinfile�е�һ���ַ����ݴ浽str
	    if (str == null)
		//����InputFileû������Ϊֹ
		break;
	    else
		output.println (str.toUpperCase ());
	    //��InputFile�ж������ַ�����toUpperCaseָ��תΪ��д��output
	}

	//File Close
	infile.close ();
	output.close ();
	//��ɺ�ر������ļ�
    } // main method
} // UppercaseFileConverter class
