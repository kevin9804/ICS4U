//Leyao Li 2015070006
//Kevin-Lee
//ICS4U - Per 5
//Chapter 3 Programming Challenges # 5

import hsa.*;
// The "SoftwareSales" class.
public class SoftwareSales
{
    public static void main (String[] args)
    {
	//Variables
	double packages,discount,total;
	
	//Input
	Stdout.println("Please enter the number of packages you have bought.");
	packages = Stdin.readDouble();
	
	//Calculate
	if (packages < 10)
	{
	total = packages * 99;
	Stdout.println("The total amount of the purchase is "+total);
	}
	else if (packages <20)
	    {
	    discount = packages * 99 * 0.2;
	    total = packages *99 - discount;
	    Stdout.println("The total amount of the discount is "+discount);
	    Stdout.println("The total amount of the purchase after the discount is "+total);
	    }
	    else if (packages < 50)
		{
		discount = packages * 99 * 0.3;
		total = packages *99 - discount;
		Stdout.println("The total amount of the discount is "+discount);
		Stdout.println("The total amount of the purchase after the discount is "+total);
		}
		else if (packages < 100)
		{
		discount = packages * 99 * 0.4;
		total = packages *99 - discount;
		Stdout.println("The total amount of the discount is "+discount);
		Stdout.println("The total amount of the purchase after the discount is "+total);
		}
		else
		{
		discount = packages * 99 * 0.5;
		total = packages *99 - discount;
		Stdout.println("The total amount of the discount is "+discount);
		Stdout.println("The total amount of the purchase after the discount is "+total);
		}
    } // main method
} // SoftwareSales class
