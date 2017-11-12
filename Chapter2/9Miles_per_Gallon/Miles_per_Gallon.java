//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #9

import hsa.*;
import javax.swing.JOptionPane;
// The "Miles_per_Gallon" class.
public class Miles_per_Gallon
{
    public static void main (String[] args)
    {
	// Declare Variables
	double miles;
	double gallons;
	double MPG;
	
	//Input
	Stdout.println("How many miles you have driven?");
	miles = Stdin.readDouble();
	Stdout.println("How much gas you have used?");
	gallons = Stdin.readDouble();
	
	//calculate
	MPG = miles / gallons;
	
	//Output   
	Stdout.println("The MPG of your car is " + MPG);
	
	
    } // main method
} // Miles_per_Gallon class
