//Yue Huang
//ICS4U Final Project
//Version 1 Due Nov 10th, 2017

/*
 All the method in the Project Class have been created and finish.
 Create/List/Delete accounts have been tested.
 Login account have been tested.
 Exit the program have been tested.
 
 Plan of project for next step:
 Create rewards points system.
 */

// The "Project" class.
import hsa.*;
import java.io.*;

public class Project
{
    private static int selection;
    private static int number;
    private static String[] user;
    private static String[] password;
    private static String[] accounts_type;
    private static String input_user;
    private static String input_password;
    private static Account[] accounts = new Account [1000];

    public static void main (String[] args) throws IOException
    {
	readUser ();
	readPassword ();
	readAccounts ();
	menu ();
	saveUser ();
	savePassword ();
	saveAccounts ();
	System.out.println ("\nThank you for using the household chore control system.");
	System.out.println ("Version 2.4.0");
    } // main method


    public static void menu () throws IOException
    {
	while (true)
	{
	    System.out.println ("###########################################");
	    System.out.println ("### \tICS4U Final Project Main Menu\t###");
	    System.out.println ("### \t1)Log in\t\t\t###");
	    System.out.println ("### \t2)Add new account\t\t###");
	    System.out.println ("### \t3)List Accounts\t\t\t###");
	    System.out.println ("### \t4)Delete Account\t\t###");
	    System.out.println ("### \t5)Exit\t\t\t\t###");
	    System.out.println ("###########################################");
	    System.out.print ("Enter the number to choice your option: ");
	    selection = Stdin.readInt ();
	    if (selection == 1)
		login ();
	    else if (selection == 2)
		addNewAccount ();
	    else if (selection == 3)
		listAccount ();
	    else if (selection == 4)
		deleteAccount ();
	    else if (selection == 5)
		break;
	    else
		System.out.println ("\nThe number you entered is wrong. Please try again");
	}
    }


    public static void login () throws IOException
    {
	System.out.println ("\n");
	System.out.print ("Please enter your user name:");
	input_user = Stdin.readLine ();
	System.out.print ("Please enter your password:");
	input_password = Stdin.readLine ();
	System.out.println ("\n");

	for (int i = 0 ; i < number ; i++)
	{
	    if (input_user.compareTo (user [i]) == 0)
	    {
		if (input_password.compareTo (password [i]) == 0)
		{
		    System.out.println ("Successful to login");
		    System.out.println (accounts [i]);
		    accounts [i].mainScreen ();
		    System.out.println ("\n");
		    return;
		}
		else
		{
		    System.out.println ("Wrong password. Fail to login");
		    return;
		}
	    }
	}
	System.out.println ("Cannot find the user in the system.");
    }


    public static void addNewAccount ()
    {
	String[] new_user = new String [number + 1];
	String[] new_password = new String [number + 1];
	String[] new_accounts_type = new String [number + 1];
	for (int i = 0 ; i < number ; i++)
	{
	    new_user [i] = user [i];
	    new_password [i] = password [i];
	    new_accounts_type [i] = accounts_type [i];
	}
	System.out.println ("\n");
	System.out.print ("Please enter new user name:");
	input_user = Stdin.readLine ();
	new_user [number] = input_user;
	System.out.print ("Please enter new password:");
	input_password = Stdin.readLine ();
	new_password [number] = input_password;
	System.out.print ("1)Parents\n2)Children\nPlease select the type of account you want to create:");
	selection = Stdin.readInt ();
	while (selection != 1 && selection != 2)
	{
	    System.out.print ("Wrong selection of the type of account. Try again: ");
	    selection = Stdin.readInt ();
	}
	System.out.println ("\n");
	user = new_user;
	password = new_password;
	if (selection == 1)
	{
	    new_accounts_type [number] = "Parents";
	    accounts [number] = new Parents (input_user, number);
	}
	else if (selection == 2)
	{
	    new_accounts_type [number] = "Children";
	    accounts [number] = new Children (input_user, number);
	}
	accounts_type = new_accounts_type;
	number++;
    }


