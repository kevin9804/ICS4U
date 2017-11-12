//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Project

import hsa.*;
import java.io.*;
// The "teacher" class.
public class teacher
{
    private int main;
    private int option;
    private String temp;
    private String password;

    public teacher (String tpw)
    {
	password = tpw;
    }


    public void MainMenu () throws IOException
    {
	while (true)
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tTeacher Main Menu\t###");
	    System.out.println ("### \t1)New Message\t\t\t###");
	    System.out.println ("### \t2)Report broken\t\t\t###");
	    System.out.println ("### \t3)Answer student's question\t###");
	    System.out.println ("### \t4)Suggestion to school\t\t###");
	    System.out.println ("### \t5)Change password\t\t###");
	    System.out.println ("### \t6)Sign out\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    main = Stdin.readInt ();
	    if (main == 1)
		message ();
	    else if (main == 2)
		reportmenu ();
	    else if (main == 3)
		question ();
	    else if (main == 4)
		suggestion ();
	    else if (main == 5)
		ChangePassword ();
	    else if (main == 6)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public void message () throws IOException
    {
	int msg1, msg2, msg3, temp1, temp2, temp3;

	broken teacherbroken = new broken ();
	temp1 = teacherbroken.readNum ("teacherbroken");
	teacherbroken.readBroken (temp1, "teacherbroken");
	msg1 = teacherbroken.getMessagenum ();

	question teacherquestion = new question ();
	temp2 = teacherquestion.readNum ();
	msg2 = teacherquestion.getNewquestionNum ();

	suggestion teachersuggestion = new suggestion ();
	temp3 = teachersuggestion.readNum ("teachersuggestion");
	teachersuggestion.readSuggestion (temp1, "teachersuggestion");
	msg3 = teachersuggestion.getMessagenum ();


	if (msg1 == 0 && msg2 == 0 && msg3 == 0)
	{
	    System.out.println ("You have no more new messages.\n");
	}
	else if (msg1 != 0)
	{
	    System.out.println ("You have " + msg1 + " brokens have been repaired.");
	    teacherbroken.showRepaired ();
	    teacherbroken.writeBroken (temp1, "teacherbroken");
	}
	else if (msg2 != 0)
	{
	    System.out.println ("You have " + msg2 + " new questions.");
	    msg2 = 0;
	}
	else if (msg3 != 0)
	{
	    System.out.println ("Youhave" + msg3 + " suggestions have been answered.");
	    teachersuggestion.showAnswer ();
	    teachersuggestion.writeSuggestion (temp3, "teachersuggestion");
	}
    }


    public void reportmenu () throws IOException
    {
	while (true)
	{
	    System.out.print ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tReport Broken Menu\t###");
	    System.out.println ("### \tWhat is broken in your room?\t###");
	    System.out.println ("### \t1)Computer\t\t\t###");
	    System.out.println ("### \t2)Projector\t\t\t###");
	    System.out.println ("### \t3)Lamp\t\t\t\t###");
	    System.out.println ("### \t4)Fan\t\t\t\t###");
	    System.out.println ("### \t5)Air conditioner\t\t###");
	    System.out.println ("### \t6)Printer\t\t\t###");
	    System.out.println ("### \t7)Table\t\t\t\t###");
	    System.out.println ("### \t8)Chair\t\t\t\t###");
	    System.out.println ("### \t9)Other\t\t\t\t###");
	    System.out.println ("### \t0)Back to main menu\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    option = Stdin.readInt ();
	    if (option == 1)
		broken ("computer");
	    else if (option == 2)
		broken ("projector");
	    else if (option == 3)
		broken ("lamp");
	    else if (option == 4)
		broken ("fan");
	    else if (option == 5)
		broken ("air conditioner");
	    else if (option == 6)
		broken ("printer");
	    else if (option == 7)
		broken ("table");
	    else if (option == 8)
		broken ("chair");
	    else if (option == 9)
	    {
		System.out.print ("Please enter what is broken:");
		broken (Stdin.readLine ());
	    }
	    else if (option == 0)
	    {
		System.out.print ("\n");
		break;
	    }
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	    if (option == 0)
		break;
	}
    }


    public void question () throws IOException
    {
	int line;
	question teacheranswer = new question ();
	line = teacheranswer.readNum ();
	teacheranswer.readQuestion (line);
	teacheranswer.getAnswer ();
	teacheranswer.writeQuestion (line);
    }


    public void suggestion () throws IOException
    {
	int line;
	String suggestion = "", info = "";
	suggestion teachersuggestion = new suggestion ();
	line = teachersuggestion.readNum ("teachersuggestion") + 1;
	teachersuggestion.readSuggestion (line, "teachersuggestion");
	System.out.println ("What's your suggestion?");
	suggestion = Stdin.readLine ();
	info = thirdmenu ();
	teachersuggestion.getSuggestion (suggestion, info);
	teachersuggestion.writeSuggestion (line, "teachersuggestion");
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


    public void broken (String thing) throws IOException
    {
	int line;
	String wrong = "", info = "";
	System.out.println ("Your broken thing is " + thing);
	broken teacherbroken = new broken (thing);
	line = teacherbroken.readNum ("teacherbroken") + 1;
	teacherbroken.readBroken (line, "teacherbroken");
	while (true)
	{
	    System.out.print ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tWhat's wrong?\t\t###");
	    System.out.println ("### \t1)Broken\t\t\t###");
	    System.out.println ("### \t2)Too less\t\t\t###");
	    System.out.println ("### \t3)Too more\t\t\t###");
	    System.out.println ("### \t0)Back to report menu\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    option = Stdin.readInt ();
	    if (option == 1)
	    {
		System.out.println ("What's wrong with the " + thing + " in your room?");
		wrong = Stdin.readLine ();
		info = thirdmenu ();
		teacherbroken.getBroken (wrong, info);
		teacherbroken.writeBroken (line, "teacherbroken");
	    }
	    else if (option == 2)
	    {
		System.out.println ("How many " + thing + " do your room need?");
		wrong = "Our room need " + Stdin.readLine () + " more " + thing + "s.";
		info = thirdmenu ();
		teacherbroken.getBroken (wrong, info);
		teacherbroken.writeBroken (line, "teacherbroken");
	    }
	    else if (option == 3)
	    {
		System.out.println ("How many " + thing + " do you want staff to take away?");
		wrong = "We want staff to take away " + Stdin.readLine () + " " + thing + "s.";
		info = thirdmenu ();
		teacherbroken.getBroken (wrong, info);
		teacherbroken.writeBroken (line, "teacherbroken");
	    }
	    else if (option == 0)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	    if (option == 0)
		break;
	}
	System.out.print ("\n");
    }



    public String thirdmenu ()
    {
	String room, ID, name, email, date;
	String total;
	System.out.println ("Please enter some information about you.");
	System.out.print ("Room: ");
	room = "Room: " + Stdin.readLine ();
	System.out.print ("ID: ");
	ID = Stdin.readLine ();
	System.out.print ("Name: ");
	name = Stdin.readLine ();
	System.out.print ("E-mail: ");
	email = Stdin.readLine ();
	System.out.print ("Date: ");
	date = Stdin.readLine ();
	option = 0;
	total = ID + " " + name + " " + room + " " + email + " " + date;
	return total;
    }



    public String getPassword ()
    {
	return password;
    }
} // teacher class


