//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 4

import java.io.*;
import hsa.*;
// The "FileLetterCounter" class.

//���������ⲻͬ����Ҫ���ȡ�ļ��е��ַ������û��������ĸ���бȽϣ�����Ҫ���ȡ�ļ�
public class FileLetterCounter
{
    public static void main (String[] args) throws IOException
    {
	//Variable
	String inputFileLoc = "InputFile.txt"; //�������ȡ�ļ���
	String str = "";    //empty string//���ڶ�ȡ�ļ����ݴ��String����
	String test, letter; //��������ͬ���û�����letter��ĸ���ļ��еĴ�����ĸ
	int counter, num; //������counter��һ�����ı�����num

	//Infile
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	//opens the file for reading
	//������ȡ�ļ��򿪾�λ

	//Input
	Stdout.println ("Please enter the letter.");
	letter = Stdin.readLine ();
	letter = letter.toLowerCase ();
	counter = 0;
	//���û�������ĸ

	while (true) //infile loop
	    //��ȡ�ļ���ѭ�����趨Ϊtrueһֱִ�У�ֱ���ļ���β������ʱbreak
	    {
		str = infile.readLine ();   //reads one complete line
		//��ȡһ�����ļ��е��ı����ݴ�
		if (str == null) // true only when you read end of file
		    break;
		//�жϵ������������ǣ���break��ֹѭ��
		else
		    //���������һ�������ļ��ж�����String���û��������ĸ���бȶ��ж�
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
	//print����������¼�����ս����Ȼ��رձ���ȡ���ļ�
    } // main method
} // FileLetterCounter class
