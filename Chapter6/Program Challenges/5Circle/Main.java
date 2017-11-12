//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #5

import hsa.*;
// The "Main" class.
public class Main
{
    public static void main (String[] args)
    {
	double num;
	Stdout.println ("Please enter the radius of the circlr");
	num = Stdin.readDouble ();

	Circle circle = new Circle (num);
	System.out.println ("The circle's area is " + circle.getArea ());
	System.out.println ("The circle's diameter is " + circle.getDiameter ());
	System.out.println ("The circle's circumference is " + circle.getCircumference ());
    }
}
