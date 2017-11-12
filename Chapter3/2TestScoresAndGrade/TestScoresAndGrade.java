//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 3 Programming Challenges #2

import hsa.*;
// The "TestScoresAndGrade" class.
public class TestScoresAndGrade
{
    public static void main (String[] args)
    {
	//Variables
	double a,b,c,d;
	
	//Input
	Stdout.println("Please enter your first grade");
	a = Stdin.readDouble();
	Stdout.println("Please enter your second grade");
	b = Stdin.readDouble();
	Stdout.println("Please enter your lase grade");
	c = Stdin.readDouble();
	
	//Calculate
	d = ( a + b + c ) / 3;
	
	//Output
	if (d <= 60)
	Stdout.println("F");
	else if (d <= 70)
	Stdout.println("D");
	else if (d <= 80)
	Stdout.println("C");
	else if (d <= 90)
	Stdout.println("B");
	else if (d <= 100)
	Stdout.println("A");
	
    } // main method
} // TestScoresAndGrade class
