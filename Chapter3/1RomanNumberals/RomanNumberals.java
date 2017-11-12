//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 3 Programming Challenges #1

import hsa.*;
// The "RomanNumberals" class.
public class RomanNumberals
{
    public static void main (String[] args)
    {
	//Variables
	int num;

	//Input
	Stdout.println ("Please input a number within the range of 1 through 10.");
	num = Stdin.readInt ();

	//decide
	switch (num)
	{
	    case 1:
		System.out.println ("The number your input is I.");
		break;
	    case 2:
		System.out.println ("The number your input is II.");
		break;
	    case 3:
		System.out.println ("The number your input is III.");
		break;
	    case 4:
		System.out.println ("The number your input is IV.");
		break;
	    case 5:
		System.out.println ("The number your input is V.");
		break;
	    case 6:
		System.out.println ("The number your input is VI.");
		break;
	    case 7:
		System.out.println ("The number your input is VII.");
		break;
	    case 8:
		System.out.println ("The number your input is VIII.");
		break;
	    case 9:
		System.out.println ("The number your input is IX.");
		break;
	    case 10:
		System.out.println ("The number your input is X.");
		break;
	    default:
		Stdout.println ("The number your input is not range of 1 through 10");
		break;
	}
    } // main method
} // RomanNumberals class
