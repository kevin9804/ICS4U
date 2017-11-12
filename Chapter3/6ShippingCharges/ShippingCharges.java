//Leyao Li 2015070006
//Kevin-Lee
//ICS4U - Per 5
//Chapter 4 Programming Challenges #6

import hsa.*;
// The "ShippingCharges" class.
public class ShippingCharges
{
    public static void main (String[] args)
    {
       //Variables
       double pounds;
       
       //input
       Stdout.println("Please enter the weight of package.");
       pounds = Stdin.readDouble();
       
       //Output
       if (pounds <= 2)
       Stdout.println("Rate per 500 Miles Shipped is $1.10");
       else if (pounds <= 6)
       Stdout.println("Rate per 500 Miles Shipped is $2.20");
       else if (pounds <= 10)
       Stdout.println("Rate per 500 Miles Shipped is $3.70");
       else
       Stdout.println("Rate per 500 Miles Shipped is $3.80");
       
       
    } // main method
} // ShippingCharges class
