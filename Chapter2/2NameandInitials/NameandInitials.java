//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Program Challenges #2

import hsa.*;
// The "NameandInitials" class.
public class NameandInitials
{
    public static void main (String[] args)
    {
	//Declare Variables
	String firstname;
	String lastname;
	char first;
	char middle;
	char last;

	//Input
	firstname = "Leyao";
	lastname = "Li";
	first = 'L';
	last = 'L';

	//Output
	Stdout.println ("My first name is " + firstname + ", my last name is " + lastname);
	Stdout.println ("The short of my name is " + first + " " + last);
    } // main method
} // NameandInitials class
