//Leyao Li
//Kevin-Lee

import hsa.*;
import javax.swing.JOptionPane;
// The "Palindrome" class.
public class Palindrome
{
    public static void main (String[] args)
    {
	String a,b;
	a = JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):");
	//输入被判断的文字a
	b = inverseString(a);
	//调用子程序inverseString改写出a的回文格式
	if (a.toLowerCase().compareTo(b.toLowerCase())==0)
	//判断a和b的小写情况是否相同，相同即为回文
	JOptionPane.showMessageDialog(null,a+" in reverse is "+b+"\nIt IS a palindrome.");
	else
	//判断a、b不同，提示不是回文
	JOptionPane.showMessageDialog(null,a+" in reverse is "+b+"\nIt is not a palindrome.");
    } // main method

    public static String inverseString(String s)//子程序
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