    public static void listAccount ()
    {
	if (number == 0)
	{
	    System.out.println ("\n");
	    System.out.println ("There is no user now, please create new user.");
	    System.out.println ("\n");
	}
	else
	{
	    System.out.println ("\n");
	    for (int i = 0 ; i < number ; i++)
	    {
		System.out.print (i + 1 + ": ");
		System.out.println (user [i] + "\t" + accounts_type [i]);
	    }
	    System.out.println ("\n");
	}
    }


    public static void deleteAccount ()
    {
	listAccount ();
	System.out.print ("Please enter the number before user you want to delete: ");
	selection = Stdin.readInt ();
	if (selection < 1 && selection > number)
	{
	    System.out.println ("Wrong input of selection. Fail to delete.\n");
	    return;
	}
	System.out.print ("Please enter the password of the account you want to delete: ");
	input_password = Stdin.readLine ();
	if (input_password.compareTo (password [selection - 1]) != 0)
	{
	    System.out.println ("Wrong password! You cannot delete this user.");
	    System.out.println ("\n");
	}
	else
	{
	    System.out.println ("Password correct! Deleting the user now...");
	    String[] new_user = new String [number - 1];
	    String[] new_password = new String [number - 1];
	    String[] new_accounts_type = new String [number - 1];
	    Account[] new_accounts = new Account [1000];
	    for (int i = 0 ; i < selection - 1 ; i++)
	    {
		new_user [i] = user [i];
		new_password [i] = password [i];
		new_accounts_type [i] = accounts_type [i];
		new_accounts [i] = accounts [i];
	    }
	    for (int i = selection - 1 ; i < number - 1 ; i++)
	    {
		new_user [i] = user [i + 1];
		new_password [i] = password [i + 1];
		new_accounts_type [i] = accounts_type [i + 1];
		new_accounts [i] = accounts [i + 1];
	    }
	    user = new_user;
	    password = new_password;
	    accounts_type = new_accounts_type;
	    accounts = new_accounts;
	    number--;
	    System.out.println ("User deleted!");
	    System.out.println ("\n");
	}
    }


    public static void readUser () throws IOException
    {
	String inputFileLoc = "user";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	number = Integer.parseInt (infile.readLine ());
	if (number < 1)
	{
	    return;
	}
	else
	{
	    user = new String [number];
	    for (int i = 0 ; i < number ; i++)
	    {
		user [i] = infile.readLine ();
	    }
	    infile.close ();
	}
    }


    public static void readPassword () throws IOException
    {
	String inputFileLoc = "password";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	if (number < 1)
	{
	    return;
	}
	else
	{
	    password = new String [number];
	    for (int i = 0 ; i < number ; i++)
	    {
		password [i] = infile.readLine ();
	    }
	    infile.close ();
	}
    }


    public static void readAccounts () throws IOException
    {
	String inputFileLoc = "accounts";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	if (number < 1)
	{
	    return;
	}
	else
	{
	    accounts_type = new String [number];
	    for (int i = 0 ; i < number ; i++)
	    {
		accounts_type [i] = infile.readLine ();
		if (accounts_type [i].compareTo ("Parents") == 0)
		{
		    accounts [i] = new Parents (user [i], i);
		}
		else if (accounts_type [i].compareTo ("Children") == 0)
		{
		    accounts [i] = new Children (user [i], i);
		}
	    }
	    infile.close ();
	}
    }


    public static void saveUser () throws IOException
    {
	String outputFileLoc = "user";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (number);
	for (int i = 0 ; i < number ; i++)
	{
	    output.println (user [i]);
	}
	output.close ();
    }


    public static void savePassword () throws IOException
    {
	String outputFileLoc = "password";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	for (int i = 0 ; i < number ; i++)
	{
	    output.println (password [i]);
	}
	output.close ();
    }


    public static void saveAccounts () throws IOException
    {
	String outputFileLoc = "Accounts";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	for (int i = 0 ; i < number ; i++)
	{
	    output.println (accounts_type [i]);
	}
	output.close ();
    }
} // Project class


