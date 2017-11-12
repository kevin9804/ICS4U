//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #11

import hsa.*;
// The "DiceGame" class.
//题目要求电脑和用户进行色子比赛，由程序随机生成1~6的数字，第一次代表电脑，第二次代表用户，大者胜，一共10次，累计得出最终赢家
public class DiceGame
{
    public static void main (String[] args)
    {
	//Variables
	int computer, user;
	int num, count;
	//Input
	num = 0;
	//用num来计算双方分别赢得次数，用户赢则将num加一，反之减一，平则不变，最后根据num正负判断人机人机胜负

	//loop
	for (count = 1 ; count <= 10 ; count++)
	    //用for loop循环10次掷色子
	    {
		computer = 1 + (int) (Math.random () * 6); //用Math函数生成随机数
		Stdout.println ("Computer " + count + " times number is " + computer);
		user = 1 + (int) (Math.random () * 6);
		Stdout.println ("User " + count + " times number is " + user);
		if (user > computer)
		    num++;
		else if (user < computer)
		    num--;
		Stdout.println ("Press enter to continue.");
		Stdin.readLine ();
	    }

	if (num > 0)
	    Stdout.println ("User win.");
	else if (num < 0)
	    Stdout.println ("Computer win.");
	else
	    Stdout.println ("Draw");

    } // main method
} // DiceGame class
