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
	
	//Input���벿��
	blank = " ";//����ո�
	sentence =" " + JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):") + " ";//�����жϵľ���
	num = sentence.length();//��ȡ���ӳ�����ֵ
	
	//Main���岿��
	for (int i=0;i<=num;i++)//��iС�ھ��ӳ�����ֵʱѭ��
	{
	//�ȿ�else���ֵ�ע��
	    if (a!=0&&b!=0)//�ж϶�λ��a��b�Ƿ�Ϊ����
	    {
		str = sentence.substring(a,b).toLowerCase();//����ȡ�ĵ���ת����Сд
		str2 = inverseString(str).toLowerCase();//�����ʷ���ƴд
		//��������������a��b������
		a=b+1;
		b=0;
		if (str.compareTo(str2)==0)//�ж��Ƿ��ǻ��ģ�����ǣ�ִ�����²��裬�񣬷���for loop����Ѱ����һ�����ʲ��ж�
		{
		    word = word + " " +str;//����ȡ���Ļ��Ĵ���ӵ����������
		    d=d+1;//��������Ĵ������ļ�����+1
		}
	    }
	    else
	    {
		cha = sentence.substring(i,i+1);//��ȡi��i+1�ֽ��м���ַ�
		//���²��ֽ���ȡ�������ַ���blank�ո���бȽϣ���ͬʱ�ͻ�ȡ�ո�����λ�ã���ȡ��һλ��Ȼ���ȡa~b�м�ĵ��ʣ�ʹ���ӳ����ȡ�����ĵ��ʣ��ж��Ƿ�Ϊ���ģ�����ǣ���������һ������������ӵ����word��������������һ������
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
	JOptionPane.showMessageDialog(null,"There are "+d+" palindromes in the sentence");//��������л��Ĵʵ�����
	JOptionPane.showMessageDialog(null,"The palindromes are:\n"+word);//����������ǻ��ĵĵ���
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
