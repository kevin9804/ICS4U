//Leyao Li 2015070006
//Kevin-Lee
//ICS4U - Per 5
//Chapter 4 Progrannming Challenges # 2

import hsa.*;
// The "DistanceTraveled" class.
//题目要求用户输入行驶速度（mph）和时间（h）后计算形式的路程，并且要求判断用户速度不为负数且时间不小于1
public class DistanceTraveled
{
    public static void main (String[] args)
    {
	//Variables
	double speed, time, num, distance;

	//Input
	num = 1;
	Stdout.print ("Please enter the speed (in miles per hour): ");
	speed = Stdin.readDouble ();

	while (speed < 0)
	    //当速度值为负数时要求用户重新输入，直到符合要求为止。
	    {
		Stdout.print ("Please enter a possitve number of speed: ");
		speed = Stdin.readDouble ();
	    }

	Stdout.print ("Please enter the time: ");
	time = Stdin.readDouble ();
	while (time < 1)
	    //当时间小于1h时要求用户重新输入，直到符合要求为止。
	    {
		Stdout.print ("Please enter a number bigger than 1 of time: ");
		time = Stdin.readDouble ();
	    }

	//Output
	Stdout.println ("hour\tDistance Traveled");
	Stdout.println ("-------------------------");
	for (int hour = 1 ; hour <= time ; hour++)
	    //循环计算每小时走过的路程
	    {
		distance = hour * speed;
		Stdout.println (hour + "\t" + distance);
	    }

    } // main method
} // DistanceTraveled class
