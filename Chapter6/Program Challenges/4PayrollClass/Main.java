//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #4

// The "Main" class.
public class Main
{
    public static void main (String[] args)
    {
	Payroll employee1 = new Payroll ("Jack", 2015101010);
	employee1.setHpr (30);
	employee1.setNohw (56);

	System.out.println (employee1.getName () + "\t" + employee1.getIDnumber () + "\t" + employee1.getPay ());
    } // main method
} // Main class
