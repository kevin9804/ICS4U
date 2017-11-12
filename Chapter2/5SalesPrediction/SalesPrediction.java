//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #5

import hsa.*;
// The "SalesPrediction" class.
public class SalesPrediction
{
    public static void main (String[] args)
    {
	// Declare Variables
	double totalsales;
	double persentage;
	double sales;
	
	//Input valus
	totalsales = 4600000;
	persentage = 0.62;
	
	//calculate
	sales = totalsales * persentage;
	
	//Output
	Stdout.println("The East Coast division will generate " + sales);
	
    } // main method
} // SalesPrediction class
