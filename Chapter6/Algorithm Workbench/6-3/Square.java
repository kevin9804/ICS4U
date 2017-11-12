//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Algorithm Workbench #3

public class Square
{
    private double sideLength;

    public void setLength (double num)
    {
	sideLength = num;
    }


    public void setLength ()
    {
	sideLength = 0.0;
    }


    public double getArea ()
    {
	return sideLength * sideLength;
    }


    public double getSideLength ()
    {
	return sideLength;
    }
}
