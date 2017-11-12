//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #8

import hsa.*;
// The "CookieCalories" class.
public class CookieCalories
{
    public static void main (String[] args)
    {
	// Declare Variables
	double bag;
	double serving;
	double equal;
	double calories1;
	double cokie;
	double cokies;
	double calories;


	//Input
	Stdout.println ("Please input the cokies you eat.");
	cokies = Stdin.readDouble ();
	bag = 40;
	serving = 10;
	equal = 300;

	//calculate
	calories1 = serving * equal;
	cokie = calories1 / bag;
	calories = cokies * cokie;

	//Output
	System.out.println ("Total calories you have taken is " + calories);


    } // main method
} // CookieCalories class
