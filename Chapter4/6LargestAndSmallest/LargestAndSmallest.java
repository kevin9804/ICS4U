//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 6

import hsa.*;
// The "LargestAndSmallest" class.
//��ĿҪ���û�����һ�����֣�ֱ���û����롰-99����ֹͣ���û���������Ȼ�󷵻��û��������������С����
//����˼·�����ⲻҪ�󱣴��û�������������֣�����ֻ��Ҫ���û���������ֺ��������ֽ��бȶԣ�������͸�С���������£��������ֿ���ֱ���������������С���ĳ�ʼֵ��Ϊ����������ֵ
/*
������BUG��������Ŀ��û����ȷ˵����Ϊ��ֹ�źŵġ�-99���Ƿ���������С���ıȽϣ�������³�����Ĭ�Ͻ������Ƚ�
*/
public class LargestAndSmallest
{
    public static void main (String[] args)
    {
	//Variables
	int input, largest, smallest;

	//Input
	Stdout.print ("Pleasr enter a number: ");
	input = Stdin.readInt ();
	largest = input;
	smallest = input;
	while (input != -99)
	{
	    Stdout.print ("Pleasr enter a number: ");
	    input = Stdin.readInt ();
	    if (input > largest)
		//�ж�����������Ƿ���ִ����ĸ����������滻���еģ��������Сͬ��
		largest = input;
	    else if (input < smallest)
		smallest = input;
	}

	//Output
	Stdout.println ("The largest number is " + largest);
	Stdout.println ("The smallest number is " + smallest);
    } // main method
} // LargestAndSmallest class
