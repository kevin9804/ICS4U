//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenge # 10

import hsa.*;
// The "SquareDisplay" class.
/*
��ĿҪ��Ҫ���û����������α߳���ֵ������X��ʾ�����Ƴ���X��ɵ�������ͼ��
����˼·��������Ҫ������for loop���������
*/
public class SquareDisplay
{
    public static void main (String[] args)
    {
	//Variable
	int num;
	String a;

	//Input
	Stdout.print ("Enter the number of square: ");
	num = Stdin.readInt ();
	a = "X";

	//run
	for (int counter1 = 1 ; counter1 <= num ; counter1++)
	{
	    //��һ��ѭ�������У�ÿ�л������˲��ܻ���һ��
	    for (int counter2 = 1 ; counter2 <= num ; counter2++)
	    {
		//�ڶ���ѭ������ÿ�и�����Ҳ��������
		Stdout.print (a);
	    }
	    Stdout.print ("\n");
	    //���з�
	}


    } // main method
} // SquareDisplay class
