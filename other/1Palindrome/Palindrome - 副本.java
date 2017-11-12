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
	//���뱻�жϵ�����a
	b = inverseString(a);
	//�����ӳ���inverseString��д��a�Ļ��ĸ�ʽ
	if (a.toLowerCase().compareTo(b.toLowerCase())==0)
	//�ж�a��b��Сд����Ƿ���ͬ����ͬ��Ϊ����
	JOptionPane.showMessageDialog(null,a+" in reverse is "+b+"\nIt IS a palindrome.");
	else
	//�ж�a��b��ͬ����ʾ���ǻ���
	JOptionPane.showMessageDialog(null,a+" in reverse is "+b+"\nIt is not a palindrome.");
    } // main method

    public static String inverseString(String s)//�ӳ���
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
