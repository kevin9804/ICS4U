//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E10 

import hsa.*;
// The "SquareTable" class.
public class SquareTable
{
    public static void main (String[] args)
    {
	int a;
	Stdout.println("Num Square Num Square Num Square Num Square");
	for (int i=1;i<=3;i++)
	{
	Stdout.print(i+"        "+i*i+"  ");
	a = i+20;
	Stdout.print(a+"    "+a*a+"  ");
	a = a+20;
	Stdout.print(a+"   "+a*a+"  ");
	a = a+20;
	Stdout.println(a+"   "+a*a);
	}
	for (int i=4;i<=9;i++)
	{
	Stdout.print(i+"       "+i*i+"  ");
	a = i+20;
	Stdout.print(a+"    "+a*a+"  ");
	a = a+20;
	Stdout.print(a+"   "+a*a+"  ");
	a = a+20;
	Stdout.println(a+"   "+a*a);
	}
	for (int i=10;i<=11;i++)
	{
	Stdout.print(i+"     "+i*i+"  ");
	a = i+20;
	Stdout.print(a+"    "+a*a+"  ");
	a = a+20;
	Stdout.print(a+"   "+a*a+"  ");
	a = a+20;
	Stdout.println(a+"   "+a*a);
	}
	for (int i=12;i<=20;i++)
	{
	Stdout.print(i+"     "+i*i+"  ");
	a = i+20;
	Stdout.print(a+"   "+a*a+"  ");
	a = a+20;
	Stdout.print(a+"   "+a*a+"  ");
	a = a+20;
	Stdout.println(a+"   "+a*a);
	}
	
    } // main method
} // SquareTable class
