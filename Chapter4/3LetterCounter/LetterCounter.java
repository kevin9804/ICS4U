//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 3

import hsa.*;
// The "LetterCounter" class.
//��ĿҪ�����û�����һ���ַ���һ����ĸ��Ȼ��������ĸ���ַ������ܹ������˼���
//����˼·������һ��int���͵ļ�����counter��Ȼ������ַ����ĳ��ȶ��ַ����е�ÿ��λ�ý��бȽϣ����ȶ�һ�µ��ַ��򽫼�����counter++
public class LetterCounter
{
    public static void main (String[] args)
    {
	//Variables
	String word, letter, test;
	int num, counter;

	//Input
	Stdout.print ("Please enter a string: ");
	word = Stdin.readLine ();
	Stdout.print ("Please enter a letter: ");
	letter = Stdin.readLine ();
	letter = letter.toLowerCase (); //����ĸ�ʹ��ȶ��ַ����е���ĸ��תΪСд���бȽϣ�������Ϊ��Сд��ͬ��������©
	counter = 0; //������������

	//run
	for (num = word.length () ; num > 0 ; num--)
	    //�˴�for loop�õݼ���ģʽ�����ַ����ܳ���ʼ����ݼ�
	    {
		test = word.substring (num - 1, num);
		//testΪ�ַ����еĴ�����ĸ����substringָ����ԭ�ַ�������ȡ������ָ��ο�String����÷���
		test = test.toLowerCase ();
		//������˵����������ĸҲתΪСд
		if (letter.compareTo (test) == 0)
		{
		    counter++;
		}
	    }

	//Output
	Stdout.println (counter);

    } // main method
} // LetterCounter class
