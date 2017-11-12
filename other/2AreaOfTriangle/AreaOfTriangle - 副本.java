//Kevin-Lee
//2015.09.14
//Area of a Triangle
/*
  Ask user enter a number from 1 to 4 to chice a formula 
  and then enter the valus of the character in the formula
  then the program will calculate the area of the triangle
*/ 

import hsa.*;
// The "AreaOfTriangle" class.
public class AreaOfTriangle
{
    public static void main (String[] args)
    {
	//Variables
	double area;	//定义输出值（被计算的三角形面积）
	double a,b,c,h,s,B,C,BC;	//定义计算中用到的变量
	int num;	//定义输入时选择的计算公式
	
	//一下部分输出展示四个公式并让使用者选择
	System.out.println("Choice the following formula to calculate the area.");
	System.out.println("1.area = a*h/2");
	System.out.println("2.area = a*b*sin(C)/2");
	System.out.println("3.area = a^2*sin(B)*sin(C)/(2*sin(B+C)");
	System.out.println("4.area = sqrt(s*(s-a)*(s-b)*(s-c))");
	System.out.println("Enter the number of formula.");
	num = Stdin.readInt();
	
	//选择公式
	switch(num)//根据输入num的数值选择case
	{
	case 1://公式1，输入a、h然后计算输出结果
	System.out.println("Please enter the value of a.");
	a = Stdin.readDouble();
	System.out.println("Please enter the value of h.");
	h = Stdin.readDouble();
	area = a*h/2;
	System.out.println("The area of triangle is "+area);
	break;
	
	case 2://公式2，输入a、b、sin（C）然后计算输出结果
	System.out.println("Please enter the value of a.");
	a = Stdin.readDouble();
	System.out.println("Please enter the value of b.");
	b = Stdin.readDouble();
	System.out.println("Please enter the value of sin(C).");
	C = Stdin.readDouble();
	area = a*b*C/2;
	System.out.println("The area of triangle is "+area);
	break;
	
	case 3://公式3，输入a、sin（B）、sin（C）然后计算BC再计算面积最后输出结果
	System.out.println("Please enter the value of a.");
	a = Stdin.readDouble();
	System.out.println("Please enter the value of sin(B).");
	B = Stdin.readDouble();
	System.out.println("Please enter the value of sin(C).");
	C = Stdin.readDouble();
	System.out.println("Please enter the value of sin(B+C).");
	BC = Stdin.readDouble();
	area = ((a*a)*B*C)/(2*BC);
	System.out.println("The area of triangle is "+area);
	break;
	
	case 4://公式1，输入a、b、c然后计算s最后计算面积输出结果
	System.out.println("Please enter the value of a.");
	a = Stdin.readDouble();
	System.out.println("Please enter the value of b.");
	b = Stdin.readDouble();
	System.out.println("Please enter the value of c.");
	c = Stdin.readDouble();
	s = (a+b+c)/2;
	area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	//area = a*b*C/2;
	System.out.println("The area of triangle is "+area);
	break;
	
	default://输入输在不属于1~4的整数，重新输入
	System.out.print("You didn't enter a number from 1 to 4");
	break;
	}
    } // main method
} // AreaOfTriangle class
