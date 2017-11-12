//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #2

import hsa.*;
public class Car
{
    private int yearModel;
    private String make;
    private int speed;

    public void Constructor (int num, String input)
    {
	yearModel = num;
	make = input;
	speed = 0;
    }


    public void Accessors (int num, String input, int spd)
    {
	yearModel = num;
	make = input;
	speed = spd;
    }


    public void accelerate ()
    {
	speed = speed + 5;
    }


    public void brake ()
    {
	speed = speed - 5;
    }


    public int getSpeed ()
    {
	return speed;
    }
}


