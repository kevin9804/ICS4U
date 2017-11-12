//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 7 Program Challenges #10

import hsa.*;
// The "Lottery" class.
public class Lottery
{
    public static void main (String[] args)
    {

	int[] lotteryNumbers = new int [5]; //lotteryNumber array
	int[] num = new int [5]; //lotteryNumber array from class
	int[] user = new int [5]; //user array
	int match = 0;

	for (int i = 0 ; i < 5 ; i++) //random lottery number
	{
	    lotteryNumbers [i] = (int) (Math.random () * 9);
	}
	lotteryNumbers box = new lotteryNumbers (lotteryNumbers); //set lottery nun to class

	for (int n = 0 ; n < 5 ; n++)
	{
	    System.out.print ("Please enter the " + (n + 1) + " number in your array:");
	    user [n] = Stdin.readInt ();
	}

	num = box.getNum (); //lottery number from class

	for (int i = 0 ; i < 5 ; i++)
	{
	    if (user [i] == num [i])
	    {
		System.out.println ("Elements " + (i + 1) + " is matching digits");
		match++;
	    }
	}

	System.out.println ("\nThe lotteryNumber array is:");
	for (int i = 0 ; i < 5 ; i++) //show lotteryNumber array
	    System.out.print (num [i]);

	System.out.println ("\n\nThe user's array is:");
	for (int i = 0 ; i < 5 ; i++) //show user's array
	    System.out.print (user [i]);

	if (match == 5)
	    System.out.println ("You win a grand prize.");




    } // main method
} // Lottery class

