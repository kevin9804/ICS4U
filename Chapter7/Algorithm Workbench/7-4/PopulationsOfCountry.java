//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Algorithm Workbench #4

import hsa.*;
// The "PopulationsOfCountry" class.
public class PopulationsOfCountry
{
    public static void main (String[] args)
    {
	String[] country = new String [12];
	String[] population = new String [12];

	for (int i = 0 ; i < 12 ; i++)
	{
	    System.out.println ("Please enter the country name,"
		    + "\nand then press enter to enter the population of the country.");
	    country [i] = Stdin.readLine ();
	    population [i] = Stdin.readLine ();
	}

	System.out.print("\n");
	
	for (int i = 0 ; i < 12 ; i++)
	{
	    System.out.println (country [i] + "\t" + population [i]);
	}
    } // main method
} // PopulationsOfCountry class
