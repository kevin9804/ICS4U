//Yue Huang
//ICS4U Final Project

// The "Account" class.
import hsa.*;
import java.io.*;
public abstract class Account
{
    private int id;
    private String name;
    public Account (String name, int id)
    {
	this.name = name;
	this.id = id;
    }


    public String toString ()
    {
	return ("Account name: " + name + "\nID: " + id);
    }


    public String getName ()
    {
	return name;
    }


    public abstract void mainScreen () throws IOException;
} // Account class
