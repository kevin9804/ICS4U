//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #4

import hsa.*;
// The "PaintJobEstimator" class.
public class PaintJobEstimator
{
    public static void main (String[] args)
    {
	int room;
	double price,space,gallon,hour,cost,charges,total;
	room = getRoom();
	price = getPrice();
	space = getSpace(room);
	gallon = getGallon(space);
	hour = getHour(gallon);
	cost = getCost(gallon,price);
	charges = getCharges(hour);
	total = getTotal(cost,charges);
	output(gallon,hour,cost,charges,total);
    } 
    
    public static int getRoom()
    {
	Stdout.println("Please enter how many rooms will be painted.");
	int rooms = Stdin.readInt();
	return rooms;
    }
    
    public static double getPrice()
    {
	Stdout.println("Please enter the price of the paint per gallon.");
	double price = Stdin.readDouble();
	return price;
    }
    
    public static double getSpace(int rooms)
    {
	double space = 0;
	for (int i=1;i<=rooms;i++)
	{
	Stdout.println("Please enter the space of room "+i);
	space = space+Stdin.readDouble();
	}
	return space;
    }
    
    public static double getGallon(double a)
    {
	double gallons = a/115;
	return gallons;
    }
    
    public static double getCost(double a,double b)
    {
	double costs = a*b;
	return costs;
    }
    
    public static double getHour(double a)
    {
	double hours = a*8;
	return hours;
    }
    
    public static double getCharges(double a)
    {
	double charge = a * 18;
	return charge;
    }
    
    public static double getTotal(double a,double b)
    {
	double totalcost = a + b;
	return totalcost;
    }
    
    public static void output(double a,double b,double c,double d,double e)
    {
	Stdout.println("The number of gallons of paint required is "+a);
	Stdout.println("The hours of labor required is "+b);
	Stdout.println("The cost of the paint is "+c);
	Stdout.println("The labor chatges is "+d);
	Stdout.println("The total cost of the paint is "+e);
    }
    
} // PaintJobEstimator class
