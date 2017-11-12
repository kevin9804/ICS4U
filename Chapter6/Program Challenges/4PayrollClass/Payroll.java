//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #4

// The "Payroll" class.
public class Payroll
{
    private String name;
    private int IDnumber;
    private double hpr; //hourly pay rate
    private double nohw; //number of hours worked

    public Payroll (String nam, int ID)
    {
	name = nam;
	IDnumber = ID;
    }


    public void setHpr (double rate)
    {
	hpr = rate;
    }


    public void setNohw (double num)
    {
	nohw = num;
    }


    public String getName ()
    {
	return name;
    }


    public int getIDnumber ()
    {
	return IDnumber;
    }


    public double getHpr ()
    {
	return hpr;
    }


    public double getNohw ()
    {
	return nohw;
    }


    public double getPay ()
    {
	return hpr * nohw;
    }
} // Payroll class
