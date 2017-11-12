//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #5

import hsa.*;
// The "GradeBook" class.
public class GradeBook
{
    public static void main (String[] args)
    {
	String[] name = new String [5];
	double[] grade = new double [4];

	System.out.println ("Please enter the name of the students one by one.");
	for (int i = 0 ; i < name.length ; i++)
	{
	    name [i] = Stdin.readLine ();
	}

	TestGrades box = new TestGrades ();
	box.setName (name);

	for (int i = 0 ; i < name.length ; i++)
	{
	    System.out.println ("Please enter the mark for " + box.getName () [i]);
	    for (int g = 0 ; g < grade.length ; g++)
	    {
		grade [g] = Stdin.readDouble ();
		if (grade [g] < 0 || grade [g] > 100)
		{
		    System.out.println ("The grade you entered is not allowed, please enter again");
		    grade [g] = Stdin.readDouble ();
		}
	    }
	    box.setGrade (grade, i);
	}

	box.showNameAndGrade ();
    } // main method
} // GradeBook class
