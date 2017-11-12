//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 Per 5
//Chapter 7 Algorithm Workbench #5

// The "Pay" class.
public class Pay
{
    public static void main (String[] args)
    {
	int[] ID = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
	double[] pay = {200, 250, 180, 190, 210, 220, 225, 230, 240, 245};

	System.out.println ("ID number\tweekly gross pay");

	for (int i = 0 ; i < 10 ; i++)
	{
	    System.out.println (ID [i] + "\t\t" + pay [i]);
	}
    } // main method
} // Pay class
