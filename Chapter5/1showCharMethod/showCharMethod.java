//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #1

import hsa.*;
// The "showCharMethod" class.
public class showCharMethod
{
    public static void main (String[] args)
    {
	//Variables
	String input;
	int num;
	char a;
	Stdout.println("Enter something to input");
	input = Stdin.readLine();
	Stdout.println("Enter a number");
	num = Stdin.readInt();
	a=showChar(input,num);
	Stdout.println(a);
    } // main method
    public static char showChar(String in,int number)
    {
	char b;
	b = in.charAt(number);
	return b;
    }
} // showChar class
