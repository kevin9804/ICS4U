//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #6

import hsa.*;
// The "FreezingAndBoilingPoints" class.
public class FreezingAndBoilingPoints
{
    public static void main (String[] args)
    {
	Temperature points = new Temperature ();
	System.out.println ("Please enter the temperature you want to test.");
	double temperature = Stdin.readDouble ();
	System.out.println ("Ethyl Freezing: " + points.isEthylFreezing (temperature));
	System.out.println ("Ethyl Boiling: " + points.isEthylBoiling (temperature));
	System.out.println ("Oxygen Freezing: " + points.isOxygenFreezing (temperature));
	System.out.println ("Oxygen Boiling: " + points.isOxygenBoiling (temperature));
	System.out.println ("Water Freezing: " + points.isWaterFreezing (temperature));
	System.out.println ("Water Boiling: " + points.isWaterBoiling (temperature));
    } // main method
} // FreezingAndBoilingPoints class
