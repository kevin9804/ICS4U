//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Program Challenges #1

import hsa.*;
// The "Employee" class.
public class Employee
{

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee (String nam, int num, String dep, String pos)
    {
	name = nam;
	idNumber = num;
	department = dep;
	position = pos;
    }


    public Employee (String nam, int num)
    {
	name = nam;
	idNumber = num;
	department = "";
	position = "";
    }


    public Employee ()
    {
	name = "";
	idNumber = 0;
	department = "";
	position = "";
    }


    public void setName (String nam)
    {
	name = nam;
    }


    public void setIdNumber (int num)
    {
	idNumber = num;
    }


    public void setDepartment (String dep)
    {
	department = dep;
    }


    public void setPosition (String pos)
    {
	position = pos;
    }


    public String getName ()
    {
	return name;
    }


    public int getIdNumber ()
    {
	return idNumber;
    }


    public String getDepartment ()
    {
	return department;
    }


    public String getPosition ()
    {
	return position;
    }
} // Employee class
