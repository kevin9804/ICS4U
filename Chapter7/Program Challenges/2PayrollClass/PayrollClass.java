//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #2

import hsa.*;
// The "PayrollClass" class.
public class PayrollClass
{
    public static void main (String[] args)
    {
	//Variables
	int[] employeeID = {5658845, 4520125, 7895122, 8777541,
	    8451277, 1302850, 7580489};
	int[] hours = new int [employeeID.length];
	double[] payRate = new double [employeeID.length];
	double[] wages = new double [employeeID.length];

	for (int i = 0 ; i < employeeID.length ; i++)
	{
	    System.out.println ("Please enter the working hour of " + employeeID [i]);
	    hours [i] = Stdin.readInt ();
	    System.out.println ("Please enter the pay rate of " + employeeID [i]);
	    payRate [i] = Stdin.readDouble ();
	}

	System.out.println ("employeeID\twages");
	for (int i = 0 ; i < employeeID.length ; i++)
	{
	    System.out.println (employeeID [i] + "\t\t" + (hours [i] * payRate [i]));
	}

    } // main method
} // PayrollClass class


