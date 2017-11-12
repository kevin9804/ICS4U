//Yue Huang
//ICS4U Final Project

// The "Shopping" class.
import hsa.*;
public class Shopping extends HouseholdChore
{
    private double budget;

    public Shopping (int id, String name, String states, int points, String creator, double budget, double expectedTime)
    {
	super (id, name, states, points, creator, expectedTime);
	this.budget = budget;
    }


    public Shopping (int id, String name, String states, int points, String creator, String worker, double budget, double expectedTime)
    {
	super (id, name, states, points, creator, worker, expectedTime);
	this.budget = budget;
    }


    public String getDetail ()
    {
	return ("" + budget);
    }


    public String toString ()
    {
	if (getStates ().compareTo ("pending") != 0)
	    if (getStates ().compareTo ("finish") == 0)
		return ((getId () + 1) + "." + getName ()
			+ "\nStates: " + getStates ()
			+ "\nPoints: " + getPoints ()
			+ "\nCreator: " + getCreator ()
			+ "\nWorker: " + getWorker ()
			+ "\nType of household chore: Cleaning"
			+ "\nBudget: " + budget
			+ "\nExceptedTime: " + getExpectedTime ()
			+ "\nActual Time: " + getActualTime () + "\n");
	    else
		return ((getId () + 1) + "." + getName ()
			+ "\nStates: " + getStates ()
			+ "\nPoints: " + getPoints ()
			+ "\nCreator: " + getCreator ()
			+ "\nWorker: " + getWorker ()
			+ "\nType of household chore: Cleaning"
			+ "\nBudget: " + budget
			+ "\nExcepted Time: " + getExpectedTime () + "\n");

	else
	    return ((getId () + 1) + "." + getName ()
		    + "\nStates: " + getStates ()
		    + "\nPoints: " + getPoints ()
		    + "\nCreator: " + getCreator ()
		    + "\nType of household chore: Cleaning"
		    + "\nBudget: " + budget
		    + "\nExceptedTime: " + getExpectedTime () + "\n");
    }
}
