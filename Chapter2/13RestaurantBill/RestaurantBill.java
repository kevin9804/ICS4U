//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #13

import hsa.*;
// The "RestaurantBill" class.
public class RestaurantBill
{
    public static void main (String[] args)
    {
	//Declare Variables
	double charge;
	double tax;
	double tip;
	double bill;
	
	//Input
	Stdout.println("Please enter the charge of the meal.");
	charge = Stdin.readDouble();
	
	//calculate
	tax = charge * 0.0675;
	tip = tax * 0.2 + charge * 0.2;
	bill = charge + tax + tip ;
	
	//Output
	Stdout.println("The charge of your meal is " + charge);
	Stdout.println("The tax of your meal is " + tax);
	Stdout.println("The tip of your meal is " + tip);
	Stdout.println("The total bill of your meal is " + bill);
	
	
    } // main method
} // RestaurantBill class
