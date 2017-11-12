//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 3

import hsa.*;
// The "LetterCounter" class.
//题目要求让用户输入一串字符和一个字母，然后数出字母在字符串中总共出现了几次
//解题思路：定义一个int类型的计数器counter，然后根据字符串的长度对字符串中的每个位置进行比较，若比对一致的字符则将计数器counter++
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
	letter = letter.toLowerCase (); //将字母和待比对字符串中的字母都转为小写进行比较，避免因为大小写不同而产生遗漏
	counter = 0; //将计数器归零

	//run
	for (num = word.length () ; num > 0 ; num--)
	    //此处for loop用递减的模式，从字符串总长开始往零递减
	    {
		test = word.substring (num - 1, num);
		//test为字符串中的待测字母，用substring指令将其从原字符串中提取出来（指令参考String类的用法）
		test = test.toLowerCase ();
		//如上所说，将待测字母也转为小写
		if (letter.compareTo (test) == 0)
		{
		    counter++;
		}
	    }

	//Output
	Stdout.println (counter);

    } // main method
} // LetterCounter class
