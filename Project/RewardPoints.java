// The "RewardPoints" class.
public class RewardPoints
{
    private String receiver;
    private int points;
    public RewardPoints (String receiver, int points)
    {
	this.receiver = receiver;
	this.points = points;
    }


    public String getReceiver ()
    {
	return receiver;
    }


    public int getPoints ()
    {
	return points;
    }
} // RewardPoints class
