//Leyao Li  2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges # 9

import hsa.*;
// The "BudgetAnalysis" class.
/*
��ĿҪ���û���������Ԥ�㣬Ȼ��ѭ��Ҫ���û�����ÿ�ʿ�֧����ѭ������print��Ԥ�����
������BUG�����Ⲣδ˵��ѭ����ʱ��ֹ����˴˳�����Ĭ�ϵ��û�����֧��Ϊ0ʱ��ֹѭ�������Ԥ�����
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
