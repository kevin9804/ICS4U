//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 5 Program Challenges #8

import hsa.*;
// The "ConversionProgram" class.
public class ConversionProgram
{
    public static void main (String[] args)
    {
	int choice;
	double meters;
	Stdout.print("Enter a Distance in meters: ");
	meters = Stdin.readDouble();
	menu();
	choice=Stdin.readInt();
	choice(choice,meters);
    } // main method
    
    public static void menu()
    {
	Stdout.println("1.Convert to kilometers");
	Stdout.println("2.Convert to inches");
	Stdout.println("3.Convert to feet");
	Stdout.println("4.Quit the program");
	
	Stdout.print("\nEnter your choice: ");
    }
    
    public static void choice(int c,double m)
    {
	if (c==1)
	showKilometers(m);
	else if (c==2)
	showInches(m);
	else if (c==3)
	showFeet(m);
	else if (c==4)
	Stdout.println("Bye!");
    }
    
    public static void showKilometers(double m)
    {
	int choice;
	double k;
	k = m*0.001;
	Stdout.println(m+" meters is "+k+" kilometers.");
	menu();
	choice=Stdin.readInt();
	choice(choice,m);
    }
    
    public static void showInches(double m)
    {
	int choice;
	double i;
	i = m*19.37;
	Stdout.println(m+" meters is "+i+" inches.");
	menu();
	choice=Stdin.readInt();
	choice(choice,m);
    }
    public static void showFeet(double m)
    {
	int choice;
	double f;
	f = m*3.281;
	Stdout.println(m+" meters is "+f+" feets.");
	menu();
	choice=Stdin.readInt();
	choice(choice,m);
    }
} // ConversionProgram class
