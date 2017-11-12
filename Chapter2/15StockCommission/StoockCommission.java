//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #15

import hsa.*;
// The "StoockCommission" class.
public class StoockCommission
{
    public static void main (String[] args)
    {
	//Declare Variables
	double stock;
	double commission;
	double total;
	
	//Input
	stock = 600 * 21.77;
	commission =  stock * 0.02;
	total = stock + commission;
	
	//Output
	Stdout.println("The amount paid for the stock alone is " + stock);
	Stdout.println("The amount paid for the commission is " + commission);
	Stdout.println("The total amount paid is " + total);
	
	
    } // main method
} // StoockCommission class
