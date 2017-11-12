//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #16

import hsa.*;
import javax.swing.JOptionPane;
// The "EnergyDrinkConsumption" class.
public class EnergyDrinkConsumption
{
    public static void main (String[] args)
    {
	//Declare Variables
	double surveyed;
	double energy;
	double citrus_flavored;
	
	//Input
	surveyed = 12467;
	energy = surveyed * 0.14;
	citrus_flavored = energy * 0.64;
	
	//Output
	Stdout.println("The approximate number of customers in the survey who purchase one or more energy drinks per week is "+Math.round(energy));
	Stdout.println("The approximate number of customers in the survey who prefer citrus-flavored energy drinks per week is "+Math.round(citrus_flavored));
    } // main method
} // EnergyDrinkConsumption class
