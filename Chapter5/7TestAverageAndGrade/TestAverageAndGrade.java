//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #7

import hsa.*;
// The "TestAverageAndGrade" class.
public class TestAverageAndGrade
{
    public static void main (String[] args)
    {
	calcAverage();
    } // main method
    
    public static void calcAverage()
    {
	double scores,total=0,average;
	for (int i=1;i<=5;i++)
	{
	Stdout.println("Please enter the "+i+" test score");
	scores = Stdin.readDouble();
	determineGrade(scores);
	total = total + scores;
	}
	average=total/5;
	Stdout.println("The average score is "+average);
    }
    
    public static void determineGrade(double s)
    {
	if (s<60)
	Stdout.println("F");
	else if (s<70)
	Stdout.println("D");
	else if (s<80)
	Stdout.println("C");
	else if (s<90)
	Stdout.println("B");
	else if (s<=100)
	Stdout.println("A");
    }
} // TestAverageAndGrade class
