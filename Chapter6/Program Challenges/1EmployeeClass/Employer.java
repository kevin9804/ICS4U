//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #1

import hsa.*;
// The "Employer" class.
public class Employer
{
    public static void main (String[] args)
    {
	Employee employee1 = new Employee("Susan Meyers",47899,"Accounting","Vice president");
	Employee employee2 = new Employee("Mark Jones",39119,"IT","Programmer");
	Employee employee3 = new Employee("Joy Rogers",81774,"Manufacturing","Eng");
	
	System.out.println("Name\t\tID Number\tDepartment\tPosition");
	System.out.println(employee1.getName()+"\t"+employee1.getIdNumber()+"\t\t"+employee1.getDepartment()+"\t"+employee1.getPosition());
	System.out.println(employee2.getName()+"\t"+employee2.getIdNumber()+"\t\t"+employee2.getDepartment()+"\t\t"+employee2.getPosition());
	System.out.println(employee3.getName()+"\t"+employee3.getIdNumber()+"\t\t"+employee3.getDepartment()+"\t"+employee3.getPosition());
    } // main method
} // Employer class
