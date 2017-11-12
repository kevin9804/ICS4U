//Leyao Li
//Kevin-Lee

import hsa.*;
import javax.swing.JOptionPane;
// The "Palindrome2" class.
public class Palindrome2
{
    public static void main (String[] args)
    {
	//Variables
	String cha,str,str2,sentence,blank;
	int num;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	String word="";
	
	//Input
	blank = " ";
	sentence =" " + JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):") + " ";
	num = sentence.length();
	
	//Main
	for (int i=0;i<=num;i++)
	{
	    if (a!=0&&b!=0)
	    {
		str = sentence.substring(a,b).toLowerCase();
		str2 = inverseString(str).toLowerCase();
		a=b+1;
		b=0;
		if (str.compareTo(str2)==0)
		{
		    word = word + " " +str;
		    d=d+1;
		}
	    }
	    else
	    {
		cha = sentence.substring(i,i+1);
		if (a==0)
		{
		    if (cha.compareTo(blank) ==0)
		    {
			a=i+1;
		    }
		}
		else if (b==0)
		{
		    if (cha.compareTo(blank) ==0)
		    {
		    b=i;
		    }
		}
	    }
	}
	JOptionPane.showMessageDialog(null,"There are "+d+" palindromes in the sentence");
	JOptionPane.showMessageDialog(null,"The palindromes are:\n"+word);
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
} // Palindrome2 class
