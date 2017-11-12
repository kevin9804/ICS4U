//Leyao Li
//2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Project

import hsa.*;
import java.io.*;
import javax.swing.JOptionPane;
// The "Project" class.
public class Project
{
    //Storage the user name and password
    private static String suser; //Student's user name
    private static String spw; //Student's password
    private static String tuser; //Teacher's user name
    private static String tpw; //Teacher's password
    private static String ruser; //Repairman's user name
    private static String rpw; //Repairman's password
    private static String puser; //Principal's user name
    private static String ppw; //Principal's password
    //LogIn method
    private static int login; //Choice the option of user
    private static String user, password; //Input user name and password

    //This is the main method of the program
    public static void main (String[] args) throws IOException
    {
	System.out.println ("Welcome to use the school service center"); //Shows welcome information
	getUser (); //Get username method
	do //Loop the program until enter "5" to exit
	{
	    LogIn (); //Show log in method
	}
	while (login != 5);
	setUser (); //Write username and password (maybe change) back to file
    }


    //This method is using for get user name and password from a TXT
    public static void getUser () throws IOException
    {
	String inputFileLoc = "user";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	suser = infile.readLine ();
	spw = infile.readLine ();
	tuser = infile.readLine ();
	tpw = infile.readLine ();
	ruser = infile.readLine ();
	rpw = infile.readLine ();
	puser = infile.readLine ();
	ppw = infile.readLine ();
	infile.close ();
    }


    //This method is using for user to log in the program
    public static void LogIn () throws IOException
    {
	boolean test;
	while (true) //Show the log in choice menu unit exit the program
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \t\tLog In\t\t\t###");
	    System.out.println ("### \t1)Log in as a student\t\t###");
	    System.out.println ("### \t2)Log in as a teacher\t\t###");
	    System.out.println ("### \t3)Log in as a repairman\t\t###");
	    System.out.println ("### \t4)Log in as a principal\t\t###");
	    System.out.println ("### \t5)Exit\t\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.println ("Enter the number to choice your option");
	    login = Stdin.readInt (); //Enter the choice of log in

	    if (login == 1) //If log in as a student
	    {
		do //Enter the user name and password until it is correct
		{
		    test = false;
		    System.out.print ("User name:"); //Enter user name
		    user = Stdin.readLine ();
		    System.out.print ("Password:"); //Enter password
		    password = Stdin.readLine ();
		    if (user.compareTo (suser) != 0 || password.compareTo (spw) != 0) //Compare user name and password with the file
		    {
			if (user.compareTo ("0") == 0 && password.compareTo ("0") == 0)
			    /*If both of user name and password is "0",
			      the log in method will return back to choice menu*/
			    {
				System.out.print ("\n");
				return; //Return to main method and loop to log in method again
			    }
			test = true;
			/*If the user name or password is incorrect,
			  the boolean will change to true and this part will loop*/
		    }
		    if (test) //Show the tips of wrong user name of password
			System.out.println ("\nYour user name or password was wrong"
				+ "\nIf you want to change your choice please enter 0 in user name and password");
		}
		while (test); //Do the loop until the user name of password is right
		StudentMainMenu (); //Successful log in, call StudentMainMenu method
	    }
	    else if (login == 2) //If log in as a teacher
	    {
		do //Enter the user name and password until it is correct
		{
		    test = false;
		    System.out.print ("User name:"); //Enter user name
		    user = Stdin.readLine ();
		    System.out.print ("Password:"); //Enter password
		    password = Stdin.readLine ();
		    if (user.compareTo (tuser) != 0 || password.compareTo (tpw) != 0) //Compare user name and password with the file
		    {
			if (user.compareTo ("0") == 0 && password.compareTo ("0") == 0)
			    /*If both of user name and password is "0",
			      the log in method will return back to choice menu*/
			    {
				System.out.print ("\n");
				return;
			    }
			test = true;
			/*If the user name or password is incorrect,
			  the boolean will change to true and this part will loop*/
		    }
		    if (test) //Show the tips of wrong user name of password
			System.out.println ("\nYour user name or password was wrong"
				+ "\nIf you want to change your choice please enter 0 in user name and password");
		}
		while (test); //Do the loop until the user name of password is right
		TeacherMainMenu (); //Successful log in, call TeacherMainMenu method
	    }
	    else if (login == 3) //If log in as a repairman
	    {
		do //Enter the user name and password until it is correct
		{
		    test = false;
		    System.out.print ("User name:"); //Enter user name
		    user = Stdin.readLine ();
		    System.out.print ("Password:"); //Enter password
		    password = Stdin.readLine ();
		    if (user.compareTo (ruser) != 0 || password.compareTo (rpw) != 0)
			/*If both of user name and password is "0",
			  the log in method will return back to choice menu*/
			{
			    if (user.compareTo ("0") == 0 && password.compareTo ("0") == 0)
			    {
				System.out.print ("\n");
				return;
			    }
			    test = true;
			}
		    if (test) //Show the tips of wrong user name of password
			System.out.println ("\nYour user name or password was wrong"
				+ "\nIf you want to change your choice please enter 0 in user name and password");
		}
		while (test); //Do the loop until the user name of password is right
		RepairmanMainMenu (); //Successful log in, call RepairmanMainMenu method
	    }
	    else if (login == 4) //If log in as a principal
	    {
		do //Enter the user name and password until it is correct
		{
		    test = false;
		    System.out.print ("User name:"); //Enter user name
		    user = Stdin.readLine ();
		    System.out.print ("Password:"); //Enter password
		    password = Stdin.readLine ();
		    if (user.compareTo (puser) != 0 || password.compareTo (ppw) != 0)
			/*If both of user name and password is "0",
			  the log in method will return back to choice menu*/
			{
			    if (user.compareTo ("0") == 0 && password.compareTo ("0") == 0)
			    {
				System.out.print ("\n");
				return;
			    }
			    test = true;
			}
		    if (test) //Show the tips of wrong user name of password
			System.out.println ("\nYour user name or password was wrong"
				+ "\nIf you want to change your choice please enter 0 in user name and password");
		}
		while (test); //Do the loop until the user name of password is right
		PrincipalMainMenu (); //Successful log in, call PrincipalMainMenu method
	    }
	    else if (login == 5) //Exit the program
	    {
		System.out.println ("Thank you for using the school serving program"); //Show exit window
		System.out.println ("Version 3.3.7"); //Show program version
		break;
	    }
	    else //Wrong number entered
	    {
		System.out.println ("\nThe number you entered is wrong. Please try again"); //Show tips and choice again.
	    }
	}
    }


