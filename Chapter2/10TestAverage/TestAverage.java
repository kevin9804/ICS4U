//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #10

import hsa.*;
// The "TestAverage" class.
public class TestAverage
{
    public static void main (String[] args)
    {
	// Declare Variables
	double score1;
	double score2;
	double score3;
	double average;
	
	//Input valus
	Stdout.println("Enter the first test score.");
	score1 = Stdin.readDouble();
	Stdout.println("Enter the second test score.");
	score2 = Stdin.readDouble();
	Stdout.println("Enter the third test score.");
	score3 = Stdin.readDouble();
	
	//calculate
	average = (score1+score2+score3)/3;
	
	//Output
	Stdout.println("Your first test score is "+score1);
	Stdout.println("Your second test score is "+score2);
	Stdout.println("Your third test score is "+score3);
	Stdout.println("Your average score is "+average);
	
	
    } // main method
} // TestAverage class
