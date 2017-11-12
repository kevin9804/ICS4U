//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #2

import hsa.*;
import javax.swing.JOptionPane;
// The "RetailPriceCalculator" class.
public class RetailPriceCalculator
{
    public static void main (String[] args)
    {
	//Variables
	double cost,markup,price;
	Stdout.print("Enter the wholesale cost is ");
	cost = Stdin.readDouble();
	Stdout.print("Enter the wholesale cost mark up percentage is ");
	markup = Stdin.readDouble();
	price = calculateRetail(cost,markup);
	Stdout.print("The item's retail price is "+price);
    } // main method
    public static double calculateRetail(double cost,double markup)
    {
	double output;
	output=cost*(markup/100+1);
	return output;
    }
	
    
} // RetailPriceCalculator class