    //This method will call a student class
    public static void StudentMainMenu () throws IOException
    {
	System.out.print ("\n");
	newNotice (1, 3, 5, 7);
	//Using newNotice check is there any new notice to this user or not
	student user = new student (spw);
	user.MainMenu ();
	spw = user.getPassword ();
    }


    //This method will call a teacher class
    public static void TeacherMainMenu () throws IOException
    {
	System.out.print ("\n");
	newNotice (2, 3, 6, 7);
	//Using newNotice check is there any new notice to this user or not
	teacher user = new teacher (tpw);
	user.MainMenu ();
	tpw = user.getPassword ();
    }


    //This method will call a repairman class
    public static void RepairmanMainMenu () throws IOException
    {
	System.out.print ("\n");
	newNotice (4, 5, 6, 7);
	//Using newNotice check is there any new notice to this user or not
	repairman user = new repairman (rpw);
	user.MainMenu ();
	rpw = user.getPassword ();
    }


    //This method will call a principal class
    public static void PrincipalMainMenu () throws IOException
    {
	System.out.print ("\n");
	principal user = new principal (ppw);
	user.MainMenu ();
	ppw = user.getPassword ();
    }


    //This method will get the latest notice from principal submit
    public static void newNotice (int a, int b, int c, int d) throws IOException
    {
	String noticeFileLoc = "notice";//name of notice file
	String number, notice;
	int num;
	String str;
	int option;
	BufferedReader infile = new BufferedReader (new FileReader (noticeFileLoc));//read notice file
	PrintWriter copy = new PrintWriter (new FileWriter ("temp"));//make a copy of notice to temp file
	while (true)//Copy the notice file to tmep file
	{
	    str = infile.readLine ();
	    if (str == null)
	    {
		infile.close ();
		copy.close ();
		break;
	    }
	    else
		copy.println (str);
	}
	BufferedReader temp = new BufferedReader (new FileReader ("temp"));//read temp file
	PrintWriter output = new PrintWriter (new FileWriter (noticeFileLoc));//write change back to notice file
	while (true)
	{
	    number = temp.readLine ();//read the number of who will get the notice
	    notice = temp.readLine ();//read the detail of notice
	    if (number == null)//There is no more notices
	    {
		break;
	    }
	    else
	    {
		num = Integer.parseInt (number);//Change the number from String to int
		if (num == a || num == b || num == c || num == d)//Search the user will get the notice or not
		{
		    while (true)
		    {
			option = Integer.parseInt (JOptionPane.showInputDialog (notice +
				    "\n1)Notice me next time" +
				    "\n2)Don't notice me next time"));//Show the notice and get the choice of user
			if (option == 1)//Show notice next time
			{
			    output.println (num);
			    output.println (notice);
			    //Write the notice back to notice file
			    break;
			}
			else if (option == 2)
			{
			    num = num - a;
			    output.println (num);
			    output.println (notice);
			    //Change the number and this user will not get this notice when he/she log in next time
			    break;
			}
		    }
		}
		else
		{
		    output.println (num);
		    output.println (notice);
		    //This user will not get this notice. Write this notice back to notice file
		}
	    }
	}
	output.close ();//Close notice file
	temp.close ();//Close temp file
	File delete = new File ("temp");
	delete.delete ();//Delete temp file
    }


    //This method will save the password back to user after change
    public static void setUser ()
	throws IOException
    {
	String outputFileLoc = "user";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (suser);
	output.println (spw);
	output.println (tuser);
	output.println (tpw);
	output.println (ruser);
	output.println (rpw);
	output.println (puser);
	output.println (ppw);
	output.close ();
    }
}


