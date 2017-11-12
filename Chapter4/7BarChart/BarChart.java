//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenge # 7

import hsa.*;
// The "BarChart" class.
//此题要求根据用户输入五家店的销售数据并用“*”绘制柱状统计图，每100金额1*
//解题思路，先将五家店用于绘制柱状统计图的Stirng a~e都定义为“”，避免后面加上*时因为null报错
public class BarChart
{
    public static void main (String[] args)
    {
	//Variable
	int a1, b1, c1, d1, e1;
	String a, b, c, d, e;
	int a2, b2, c2, d2, e2;

	a = "";
	b = "";
	c = "";
	d = "";
	e = "";

	//Input
	Stdout.print ("Enter today's sales for store 1: ");
	a1 = Stdin.readInt ();
	a2 = a1 / 100;
	Stdout.print ("Enter today's sales for store 2: ");
	b1 = Stdin.readInt ();
	b2 = b1 / 100;
	Stdout.print ("Enter today's sales for store 3: ");
	c1 = Stdin.readInt ();
	c2 = c1 / 100;
	Stdout.print ("Enter today's sales for store 4: ");
	d1 = Stdin.readInt ();
	d2 = d1 / 100;
	Stdout.print ("Enter today's sales for store 5: ");
	e1 = Stdin.readInt ();
	e2 = e1 / 100;


	//run
	//此处用for循环，将每家店的数字量化为*的数量
	for (int i1 = 1 ; i1 <= a2 ; i1++)
	{
	    a = a + '*';
	}
	for (int i2 = 1 ; i2 <= b2 ; i2++)
	{
	    b = b + '*';
	}
	for (int i3 = 1 ; i3 <= c2 ; i3++)
	{
	    c = c + '*';
	}
	for (int i4 = 1 ; i4 <= d2 ; i4++)
	{
	    d = d + '*';
	}
	for (int i5 = 1 ; i5 <= e2 ; i5++)
	{
	    e = e + '*';
	}

	//Output
	Stdout.println ("\nSALES BAR CHART");
	Stdout.println ("Store 1: " + a);
	Stdout.println ("Store 2: " + b);
	Stdout.println ("Store 3: " + c);
	Stdout.println ("Store 4: " + d);
	Stdout.println ("Store 5: " + e);
    } // main method
} // BarChart class
