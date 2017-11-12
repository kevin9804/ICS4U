//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #3

// The "DriverExam" class.
public class DriverExam
{
    private char[] CorrectAnswers = {'B', 'D', 'A', 'A', 'C',
	'A', 'B', 'A', 'C', 'D',
	'B', 'C', 'D', 'A', 'D',
	'C', 'C', 'B', 'D', 'A'};

    private char[] StudentsAnswers = new char [CorrectAnswers.length];

    private int num = 0;

    public DriverExam (char[] Answers)
    {
	for (int i = 0 ; i < StudentsAnswers.length ; i++)
	{
	    StudentsAnswers [i] = Answers [i];
	}
    }


    public boolean passed ()
    {
	for (int i = 0 ; i < CorrectAnswers.length ; i++)
	{
	    if (StudentsAnswers [i] == CorrectAnswers [i])
		num++;
	}
	if (num >= 15)
	    return true;
	else
	    return false;
    }


    public int totalCorrect ()
    {
	return num;
    }


    public int totalIncorrect ()
    {
	return (CorrectAnswers.length - num);
    }


    public int[] questionsMissed ()
    {
	int[] missed = new int [(20 - num)];
	int a = 0;
	for (int i = 0 ; i < CorrectAnswers.length ; i++)
	{
	    if (StudentsAnswers [i] != CorrectAnswers [i])
	    {
		missed [a] = (i + 1);
		a++;
	    }
	}
	return missed;
    }
} // DriverExam class


