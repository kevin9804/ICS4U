//Leyao Li
//Kevin-Lee

import hsa.*;
// The "EasterProgram" class.
public class EasterProgram
{
    public static void main (String[] args)
    {
	//Variables
	int year,month,day;	//定义年月日
	int a,b,c,d,q,f,g,h,j,k,n,p;	//定义计算变量
	
	//Input输入年份
	Stdout.println("Please input the year you want to calculate.");
	year = Stdin.readInt();
	
	//Calculate计算过程
	/*
	/代表除号（int值会自动取整舍去小数部分，向下取整）
	%代表取余数
	*/
	a = year/100;
	b = year%100;
	c = 3*(a+25)/4;
	d = 3*(a+25)%4;
	q = 8*(a+11)/25;
	f = (5*a+b)%19;
	g = (19*f+c-q)%30;
	h = (f+11*g)/319;
	j = (60*(5-d)+b)/4;
	k = (60*(5-d)+b)%4;
	n = (2*j-k-g+h)%7;
	month = (g-h+n+114)/31;
	p = (g-h+n+114)%31;
	day = (p+1)/1;
	
	//Output输出
	Stdout.println("The date of Easter Sunday of "+year+" is "+month+"."+day);
	
    } // main method
} // EasterProgram class
