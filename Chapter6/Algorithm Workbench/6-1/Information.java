//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Algorithn Workbench #1

import hsa.*;
public class Information
{
    public static void main (String[] args)
    {
	Pet box = new Pet ();

	System.out.println ("Sending the name Jack " +
		"to the setName method.");
	box.setName ("Jack");

	System.out.println ("Sending the type of animal Dog " +
		"to the setAnimal method.");
	box.setAnimal ("Dog");

	System.out.println ("Sending the Age 12 " +
		"to the setAge method.");
	box.setAge (12);

	System.out.println (box.getName ());
	System.out.println (box.getAnimal ());
	System.out.println (box.getAge ());
	System.out.println ("Done.");
    }
}
