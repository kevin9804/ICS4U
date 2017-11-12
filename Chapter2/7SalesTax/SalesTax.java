//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #7

import hsa.*;
import javax.swing.JOptionPane;
// The "SalesTax" class.
public class SalesTax
{
    public static void main (String[] args)
    {
	
	// Declare Variables
	String purchase1;
	double purchase2;
	double state;
	double country;
	double tax;
	double total;
	
	//Input valus
	state = 0.04;
	country = 0.02;
	purchase1 = JOptionPane.showInputDialog("");
	purchase2 = Double.parseDouble(purchase1);
	
	//calculate
	tax = (1+country) * (1+state);
	total = purchase2 * tax;

	//Output   
	System.out.println("The state tax is " + state);
	System.out.println("the country tax is " + country);
	System.out.println("The total tax is " + tax);
	System.out.println("The customer should pay is " + total);
	
	
    } // main method
} // SalesTax class
