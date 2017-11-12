//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #E16

import hsa.*;
// The "CalendarMonth" class.
public class CalendarMonth
{
    public static void main (String[] args)
    {
	//Variables
	int start,days;
	String blank=" ";
	//Input
	Stdout.print("Day the month starts on (1 for Sunday): ");
	start = Stdin.readInt();
	Stdout.print("Number of days in month: ");
	days = Stdin.readInt();
	
	Stdout.println("\n  Sun Mon Tue Wed Thu Fri Sat");
	//Loop
	for (int i=1;i<=4*start;i++)
	Stdout.print(blank);
	for (int i=1;i<=days;i++)
	{
	while (i<9&&i<days)
	{
	Stdout.print(i+"   ");
	if (i+start-7==1)
	Stdout.print("\n    ");
	i++;
	}
	Stdout.print(i+"  ");
	if ((i+start-1)%7==0)
	Stdout.print("\n   ");
	}
    } // main method
} // CalendarMonth class
