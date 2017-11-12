//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #5

// The "Circle" class.
public class Circle
{
    private double radius;
    private double PI = 3.14159;

    public Circle (double r)
    {
	radius = r;
    }


    public Circle ()
    {
	radius = 0.0;
    }


    public void setRadius (double r)
    {
	radius = r;
    }


    public double getRadius ()
    {
	return radius;
    }


    public double getArea ()
    {
	return PI * radius * radius;
    }


    public double getDiameter ()
    {
	return radius * 2;
    }


    public double getCircumference ()
    {
	return 2 * PI * radius;
    }
}
