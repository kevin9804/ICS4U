//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #17

import hsa.*;
public class IngredientAdjuster
{
    public static void main (String[] args)
    {
	//Declare Variables
	int cookies;
	double sugar;
	double butter;
	double flour;

	//Input
	Stdout.println ("How many cookies do you want to make?");
	cookies = Stdin.readInt ();

	//calculate
	sugar = cookies * 1.5 / 48;
	butter = cookies * 1 / 48;
	flour = cookies * 2.75 / 48;

	//Output
	Stdout.println ("You need " + sugar + " cups of sugar.");
	Stdout.println ("You need " + butter + " cups of butter.");
	Stdout.println ("You need " + flour + " cups of flour.");

    } // main method
} // IngredientAdjuster class
