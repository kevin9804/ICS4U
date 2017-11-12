//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 4

import java.io.*;
import hsa.*;
// The "FileLetterCounter" class.

//此题与上题不同在于要求读取文件中的字符串和用户输入的字母进行比较，所以要求读取文件
public class FileLetterCounter
{
    public static void main (String[] args) throws IOException
    {
	//Variable
	String inputFileLoc = "InputFile.txt"; //定义待读取文件名
	String str = "";    //empty string//用于读取文件后暂存的String变量
	String test, letter; //和上题相同的用户输入letter字母和文件中的待测字母
	int counter, num; //计数器counter和一行中文本长度num

	//Infile
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	//opens the file for reading
	//将待读取文件打开就位

	//Input
	Stdout.println ("Please enter the letter.");
	letter = Stdin.readLine ();
	letter = letter.toLowerCase ();
	counter = 0;
	//让用户输入字母

	while (true) //infile loop
	    //读取文件的循环，设定为true一直执行，直到文件结尾无内容时break
	    {
		str = infile.readLine ();   //reads one complete line
		//读取一整行文件中的文本并暂存
		if (str == null) // true only when you read end of file
		    break;
		//判断当读不到内容是，则break终止循环
		else
		    //否则和上体一样，将文件中读到的String和用户输入的字母进行比对判定
		    for (num = str.length () ; num > 0 ; num--)
		    {
			test = str.substring (num - 1, num);
			test = test.toLowerCase ();
			if (letter.compareTo (test) == 0)
			{
			    counter++;
			}
		    }
	    }
	Stdout.println (counter);
	infile.close ();
	//print出计数器记录的最终结果，然后关闭被读取的文件
    } // main method
} // FileLetterCounter class
