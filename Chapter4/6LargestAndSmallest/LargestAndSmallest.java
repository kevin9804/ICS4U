//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 6

import hsa.*;
// The "LargestAndSmallest" class.
//题目要求用户输入一组数字，直到用户输入“-99”才停止让用户继续输入然后返回用户所输入的最大和最小数字
//解题思路：此题不要求保存用户输入的所有数字，所以只需要将用户输入的数字和现有数字进行比对，将更大和更小的两个留下，其余数字可以直接抛弃，而最大最小数的初始值即为初次输入数值
/*
！！！BUG：此题题目中没有明确说明作为终止信号的“-99”是否计入最大最小数的比较，因此以下程序中默认将其计入比较
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
		//判断输入的数字是否比现存最大的更大，如是则替换现有的，下面比最小同理
		largest = input;
	    else if (input < smallest)
		smallest = input;
	}

	//Output
	Stdout.println ("The largest number is " + largest);
	Stdout.println ("The smallest number is " + smallest);
    } // main method
} // LargestAndSmallest class
