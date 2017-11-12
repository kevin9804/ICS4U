//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Projcet

import hsa.*;
import java.io.*;
// The "broken" class.
public class broken
{
    private String thing;
    private int num;
    private int repairnum;
    private int haveread;
    private int messagenum;
    private String[] things;
    private String[] broken;
    private String[] information;
    private String[] repair;
    private String[] repairinfo;
    private double[] cost;

    public broken (String t) throws IOException
    {
	thing = t;
    }


    public broken () throws IOException
    {

    }


    //This method will get the broken detail from students and teacher
    public void getBroken (String wrong, String info)
    {
	things [num] = thing;
	broken [num] = wrong;
	information [num] = info;
	repair [num] = "";
	repairinfo [num] = "";
	cost [num] = 0.00;
    }


    //This method will get the repair detail from repairman
    public void getRepair ()
    {
	String name;
	String ID;
	String date;
	int option;
	for (int i = repairnum ; i < num ; i++)
	{
	    option = 0;
	    System.out.print ("\n");
	    System.out.println (things [i]);
	    System.out.println (broken [i]);
	    System.out.println (information [i]);
	    System.out.print ("Repair:");
	    repair [i] = Stdin.readLine ();
	    System.out.print ("ID:");
	    ID = Stdin.readLine ();
	    System.out.print ("Name:");
	    name = Stdin.readLine ();
	    System.out.print ("Date:");
	    date = Stdin.readLine ();
	    repairinfo [i] = ID + " " + name + " " + date;
	    System.out.print ("Cost of money:");
	    cost [i] = Stdin.readDouble ();
	    repairnum++;
	    if (i != num - 1)
		while (option != 1 && option != 2)
		{
		    System.out.println ("Continue repair next broken?");
		    System.out.println ("1.Yes");
		    System.out.println ("2.Save and exit");
		    option = Stdin.readInt ();
		    if (option == 2)
		    {
			return;
		    }
		}
	}
	System.out.println ("\nYou have no more things to repair.\n");
    }


    //This method will show the broken and repair detail to the principal
    public double showBroken ()
    {
	double money = 0;
	for (int i = 0 ; i < repairnum ; i++)
	{
	    System.out.println (things [i]);
	    System.out.println (broken [i]);
	    System.out.println (information [i]);
	    System.out.println (repair [i]);
	    System.out.println (repairinfo [i]);
	    System.out.print ("\n");
	    money = money + cost [i];
	}
	return money;
    }


    //This method will return the money use on repair to principal
    public double getMoney ()
    {
	double money = 0;
	for (int i = 0 ; i < repairnum ; i++)
	{
	    money = money + cost [i];
	}
	return money;
    }


    //This method will read the broken number, repair number and read message number from broken file
    public int readNum (String file) throws IOException
    {
	String inputFileLoc = file;
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	num = Integer.parseInt (infile.readLine ());
	repairnum = Integer.parseInt (infile.readLine ());
	haveread = Integer.parseInt (infile.readLine ());
	messagenum = repairnum - haveread;
	infile.close ();
	return num;
    }


    //This method will read broken detail and repair detail from broken file
    public void readBroken (int set, String file) throws IOException
    {
	things = new String [set];
	broken = new String [set];
	information = new String [set];
	repair = new String [set];
	repairinfo = new String [set];
	cost = new double [set];
	String inputFileLoc = file;
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	infile.readLine ();
	infile.readLine ();
	infile.readLine ();
	for (int i = 0 ; i < num ; i++)
	{
	    infile.readLine ();
	    things [i] = infile.readLine ();
	    broken [i] = infile.readLine ();
	    information [i] = infile.readLine ();
	    repair [i] = infile.readLine ();
	    repairinfo [i] = infile.readLine ();
	    cost [i] = Double.parseDouble (infile.readLine ());
	}
	infile.close ();
    }


    //This method will write the broken and repair detail back to broken method
    public void writeBroken (int set, String file) throws IOException
    {
	String outputFileLoc = file;
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (set);
	output.println (repairnum);
	output.println (haveread);
	for (int i = 0 ; i < set ; i++)
	{
	    output.println ("");
	    output.println (things [i]);
	    output.println (broken [i]);
	    output.println (information [i]);
	    output.println (repair [i]);
	    output.println (repairinfo [i]);
	    output.println (cost [i]);
	}
	output.close ();
    }


    //This method will return new message to student or teacher
    public int getMessagenum ()
    {
	return messagenum;
    }


    //This method will show what has been repaired resently
    public void showRepaired ()
    {
	for (int i = haveread ; i < repairnum ; i++)
	{
	    System.out.print ("\n");
	    System.out.println (things [i]);
	    System.out.println (broken [i]);
	    System.out.println (information [i]);
	    System.out.println (repair [i]);
	    System.out.println (repairinfo [i]);
	    System.out.println (cost [i]);
	}
	haveread = repairnum;
    }
}
