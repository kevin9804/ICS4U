//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #5

import hsa.*;
// The "HotelOccupancy" class.
//题目要求用户先输入酒店总楼层，然后输入每层楼的房间数和入住数量，最后计算总房数、入住房数、空置房数以及入住率
//同时题目要求楼层数不能小于1，每层房间数量不能小于10
public class HotelOccupancy
{
    public static void main (String[] args)
    {
	//Variables
	int floor;
	double rooms, occupied, input1, input2, rate;

	//Input
	Stdout.print ("Please enter the num of floors the hotel have: ");
	floor = Stdin.readInt ();
	while (floor < 1)
	{
	    Stdout.println ("Please enter the num of floors more than 1: ");
	    floor = Stdin.readInt ();
	}

	rooms = 0;
	occupied = 0;
	//将初始房间数和入住房数设定为0，根据用户输入使用+=往rooms变量和occupied变量里加

	//run
	for (int thisfloor = 1 ; thisfloor <= floor ; thisfloor++)
	{
	    Stdout.println ("Please enter how many rooms on floor " + thisfloor);
	    input1 = Stdin.readDouble ();
	    while (input1 < 10)
		//此处判断输入房间数是否符合要求大于10间，不符合要求则循环至符合为止
		{
		    Stdout.println ("Please enter how many rooms on floor " + thisfloor + "not less than 10");
		    input1 = Stdin.readDouble ();
		}
	    rooms = rooms + input1;
	    input1 = 0;

	    Stdout.println ("Please enter how many rooms are occupied on floor " + thisfloor);
	    input2 = Stdin.readDouble ();
	    occupied = occupied + input2;
	}

	//Calculate
	rate = occupied / rooms;

	//Output
	Stdout.println (rooms + " rooms the hotel has.");
	Stdout.println (occupied + " rooms are occupied.");
	Stdout.println (rooms - occupied + " rooms are vacant.");
	Stdout.println ("The occupancy rate fot the hotel is " + rate);
    } // main method
} // HotelOccupancy class
