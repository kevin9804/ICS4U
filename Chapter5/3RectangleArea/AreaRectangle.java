//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #3

import hsa.*;
public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
	     width,     // The rectangle's width
	     area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   
   public static double getLength()
   {
       double input;
       Stdout.println("Please enter the rectangle's length.");
       input = Stdin.readDouble();
       return input;
   }
   
   public static double getWidth()
   {
       double input;
       Stdout.println("Please enter the rectangle's width.");
       input = Stdin.readDouble();
       return input;
   }
   
   public static double getArea(double l,double w)
   {
       double a;
       a = l * w;
       return a;
   }
   
   public static void displayData(double a,double b,double c)
   {
       Stdout.println("The rectangle's length is "+a);
       Stdout.println("The rectangle's width is "+b);
       Stdout.println("The rectangle's area is "+c);
   }
}

