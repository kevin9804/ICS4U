//Leyao Li
//Kevin-Lee

import hsa.*;
import javax.swing.JOptionPane;
// The "Palindrome3" class.
public class Palindrome3
{
    public static void main (String[] args)
    {
	String a,b;
	a = JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):");
	b = inverseString(a).replaceAll(" ", "");
	if (a.replaceAll(" ", "").toLowerCase().compareTo(b.toLowerCase())==0)
	//System.out.println("It IS a palindrome.");
	JOptionPane.showMessageDialog(null,a+" IS a palindrome.");
	else
	//System.out.println("It is not a palindrome.");
	JOptionPane.showMessageDialog(null,a+" is not a palindrome.");
    } // main method
    public static String inverseString(String s)
    {  
	char[] a = new char[s.length()];  
	char[] temp = s.toCharArray();  
	for (int i = temp.length-1,j=0; i >=0;)
	{  
	    a[j++] = temp[i--];  
	}  
	return String.valueOf(a);  
    }
} // Palindrome class
