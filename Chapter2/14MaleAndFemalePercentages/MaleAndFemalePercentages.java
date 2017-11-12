//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #14

import hsa.*;
// The "MaleAndFemalePercentages" class.
public class MaleAndFemalePercentages
{
    public static void main (String[] args)
    {
	//Declare Variables
	double male;
	double female;
	double total;
	double POM;
	double POF;
	
	//Input
	Stdout.println("Please enter the number of the male are there in your class.");
	male = Stdin.readDouble();
	Stdout.println("Please enter the number of the female are there in your class.");
	female = Stdin.readDouble();
	
	//calculate
	total = male + female;
	POM = male / total;
	POF = female / total;
	
	//Output
	Stdout.println("The percentage of male is " + POM);
	Stdout.println("The percentage of female is " + POF);
	
    } // main method
} // MaleAndFemalePercentages class
