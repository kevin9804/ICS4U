//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Programming Challenges # 1

import hsa.*;
/*
������ĿҪ����ĿҪ���û�����һ������n������1~n֮���������ּӺ�
*/
// The "SumOfNumbers" class.
public class SumOfNumbers
{
    public static void main (String[] args)
    {
	//Variables
	int num, total;

	//Input
	Stdout.print ("Please enter a nonzero integer value: ");
	num = Stdin.readInt ();
	total = 0;
	//totalΪ�Ӻ�ʱ�������������ʼֵΪ0�������û���������

	//Loop
	for (int count = 1 ; count <= num ; count++)
	    //for loopѭ����������ĿҪ���1��ʼ�ӣ�����count��1��ʼ���ӵ��û�����ֵnumΪֹ
	    {
		total += count;
		//��ԭ��total�����ϼ���count���൱�ڡ�total=total+count��
	    }

	//Output
	Stdout.println (total);
    } // main method
} // SumOfNumbers class
