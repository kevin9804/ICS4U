//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenge # 10

import hsa.*;
// The "SquareDisplay" class.
/*
题目要求：要求用户输入正方形边长数值，并用X表示，绘制出由X组成的正方形图案
结题思路：此题需要用两个for loop套用来完成
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
	    //第一层循环代表行，每行绘制完了才能换下一行
	    for (int counter2 = 1 ; counter2 <= num ; counter2++)
	    {
		//第二层循环则是每行个数，也就是列数
		Stdout.print (a);
	    }
	    Stdout.print ("\n");
	    //换行符
	}


    } // main method
} // SquareDisplay class
