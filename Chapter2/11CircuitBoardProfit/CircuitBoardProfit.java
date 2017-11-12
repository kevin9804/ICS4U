//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #11

import hsa.*;
// The "CircuitBoardProfit" class.
public class CircuitBoardProfit
{
    public static void main (String[] args)
    {
	// Declare Variables
	double retail;
	double profit;
	
	//Input valus
	Stdout.println("Enter the retail price of circuit board.");
	retail = Stdin.readDouble();
	
	//calculate
	profit = retail * 0.4;
	
	//Output
	Stdout.println("The profit of each circuit board is " + profit);
	
    } // main method
} // CircuitBoardProfit class
