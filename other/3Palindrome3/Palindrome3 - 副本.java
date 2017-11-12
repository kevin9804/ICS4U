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
	//输入句子或者多个单词
	a = JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):");
	b = inverseString(a).replaceAll(" ", "");//获取a的反向拼写同时清除句子词与词之间的空格（replaceall）
	if (a.replaceAll(" ", "").toLowerCase().compareTo(b.toLowerCase())==0)//清除原始输入字符串a中的空格同时与b进行判断
	//判断值为真，输出提示是回文
	JOptionPane.showMessageDialog(null,a+" IS a palindrome.");
	else
	//判断值为否，输出提示不是回文
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
