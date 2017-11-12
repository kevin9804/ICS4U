//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Programming Challenges # 1

import hsa.*;
/*
根据题目要求，题目要求用户输入一个数字n，并将1~n之间所有数字加和
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
	//total为加和时输出的总数，初始值为0，根据用户输入增加

	//Loop
	for (int count = 1 ; count <= num ; count++)
	    //for loop循环，根据题目要求从1开始加，所以count从1开始，加到用户输入值num为止
	    {
		total += count;
		//在原有total基础上加上count，相当于“total=total+count”
	    }

	//Output
	Stdout.println (total);
    } // main method
} // SumOfNumbers class
