//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Project

import hsa.*;
import java.io.*;
// The "principal" class.
public class principal
{
    private int main, option;
    private String temp;
    private String password;

    public principal (String ppw)
    {
	password = ppw;
    }


    public void MainMenu () throws IOException
    {
	while (true)
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tPrincipal Main Menu\t###");
	    System.out.println ("### \t1)See suggestion\t\t###");
	    System.out.println ("### \t2)Repairing expense\t\t###");
	    System.out.println ("### \t3)Notice\t\t\t###");
	    System.out.println ("### \t4)Change password\t\t###");
	    System.out.println ("### \t5)Sign out\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    main = Stdin.readInt ();
	    if (main == 1)
		suggestion ();
	    else if (main == 2)
		broken ();
	    else if (main == 3)
		notice ();
	    else if (main == 4)
		ChangePassword ();
	    else if (main == 5)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public void suggestion () throws IOException
    {
	int line;
	while (true)
	{
	    System.out.print ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tCheck suggestion Menu\t###");
	    System.out.println ("### \t1)Student's suggestion\t\t###");
	    System.out.println ("### \t2)Teacher's suggestion\t\t###");
	    System.out.println ("### \t3)Back to main menu\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    option = Stdin.readInt ();
	    if (option == 1)
	    {
		suggestion principalanswer = new suggestion ();
		line = principalanswer.readNum ("studentsuggestion");
		principalanswer.readSuggestion (line, "studentsuggestion");
		principalanswer.getAnswer ();
		principalanswer.writeSuggestion (line, "studentsuggestion");
	    }
	    else if (option == 2)
	    {
		suggestion principalanswer = new suggestion ();
		line = principalanswer.readNum ("teachersuggestion");
		principalanswer.readSuggestion (line, "teachersuggestion");
		principalanswer.getAnswer ();
		principalanswer.writeSuggestion (line, "teachersuggestion");
	    }
	    else if (option == 3)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public void broken () throws IOException
    {

	int line;
	double student, teacher;
	broken PrincipalBrokenCheck = new broken ();

	while (true)
	{
	    System.out.print ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tRepairing Expense Menu\t###");
	    System.out.println ("### \t1)Student's broken\t\t###");
	    System.out.println ("### \t2)Teacher's broken\t\t###");
	    System.out.println ("### \t3)Total Repairing Expense\t###");
	    System.out.println ("### \t4)Back to main menu\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    option = Stdin.readInt ();
	    if (option == 1)
	    {
		System.out.println ("\nNow the systen will show students' broken and repair.");
		line = PrincipalBrokenCheck.readNum ("studentbroken");
		PrincipalBrokenCheck.readBroken (line, "studentbroken");
		student = PrincipalBrokenCheck.showBroken ();
		PrincipalBrokenCheck.writeBroken (line, "studentbroken");
		System.out.println ("The repairing expense on student is $" + student + ".");
	    }
	    else if (option == 2)
	    {
		System.out.println ("\nNow the systen will show teachers' broken and repair.");
		line = PrincipalBrokenCheck.readNum ("teacherbroken");
		PrincipalBrokenCheck.readBroken (line, "teacherbroken");
		teacher = PrincipalBrokenCheck.showBroken ();
		PrincipalBrokenCheck.writeBroken (line, "teacherbroken");
		System.out.println ("The repairing expense on teacher is $" + teacher + ".");
	    }
	    else if (option == 3)
	    {
		line = PrincipalBrokenCheck.readNum ("studentbroken");
		PrincipalBrokenCheck.readBroken (line, "studentbroken");
		student = PrincipalBrokenCheck.getMoney ();
		PrincipalBrokenCheck.writeBroken (line, "studentbroken");
		line = PrincipalBrokenCheck.readNum ("teacherbroken");
		PrincipalBrokenCheck.readBroken (line, "teacherbroken");
		teacher = PrincipalBrokenCheck.getMoney ();
		PrincipalBrokenCheck.writeBroken (line, "teacherbroken");
		System.out.println ("Our school repairing expense until now is $" + (student + teacher) + ".");
	    }
	    else if (option == 4)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public void notice () throws IOException
    {
	int option;
	int to = 0;
	String notice;
	while (true)
	{
	    System.out.print ("\n");
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tNotice\t\t\t###");
	    System.out.println ("### \t1)To students\t\t\t###");
	    System.out.println ("### \t2)To teachers\t\t\t###");
	    System.out.println ("### \t3)To repairmen\t\t\t###");
	    System.out.println ("### \t4)To students and teachers\t###");
	    System.out.println ("### \t5)To students and repairmen\t###");
	    System.out.println ("### \t6)To teachers and repairmen\t###");
	    System.out.println ("### \t7)To everyone\t\t\t###");
	    System.out.println ("### \t8)Back to main menu\t\t###");
	    System.out.println ("###########################################");
	    option = Stdin.readInt ();
	    if (option == 1)
	    {
		to = 1;
		break;
	    }
	    else if (option == 2)
	    {
		to = 2;
		break;
	    }
	    else if (option == 3)
	    {
		to = 4;
		break;
	    }
	    else if (option == 4)
	    {
		to = 3;
		break;
	    }
	    else if (option == 5)
	    {
		to = 5;
		break;
	    }
	    else if (option == 6)
	    {
		to = 6;
		break;
	    }
	    else if (option == 7)
	    {
		to = 7;
		break;
	    }
	    else if (option == 8)
		break;
	    else
		System.out.println ("Wrong number has been enter.");
	}
	if (option != 8)
	{
	    System.out.println ("What do you want to notice?");
	    notice = Stdin.readLine ();
	    String noticeFileLoc = "notice";
	    PrintWriter output = new PrintWriter (new FileWriter (noticeFileLoc, true), false);
	    output.println (to);
	    output.println (notice);
	    output.close ();
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
} // principal class


