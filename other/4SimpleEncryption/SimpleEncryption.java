//Leyao Li
//Kevin-Lee

import hsa.*;
import javax.swing.JOptionPane;
// The "SimpleEncryption" class.
public class SimpleEncryption
{
    public static void main (String[] args)
    {
	//Variables
	String input,rotation,cryption,a,b,blank,output;
	int num,rotate,crypt,d;
	char c;
	
	
	//Input
	input = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the simple encryption method of rotating the letters.\n\nPlease enter a phrese");
	num = input.length();
	rotation = JOptionPane.showInputDialog("Enter the rotation amount(1-25)");
	rotate = (int)Double.parseDouble(rotation);
	cryption = JOptionPane.showInputDialog("1 - Encryption\n2 - Decryption");
	crypt = (int)Double.parseDouble(cryption);
	output = "";
	blank = " ";
	
	//Stdout.print(rotate+"\n"+crypt);
	for (int i=0;i<num;i++)
	{
	b = input.substring(i,i+1);
	if (b.compareTo(blank)==0)
	output=output+blank;
	else
	{
	    for (int n=65;n<=90;n++)
		{
		c=(char)n;
		a=c+"";
		if (b.compareTo(a)==0)
		{
		    if (crypt==1)
			{
			d=n+rotate;
			if (d>90)
			d=d-26;
			c=(char)d;
			output=output+c;
			}
		    else
			{
			d=n-rotate;
			if (d<65)
			d=d+26;
			c=(char)d;
			output=output+c;
			}
		}
		}
	    for (int n=97;n<=122;n++)
		{
		c=(char)n;
		a=c+"";
		if (b.compareTo(a)==0)
		{
		    if (crypt==1)
			{
			d=n+rotate;
			if (d>122)
			d=d-26;
			c=(char)d;
			output=output+c;
			}
		    else
			{
			d=n-rotate;
			if (d<97)
			d=d+26;
			c=(char)d;
			output=output+c;
			}
		}
		}
	}
	}
	JOptionPane.showMessageDialog(null,output);
    } // main method
} // SimpleEncryption class
