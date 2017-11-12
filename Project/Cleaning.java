//Yue Huang
//ICS4U Final Project

// The "Cleaning" class.
import hsa.*;
public class Cleaning extends HouseholdChore
{
    private String location;

    public Cleaning (int id, String name, String states, int points, String creator, String location, double expectedTime)
    {
	super (id, name, states, points, creator, expectedTime);
	this.location = location;
    }


    public Cleaning (int id, String name, String states, int points, String creator, String worker, String location, double expectedTime)
    {
	super (id, name, states, points, creator, worker, expectedTime);
	this.location = location;
    }


    public String getDetail ()
    {
	return location;
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
			+ "\nCleaning location: " + location
			+ "\nExceptedTime: " + getExpectedTime ()
			+ "\nActual Time: " + getActualTime () + "\n");
	    else
		return ((getId () + 1) + "." + getName ()
			+ "\nStates: " + getStates ()
			+ "\nPoints: " + getPoints ()
			+ "\nCreator: " + getCreator ()
			+ "\nWorker: " + getWorker ()
			+ "\nType of household chore: Cleaning"
			+ "\nCleaning location: " + location
			+ "\nExcepted Time: " + getExpectedTime () + "\n");

	else
	    return ((getId () + 1) + "." + getName ()
		    + "\nStates: " + getStates ()
		    + "\nPoints: " + getPoints ()
		    + "\nCreator: " + getCreator ()
		    + "\nType of household chore: Cleaning"
		    + "\nCleaning location: " + location
		    + "\nExceptedTime: " + getExpectedTime () + "\n");
    }
}
