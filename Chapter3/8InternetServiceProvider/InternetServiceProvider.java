//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 3 Programming Challenges #8

import hsa.*;
public class InternetServiceProvider
{
    public static void main (String[] args)
    {
	//Vairables
	String ca;
	char cha;
	double hours,total;
	
	//Input
	total = 0;
	Stdout.println("Please enter the package you want to choice(a, b or c).");
	ca = Stdin.readLine();
	cha = ca.charAt(0);
	Stdout.println("Please enter the hours you want to use.");
	hours = Stdin.readDouble();
	
	//Decide
	switch(cha)
	{
	case 'a':
	case 'A':
	if (hours>10)
	total = 9.95 + 2 * ( hours -10 );
	else
	total = 9.95;
	break;
	case 'b':
	case 'B':
	if (hours>20)
	total = 13.95 + 1 * ( hours -10 );
	else
	total = 13.95;
	break;
	case 'c':
	case 'C':
	total = 19.95;
	break;
	}
	
	//Output
	Stdout.println("The total charges you will pay is "+ total);
	
    } // main method
} // InternetServiceProvider class
