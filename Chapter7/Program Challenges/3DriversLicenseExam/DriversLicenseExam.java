//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #3

import hsa.*;
// The "DriversLicenseExam" class.
public class DriversLicenseExam
{
    public static void main (String[] args)
    {
	char[] answer = new char [20];
	char input;
	for (int i = 0 ; i < answer.length ; i++)
	{
	    System.out.println ("Please enter the answer of question " + (i + 1));
	    input = Stdin.readChar ();
	    while (input != 'A' && input != 'B' && input != 'C' && input != 'D')
	    {
		System.out.println ("The answer of question " + (i + 1) + " must be \"A\",\"B\",\"C\"or\"D\"");
		System.out.println ("Please enter your answer again");
		input = Stdin.readChar ();
	    }
	    answer [i] = input;

	}
	DriverExam box = new DriverExam (answer);
	if (box.passed ())
	{
	    System.out.println ("You passed the exam.");
	}
	else
	{
	    System.out.println ("You failed the exam.");
	}
	System.out.println ("You make total " + box.totalCorrect () + " questions correct.");
	System.out.println ("You make total " + box.totalIncorrect () + " questions incorrect.");

	int[] missed = box.questionsMissed ();
	if (missed.length != 0)
	{
	    System.out.println ("You missed these questions.\n");
	    for (int i = 0 ; i < missed.length ; i++)
	    {
		System.out.print (missed [i] + " ");
	    }
	}
    } // main method
} // DriversLicenseExam class


