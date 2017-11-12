//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 
//Chapter 3 Programming Challenges #4

import hsa.*;
//import java.util.Arrays;
// The "SorteNames" class.5
public class SorteNames
{
    public static void main (String[] args)
    {
	//Variables
	String str1,str2,str3,name1,name2,name3;
	
	//Input
	Stdout.println("Please input first person name.");
	str1 = Stdin.readLine();
	Stdout.println("Please input secone person name.");
	str2 = Stdin.readLine();
	Stdout.println("Please input last person name.");
	str3 = Stdin.readLine();
	
	///If
	if (str1.compareTo(str2) < 0)
	{
	    if (str1.compareTo(str3) < 0)
	    {
		name1 = str1;
		if (str2.compareTo(str3) < 0)
		{
		    name2 = str2;
		    name3 = str3;
		}
		else
		{
		    name2 = str3;
		    name3 = str2;
		}
	    }
	    else
	    {
		name1 = str3;
		name2 = str1;
		name3 = str2;
	    }
	}
	else if (str1.compareTo(str3) < 0)
	     {
		name1 = str2;
		name2 = str1;
		name3 = str3;
	     }
	     else if (str2.compareTo(str3) < 0)
		  {
		    name1 = str2;
		    name2 = str3;
		    name3 = str1;
		  }
		  else
		  {
		    name1 = str3;
		    name2 = str2;
		    name3 = str1;
		  }
	
	//Output
	Stdout.println(name1);
	Stdout.println(name2);
	Stdout.println(name3);
		
    } // main method
} // SorteNames class
