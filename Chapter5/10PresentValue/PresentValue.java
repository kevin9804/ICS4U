//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #10(16)

import hsa.*;
// The "PresentValue" class.
public class PresentValue
{
    public static void main (String[] args)
    {
	double future,rate,year;
	Stdout.print("The future value that you want in the account is: ");
	future=Stdin.readDouble();
	Stdout.print("The annual interest rate is: ");
	rate=Stdin.readDouble();
	Stdout.print("The number of years that you plan to let the money sit in the account is: ");
	year=Stdin.readDouble();
	Stdout.println("The amount that you need to deposit today is "+presentValue(future,rate,year));
	
    }
    
    public static double presentValue(double F,double r,double n)
    {
	double P,a;
	a=Math.pow(1+r,n);
	Stdout.println(a);
	P=F/a;
	return P;
    }
} // PresentValue class
