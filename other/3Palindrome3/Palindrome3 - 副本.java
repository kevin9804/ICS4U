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
	//������ӻ��߶������
	a = JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):");
	b = inverseString(a).replaceAll(" ", "");//��ȡa�ķ���ƴдͬʱ������Ӵ����֮��Ŀո�replaceall��
	if (a.replaceAll(" ", "").toLowerCase().compareTo(b.toLowerCase())==0)//���ԭʼ�����ַ���a�еĿո�ͬʱ��b�����ж�
	//�ж�ֵΪ�棬�����ʾ�ǻ���
	JOptionPane.showMessageDialog(null,a+" IS a palindrome.");
	else
	//�ж�ֵΪ�������ʾ���ǻ���
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
