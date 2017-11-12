//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Project

import hsa.*;
import java.io.*;
// The "student" class.
public class student
{
    private int main;
    private int option;
    private String temp;
    private String password;

    public student (String spw)
    {
	password = spw;
    }


    //This is the main menu of student user
    public void MainMenu () throws IOException
    {
	while (true)
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tStudent Main Menu\t###");
	    System.out.println ("### \t1)New Message\t\t\t###");
	    System.out.println ("### \t2)Report broken\t\t\t###");
	    System.out.println ("### \t3)Study question\t\t###");
	    System.out.println ("### \t4)Suggestion to school\t\t###");
	    System.out.println ("### \t5)Change password\t\t###");
	    System.out.println ("### \t6)Sign out\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    main = Stdin.readInt (); //Get the choice from student and call the method
	    if (main == 1)
		message ();
	    else if (main == 2)
		reportmenu ();
	    else if (main == 3)
		questionmenu ();
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


    //Get now message of broken repair, question answer and suggestion answer
    public void message () throws IOException
    {
	int msg1, msg2, msg3, temp1, temp2, temp3;

	broken studentbroken = new broken ();
	temp1 = studentbroken.readNum ("studentbroken");
	studentbroken.readBroken (temp1, "studentbroken");
	msg1 = studentbroken.getMessagenum ();

	question studentquestion = new question ();
	temp2 = studentquestion.readNum ();
	studentquestion.readQuestion (temp2);
	msg2 = studentquestion.getMessagenum ();

	suggestion studentsuggestion = new suggestion ();
	temp3 = studentsuggestion.readNum ("studentsuggestion");
	studentsuggestion.readSuggestion (temp3, "studentsuggestion");
	msg3 = studentsuggestion.getMessagenum ();

	if (msg1 == 0 && msg2 == 0 && msg3 == 0)
	{
	    System.out.println ("You have no more new messages.\n");
	}
	else if (msg1 != 0)
	{
	    System.out.println ("You have " + msg1 + " brokens have been repaired.");
	    studentbroken.showRepaired ();
	    studentbroken.writeBroken (temp1, "studentbroken");
	}
	else if (msg2 != 0)
	{
	    System.out.println ("You have " + msg2 + " questions have been answered.");
	    studentquestion.showAnswer ();
	    studentquestion.writeQuestion (temp2);
	}
	else if (msg3 != 0)
	{
	    System.out.println ("You have " + msg3 + " suggestions have been answered.");
	    studentsuggestion.showAnswer ();
	    studentsuggestion.writeSuggestion (temp3, "studentsuggestion");
	}
    }


    //Report broken main menu
    //This method will get what kind of broken in student's room and call broken method
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


    //Study questions main menu
    //This method will get which subject of the student's question belong to and call question method
    public void questionmenu () throws IOException
    {
	while (true)
	{
	    System.out.print ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tStudy questions Menu\t###");
	    System.out.println ("### \t1)English\t\t\t###");
	    System.out.println ("### \t2)Math\t\t\t\t###");
	    System.out.println ("### \t3)Physics\t\t\t###");
	    System.out.println ("### \t4)Chemistry\t\t\t###");
	    System.out.println ("### \t5)Biological\t\t\t###");
	    System.out.println ("### \t6)Computer Science\t\t###");
	    System.out.println ("### \t7)Other\t\t\t\t###");
	    System.out.println ("### \t0)Back to main menu\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Chose the number of subject of your question:");
	    option = Stdin.readInt ();
	    if (option == 1)
		question ("English");
	    else if (option == 2)
		question ("math");
	    else if (option == 3)
		question ("physics");
	    else if (option == 4)
		question ("chemistry");
	    else if (option == 5)
		question ("biological");
	    else if (option == 6)
		question ("computer science");
	    else if (option == 7)
	    {
		System.out.print ("Please enter which subject you have question:");
		question (Stdin.readLine ());
	    }
	    else if (option == 0)
	    {
		System.out.print ("\n");
		break;
	    }
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	    if (option == 0)
	    {
		System.out.print ("\n");
		break;
	    }
	}
    }


    //This method will get the suggestion from student and set to principal
    public void suggestion () throws IOException
    {
	int line;
	String suggestion = "", info = "";
	suggestion studentsuggestion = new suggestion ();
	line = studentsuggestion.readNum ("studentsuggestion") + 1;
	studentsuggestion.readSuggestion (line, "studentsuggestion");
	System.out.println ("What's your suggestion?");
	suggestion = Stdin.readLine ();
	info = thirdmenu ();
	studentsuggestion.getSuggestion (suggestion, info);
	studentsuggestion.writeSuggestion (line, "studentsuggestion");
    }


    //This method is using for user to change his/her password
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


    //This method will set broken kind, broken detail, reporter information to broken method
    public void broken (String thing) throws IOException
    {
	int line;
	String wrong = "", info = "";
	System.out.println ("Your broken thing is " + thing);
	broken studentbroken = new broken (thing);
	line = studentbroken.readNum ("studentbroken") + 1;
	studentbroken.readBroken (line, "studentbroken");
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
		studentbroken.getBroken (wrong, info);
		studentbroken.writeBroken (line, "studentbroken");
	    }
	    else if (option == 2)
	    {
		System.out.println ("How many " + thing + " do your room need?");
		wrong = "Our room need " + Stdin.readLine () + " more " + thing + "s.";
		info = thirdmenu ();
		studentbroken.getBroken (wrong, info);
		studentbroken.writeBroken (line, "studentbroken");
	    }
	    else if (option == 3)
	    {
		System.out.println ("How many " + thing + " do you want staff to take away?");
		wrong = "We want staff to take away " + Stdin.readLine () + " " + thing + "s.";
		info = thirdmenu ();
		studentbroken.getBroken (wrong, info);
		studentbroken.writeBroken (line, "studentbroken");
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


    //This method will set question's subject, question detail, student's information to question method
    public void question (String subject) throws IOException
    {
	int line;
	String question = "", info = "";
	System.out.println ("Your question is about " + subject);
	question studentquestion = new question (subject);
	line = studentquestion.readNum () + 1;
	studentquestion.readQuestion (line);
	System.out.println ("What's your question?");
	question = Stdin.readLine ();
	info = thirdmenu ();
	studentquestion.getQuestion (question, info);
	studentquestion.writeQuestion (line);
	option = 0;
    }


    //This method is using to get student's information and return to broken method, question method and suggestion method
    public String thirdmenu ()
    {
	String room, ID, name, email, date;
	String total;
	System.out.println ("Please enter some information about you.");
	System.out.print ("Room: ");
	room = "Room: " + Stdin.readLine ();
	System.out.print ("ID:");
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


    //This method will return the password back to main class
    public String getPassword ()
    {
	return password;
    }
} // student class


