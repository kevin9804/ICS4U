//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #6

import hsa.*;
// The "LandCalculation" class.
public class LandCalculation
{
    public static void main (String[] args)
    {
	// Declare Variables
	double equivalent;
	double square;
	double acre;
	
	//Input valus
	equivalent = 43560;
	square = 389767;
	
	//calculate
	acre = square / equivalent;
	
	//Output
	Stdout.println("The number of acres in a tract of land with 389,767 square feet is " + acre);
	
	
    } // main method
} // LandCalculation class
