//Leyao Li
//Kevin-Lee

import hsa.*;
import javax.swing.JOptionPane;
// The "Resistors" class.
public class Resistors
{
    public static void main (String[] args)
    {
	//Variables
	String input, colour1 = "", colour2 = "", colour3 = "", cha;
	String blank = "-";
	int num;
	double value;
	int a = 0, b = 0;
	double d, e, f, g;

	//Input
	input = JOptionPane.showInputDialog ("What is your resitors colour code?\nSeparate each colour by hyphens\nEx:Red-Orange-Black");
	num = input.length ();

	//get colour
	for (int i = 0 ; i < num ; i++)
	{
	    if (a != 0 && b != 0)
	    {
		colour1 = input.substring (0, a).toUpperCase ();
		colour2 = input.substring (a + 1, b).toUpperCase ();
		colour3 = input.substring (b + 1, num).toUpperCase ();

	    }
	    else
	    {
		cha = input.substring (i, i + 1);
		if (a == 0)
		{
		    if (cha.compareTo (blank) == 0)
			a = i;
		}
		else if (b == 0)
		{
		    if (cha.compareTo (blank) == 0)
			b = i;
		}
	    }
	}

	d = getNumber (colour1);
	e = getNumber (colour2);
	f = getNumber (colour3);
	g = Math.pow (10, f);
	value = (d * 10 + e) * g;
	System.out.println ("You entered " + colour1 + "-" + colour2 + "-" + colour3);
	System.out.println ("The value of the resistor is " + value + "ohms");
    }


    public static double getNumber (String a)
    {
	double n;
	if (a.compareTo ("BLACK") == 0)
	    n = 0;
	else if (a.compareTo ("BROWN") == 0)
	    n = 1;
	else if (a.compareTo ("RED") == 0)
	    n = 2;
	else if (a.compareTo ("ORANGE") == 0)
	    n = 3;
	else if (a.compareTo ("YELLOW") == 0)
	    n = 4;
	else if (a.compareTo ("GREEN") == 0)
	    n = 5;
	else if (a.compareTo ("BLUE") == 0)
	    n = 6;
	else if (a.compareTo ("VIOLET") == 0)
	    n = 7;
	else if (a.compareTo ("GREY") == 0)
	    n = 8;
	else if (a.compareTo ("WHITE") == 0)
	    n = 9;
	else
	    n = 10;
	return n;
    }
} // Resistors class
