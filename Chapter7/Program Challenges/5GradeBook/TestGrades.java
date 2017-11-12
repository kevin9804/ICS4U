//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #5

// The "TestGrades" class.
public class TestGrades
{
    private String[] name = new String [5];
    private double[] [] grade = new double [name.length] [4];

    public void setName (String[] input)
    {
	for (int i = 0 ; i < name.length ; i++)
	{
	    name [i] = input [i];
	}
    }


    public void setGrade (double[] mark, int s)
    {
	for (int i = 0 ; i < grade [0].length ; i++)
	{
	    grade [s] [i] = mark [i];
	}
    }


    public void showNameAndGrade ()
    {
	double total = 0;
	for (int n = 0 ; n < name.length ; n++)
	{
	    System.out.print (name [n] + "\t");
	    for (int g = 0 ; g < grade [n].length ; g++)
	    {
		System.out.print (grade [n] [g] + "\t");
		total = total + grade [n] [g];
	    }
	    if ((total / 4) >= 90)
		System.out.print ("A");
	    else if ((total / 4) >= 80)
		System.out.print ("B");
	    else if ((total / 4) >= 70)
		System.out.print ("C");
	    else if ((total / 4) >= 60)
		System.out.print ("D");
	    else
		System.out.print ("F");
	    System.out.print ("\n");
	    total = 0;
	}
    }


    public String[] getName ()
    {
	return name;
    }
} // TestGrades class


