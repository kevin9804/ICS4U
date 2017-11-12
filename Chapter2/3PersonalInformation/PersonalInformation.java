//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #3

import hsa.*;
// The "PersonalInformation" class.
public class PersonalInformation
{
    public static void main (String[] args)
    {
	// Declare Variables
	String name;
	String address;
	String telephonenumber;
	String collegemajor;
	
	//Input valus
	name = "Kevin-Lee";
	address = "Room 410, 150 King Street East, Hamilton, Ontario  L8N 1B2";
	telephonenumber = "9059238430";
	collegemajor = "Engineering";
	
	//Output
	Stdout.println("My name is " + name);
	Stdout.println("My address is " + address);
	Stdout.println("My telephone number is " + telephonenumber);
	Stdout.println("My college major is " + collegemajor);
	
    } // main method
} // PersonalInformation class
