//Leyao Li  2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 9

import hsa.*;
// The "BudgetAnalysis" class.
/*
题目要求用户输入消费预算，然后循环要求用户输入每笔开支，至循环结束print出预算结余
！！！BUG：此题并未说明循环何时终止，因此此程序中默认当用户输入支出为0时终止循环并输出预算结余
*/
public class BudgetAnalysis
{
    public static void main (String[] args)
    {
	//Variables
	int budget, expenses;

	//Input
	Stdout.print ("The price of your budget for the month is: ");
	budget = Stdin.readInt ();


	//loop
	do
	{
	    Stdout.print ("The price of you have spent is: ");
	    expenses = Stdin.readInt ();
	    budget = budget - expenses;
	}
	while (expenses != 0);

	//Output
	Stdout.println (budget);


    } // main method
} // BudgetAnalysis class
