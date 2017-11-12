//Yue Huang
//ICS4U Final Project

// The "Children" class.
import hsa.*;
import java.io.*;
public class Children extends Account
{
    private int selection;
    private HouseholdChore[] householdChores;
    private String[] types;
    private int number;

    public Children (String name, int id)
    {
	super (name, id);
    }


    public void mainScreen () throws IOException
    {
	readChoreTypes ();
	while (true)
	{
	    System.out.println ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \tChildren user\t\t\t###");
	    System.out.println ("### \t1)Check household chore\t\t###");
	    System.out.println ("### \t2)Get a household chore\t\t###");
	    System.out.println ("### \t3)List current household chore\t###");
	    System.out.println ("### \t4)Submit household chore\t###");
	    System.out.println ("### \t5)Get Rewards\t\t\t###");
	    System.out.println ("### \t6)Log out\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.print ("Enter the number to choice your option: ");
	    selection = Stdin.readInt ();
	    if (selection == 1)
		checkAssignment ();
	    else if (selection == 2)
		getAssignment ();
	    else if (selection == 3)
		listAssignment ();
	    else if (selection == 4)
		submitAssignment ();
	    else if (selection == 5)
		System.out.println ("Get rewards");
	    else if (selection == 6)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
	saveChores ();
    }


    public boolean checkAssignment ()
    {
	for (int i = 0 ; i < number ; i++)
	{
	    if (householdChores [i].getStates ().compareTo ("pending") != 0
		    && householdChores [i].getStates ().compareTo ("finish") != 0)
		if (householdChores [i].getWorker ().compareTo (getName ()) == 0)
		{
		    System.out.println (householdChores [i]);
		    return false;
		}
	}
	System.out.println ("You do not have any household chore need to do now.");
	return true;
    }


    public void getAssignment ()
    {
	if (checkAssignment ())
	{
	    listAssignment ();
	    System.out.print ("Please enter the number of the household chore you want to do:");
	    selection = Stdin.readInt ();
	    if (selection < 1 || selection > number)
	    {
		System.out.print ("Wrong number had been selected.");
		return;
	    }
	    else
	    {
		if (householdChores [selection - 1].getStates ().compareTo ("deleted") == 0)
		    System.out.println ("This household chore have been deleted. Try anothor one.");
		else if (householdChores [selection - 1].getStates ().compareTo ("finish") == 0)
		    System.out.println ("This household chore have been done. Try anothor one.");
		else if (householdChores [selection - 1].updateStates ("working", getName ()))
		    System.out.println ("You have been assigned to this household chore. Plase finish it as soon as possible.");
		else
		    System.out.println ("This household chore have been choosed by other user. Try anothor one.");
	    }
	}
    }


    public void submitAssignment ()
    {
	if (checkAssignment ())
	{
	    System.out.println ("You do not have any assignment need to submit.");
	    return;
	}
	else
	{
	    for (int i = 0 ; i < number ; i++)
	    {
		if (householdChores [i].getStates ().compareTo ("pending") != 0)
		    if (householdChores [i].getWorker ().compareTo (getName ()) == 0)
		    {
			System.out.println ("Do you want to submit this assignment?\n1)Yes\n2)Later");
			if (Stdin.readInt () == 1)
			    if (householdChores [i].updateStates ("finish", getName ()))
			    {
				System.out.println ("Please enter the time you expected to finish this household chore:");
				System.out.println ("Example: 3.5 hours or 3 hours 30 minutes in form of: 3.5");
				double actualTime = Stdin.readDouble ();
				householdChores [i].setActualTime (actualTime);
				System.out.println ("Successful submit this household chore.");
				return;
			    }
			    else
				System.out.println ("Something went wrong, try again later");
		    }
	    }
	}
    }


    public void listAssignment ()
    {
	if (number == 0)
	    System.out.println ("\nThere are no household chore now.\n");
	else
	    for (int i = 0 ; i < number ; i++)
	    {
		System.out.println ("\n");
		System.out.println (householdChores [i]);
		System.out.println ("\n");
	    }
    }


    public void readChoreTypes () throws IOException
    {
	String inputFileLoc = "householdChoreTypes";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	number = Integer.parseInt (infile.readLine ());
	if (number < 1)
	{
	    return;
	}


	else
	{
	    types = new String [number];
	    for (int i = 0 ; i < number ; i++)
	    {
		types [i] = infile.readLine ();
	    }
	    infile.close ();
	    readChores ();
	}
    }


    public void readChores () throws IOException
    {
	String inputFileLoc = "chores";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	householdChores = new HouseholdChore [number];
	for (int i = 0 ; i < number ; i++)
	{
	    if (types [i].compareTo ("Cleaning") == 0)
	    {
		Cleaning chore = new Cleaning (Integer.parseInt (infile.readLine ()), infile.readLine (), infile.readLine (),
			Integer.parseInt (infile.readLine ()), infile.readLine (), infile.readLine (), Double.parseDouble (infile.readLine ()));
		if (chore.getStates ().compareTo ("pending") != 0)
		{
		    chore.setWorker (infile.readLine ());
		    if (chore.getStates ().compareTo ("finish") == 0
			    || chore.getStates ().compareTo ("deleted") == 0)
		    {
			chore.setActualTime (Double.parseDouble (infile.readLine ()));
		    }
		}
		householdChores [i] = chore;
	    }
	    else if (types [i].compareTo ("Shopping") == 0)
	    {
		Shopping chore = new Shopping (Integer.parseInt (infile.readLine ()), infile.readLine (), infile.readLine (),
			Integer.parseInt (infile.readLine ()), infile.readLine (), Double.parseDouble (infile.readLine ()), Double.parseDouble (infile.readLine ()));
		if (chore.getStates ().compareTo ("pending") != 0)
		{
		    chore.setWorker (infile.readLine ());
		    if (chore.getStates ().compareTo ("finish") == 0
			    || chore.getStates ().compareTo ("deleted") == 0)
		    {
			chore.setActualTime (Double.parseDouble (infile.readLine ()));
		    }
		}
		householdChores [i] = chore;
	    }
	}


	infile.close ();
    }


    public void saveChores () throws IOException
    {
	String outputFileLoc = "chores";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	for (int i = 0 ; i < number ; i++)
	{
	    output.println (householdChores [i].getId ());
	    output.println (householdChores [i].getName ());
	    output.println (householdChores [i].getStates ());
	    output.println (householdChores [i].getPoints ());
	    output.println (householdChores [i].getCreator ());
	    output.println (householdChores [i].getDetail ());
	    output.println (householdChores [i].getExpectedTime ());
	    if (householdChores [i].getStates ().compareTo ("pending") != 0)
		output.println (householdChores [i].getWorker ());
	    if (householdChores [i].getStates ().compareTo ("finish") == 0
		    || householdChores [i].getStates ().compareTo ("deleted") == 0)
		output.println (householdChores [i].getActualTime ());
	}


	output.close ();
	saveChoreTypes ();
    }


    public void saveChoreTypes () throws IOException
    {
	String outputFileLoc = "householdChoreTypes";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (number);
	for (int i = 0 ; i < number ; i++)
	{
	    output.println (types [i]);
	}


	output.close ();
    }
} // Children class


