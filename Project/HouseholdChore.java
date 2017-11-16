//Yue Huang
//ICS4U Final Project

// The "HouseholdChore" class.
import hsa.*;
public abstract class HouseholdChore
{
    private int id;
    private String name;
    private String states;
    private int points;
    private String creator;
    private String worker;
    private double expectedTime;
    private double actualTime;

    public HouseholdChore (int id, String name, String states, int points, String creator, double expectedTime)
    {
	this.id = id;
	this.name = name;
	this.states = states;
	this.points = points;
	this.creator = creator;
	this.expectedTime = expectedTime;
    }


    public HouseholdChore (int id, String name, String states, int points, String creator, String worker, double expectedTime)
    {
	this.id = id;
	this.name = name;
	this.states = states;
	this.points = points;
	this.creator = creator;
	this.worker = worker;
	this.expectedTime = expectedTime;
    }


    public boolean updateStates (String states, String worker)
    {
	if (this.states.compareTo ("pending") == 0)
	{
	    this.states = states;
	    this.worker = worker;
	    if (this.states.compareTo ("deleted") == 0)
	    {
		actualTime = 0;
	    }
	}
	else if (this.worker.compareTo (worker) != 0)
	{
	    return false;
	}
	else
	{
	    this.states = states;
	}
	return true;
    }


    public void setWorker (String worker)
    {
	this.worker = worker;
    }


    public void setActualTime (double actualTime)
    {
	this.actualTime = actualTime;
    }


    public int getId ()
    {
	return id;
    }


    public String getName ()
    {
	return name;
    }


    public String getStates ()
    {
	return states;
    }


    public int getPoints ()
    {
	return points;
    }


    public String getCreator ()
    {
	return creator;
    }


    public String getWorker ()
    {
	return worker;
    }



    public double getExpectedTime ()
    {
	return expectedTime;
    }


    public double getActualTime ()
    {
	return actualTime;
    }


    public abstract String getDetail ();
} // HouseholdChore class


