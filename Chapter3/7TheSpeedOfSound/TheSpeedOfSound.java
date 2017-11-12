//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 3 Programming Challenges # 7

import hsa.*;
// The "TheSpeedOfSound" class.
public class TheSpeedOfSound
{
    public static void main (String[] args)
    {
	//Variables
	String input;
	double distance;
	double time = 0;
	
	//Input
	Stdout.println("Please input the medium.");
	input = Stdin.readLine();
	Stdout.println("Please input the distance.");
	distance = Stdin.readDouble();
	
	//If
	if  (input.compareTo("air") == 0)
	time = distance / 1100;
	
	else if  (input.compareTo("water") == 0)
	time = distance / 4900;
	
	else if  (input.compareTo("steel") == 0)
	Stdout.println("Please input the distance.");
		
	//Output
	Stdout.println("The time is "+ time);
	
    } // main method
} // TheSpeedOfSound class
