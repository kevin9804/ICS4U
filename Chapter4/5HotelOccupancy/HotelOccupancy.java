//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #5

import hsa.*;
// The "HotelOccupancy" class.
//��ĿҪ���û�������Ƶ���¥�㣬Ȼ������ÿ��¥�ķ���������ס�������������ܷ�������ס���������÷����Լ���ס��
//ͬʱ��ĿҪ��¥��������С��1��ÿ�㷿����������С��10
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
	//����ʼ����������ס�����趨Ϊ0�������û�����ʹ��+=��rooms������occupied�������

	//run
	for (int thisfloor = 1 ; thisfloor <= floor ; thisfloor++)
	{
	    Stdout.println ("Please enter how many rooms on floor " + thisfloor);
	    input1 = Stdin.readDouble ();
	    while (input1 < 10)
		//�˴��ж����뷿�����Ƿ����Ҫ�����10�䣬������Ҫ����ѭ��������Ϊֹ
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
