//Li Leyao 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 2 Programming Challenges #18

import hsa.*;
import javax.swing.JOptionPane;
// The "WordGame" class.
public class WordGame
{
    public static void main (String[] args)
    {
	//Declare Variables
	String name;
	String age;
	String city;
	String college;
	String profession;
	String animal;
	String petname;
	
	//Input
	name = JOptionPane.showInputDialog("What's your name?");
	age = JOptionPane.showInputDialog("How old are you?");
	city = JOptionPane.showInputDialog("The name of city that you live.");
	college = JOptionPane.showInputDialog("The name of your college");
	profession = JOptionPane.showInputDialog("The profession you work as.");
	animal = JOptionPane.showInputDialog("Your pet's type of animal.");
	petname = JOptionPane.showInputDialog("Your pet's name");
	
	//Output
	System.out.println("There once was a person named "+name+" who lived in "+city+".");
	System.out.println("At the age of "+age+", "+name+" went to college at "+college+".");
	System.out.println(name+" graduated and went to work as a "+profession+".");
	System.out.println("Then, "+name+" adopted a(n) "+animal+" named "+petname+".");
	System.out.println("They both lived happily ever after" );
	
    } // main method
} // WordGame class

