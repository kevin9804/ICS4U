//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Algorithn Workbench #1

import hsa.*;
// The "Manager" class.
public class Manager
{
    public static void main (String[] args)
    {
	Book box = new Book ();

	Stdout.println ("Sending the title ABC " +
		"to the setTitle method.");
	box.setTitle ("ABC");

	Stdout.println ("Sending the author John " +
		"to the setAuthor method.");
	box.setAuthor ("John");

	Stdout.println ("Sending the publisher CIC " +
		"to the setPublisher method.");
	box.setPublisher ("CIC");

	Stdout.println ("Sending the copiesSold 1000 " +
		"to the setCopiesSold method.");
	box.setCopiesSold (1000);

	Stdout.println (box.getTitle ());
	Stdout.println (box.getAuthor ());
	Stdout.println (box.getPublisher ());
	Stdout.println (box.getCopiesSold ());





    }
}
