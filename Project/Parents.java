//Yue Huang
//ICS4U Final Project

// The "Parents" class.
import hsa.*;
import java.io.*;
public class Parents extends Account
{
    private int selection;
    private HouseholdChore[] householdChores;
    private String[] types;
    private int number;

    public Parents (String name, int id)
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
	    System.out.println ("### \tParents user\t\t\t###");
	    System.out.println ("### \t1)Create new household chore\t###");
	    System.out.println ("### \t2)List current household chore\t###");
	    System.out.println ("### \t3)Delete household chore\t###");
	    System.out.println ("### \t4)Give Rewards\t\t\t###");
	    System.out.println ("### \t5)Log out\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.print ("Enter the number to choice your option: ");
	    selection = Stdin.readInt ();
	    if (selection == 1)
		newAssignment ();
	    else if (selection == 2)
		listAssignment ();
	    else if (selection == 3)
		deleteAssignment ();
	    else if (selection == 4)
		System.out.println ("Give rewards");
	    else if (selection == 5)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
	saveChores ();
    }


    public void newAssignment ()
    {
	HouseholdChore[] new_chores = new HouseholdChore [number + 1];
	String[] new_types = new String [number + 1];
	for (int i = 0 ; i < number ; i++)
	{
	    new_chores [i] = householdChores [i];
	    new_types [i] = types [i]; //******
	}
	System.out.println ("\n");
	System.out.print ("Please enter new household chore name: ");
	String name = Stdin.readLine ();
	System.out.print ("Please enter the points for this household chore: ");
	int points = Integer.parseInt (Stdin.readLine ());
	System.out.println ("Please enter the time you expected to finish this household chore:");
	System.out.println ("Example: 3.5 hours or 3 hours 30 minutes in form of: 3.5");
	double expectedTime = Stdin.readDouble ();
	System.out.print ("1)Cleaning\n2)Shopping\nPlease select the type of household chore you want to create: ");
	selection = Stdin.readInt ();
	while (selection != 1 && selection != 2)
	{
	    System.out.print ("Wrong selection of the type of account. Try again: ");
	    selection = Stdin.readInt ();
	}
	if (selection == 1)
	{
	    new_types [number] = "Cleaning";
	    System.out.print ("Please enter the location you want to be cleaned: ");
	    String location = Stdin.readLine ();
	    new_chores [number] = new Cleaning (number, name, "pending", points, getName (), location, expectedTime);
	}
	else if (selection == 2)
	{
	    new_types [number] = "Shopping";
	    System.out.print ("Please enter the budget of your shopping: ");
	    double budget = Double.parseDouble (Stdin.readLine ());
	    new_chores [number] = new Shopping (number, name, "pending", points, getName (), budget, expectedTime);
	}
	System.out.println ("\n");
	householdChores = new_chores;
	types = new_types;
	number++;
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


    public void deleteAssignment ()
    {
	listAssignment ();
	System.out.print ("Please enter the number before household chore you want to delete: ");
	selection = Stdin.readInt ();
	if (selection < 1 && selection > number)
	{
	    System.out.println ("Wrong input of selection. Fail to delete.\n");
	    return;
	}
	System.out.println ("Deleting the household chore now...");
	if (householdChores [selection - 1].updateStates ("deleted", getName ()))
	    System.out.println ("Successful delete the household chore.");
	else
	    System.out.println ("Fail delete the household chore.");
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
} // Parents class


