//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Project

import hsa.*;
import java.io.*;
// The "repairman" class.
public class repairman
{
    private int main;
    private String temp;
    private String password;
    private int option;

    public repairman (String rpw)
    {
	password = rpw;
    }


    public void MainMenu () throws IOException
    {
	while (true)
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tRepairman Main Menu\t###");
	    System.out.println ("### \t1)Check broken\t\t\t###");
	    System.out.println ("### \t2)Change password\t\t###");
	    System.out.println ("### \t3)Sign out\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    main = Stdin.readInt ();
	    if (main == 1)
		broken ();
	    else if (main == 2)
		ChangePassword ();
	    else if (main == 3)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public void broken () throws IOException
    {
	int line;
	while (true)
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tCheck broken Menu\t###");
	    System.out.println ("### \t1)Student's report\t\t###");
	    System.out.println ("### \t2)Teacher's report\t\t###");
	    System.out.println ("### \t3)Back to main menu\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    option = Stdin.readInt ();
	    if (option == 1)
	    {
		broken repairbroken = new broken ();
		line = repairbroken.readNum ("studentbroken");
		repairbroken.readBroken (line, "studentbroken");
		repairbroken.getRepair ();
		repairbroken.writeBroken (line, "studentbroken");
	    }
	    else if (option == 2)
	    {
		broken repairbroken = new broken ();
		line = repairbroken.readNum ("teacherbroken");
		repairbroken.readBroken (line, "teacherbroken");
		repairbroken.getRepair ();
		repairbroken.writeBroken (line, "teacherbroken");
	    }
	    else if (option == 3)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public void ChangePassword ()
    {
	System.out.println ("ChangePassword");
	while (true)
	{
	    System.out.print ("Your new password:")
		;
	    temp = Stdin.readLine ();
	    System.out.print ("Confirm your new password:");
	    if (temp.compareTo (Stdin.readLine ()) == 0)
	    {
		password = temp;
		break;
	    }
	    else
		System.out.println ("Password is not the same as two times, please enter again.");
	}
	System.out.println ("\nYour new password is " + password + "\nplease remember it!");
    }


    public String getPassword ()
    {
	return password;
    }
} // repairman class
