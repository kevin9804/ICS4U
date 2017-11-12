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
	
	//Input输入部分
	blank = " ";//定义空格
	sentence =" " + JOptionPane.showInputDialog("Words that are the same forwords and backwords are called palindromes.\nThis Program determines if a phrase is a palindrome.\n\nEnter a phrase(do not include a punctuation mark):") + " ";//输入判断的句子
	num = sentence.length();//获取句子长度数值
	
	//Main主体部分
	for (int i=0;i<=num;i++)//在i小于句子长度数值时循环
	{
	//先看else部分的注解
	    if (a!=0&&b!=0)//判断定位点a、b是否为非零
	    {
		str = sentence.substring(a,b).toLowerCase();//将获取的单词转换成小写
		str2 = inverseString(str).toLowerCase();//将单词反向拼写
		//接下来两行重置a、b计数器
		a=b+1;
		b=0;
		if (str.compareTo(str2)==0)//判断是否是回文，如果是，执行以下步骤，否，返回for loop继续寻找下一个单词并判断
		{
		    word = word + " " +str;//将获取到的回文词添加到输出名单里
		    d=d+1;//将计算回文词数量的计数器+1
		}
	    }
	    else
	    {
		cha = sentence.substring(i,i+1);//提取i和i+1字节中间的字符
		//以下部分将提取出来的字符与blank空格进行比较，相同时就获取空格所在位置，提取下一位，然后获取a~b中间的单词，使用子程序获取反向后的单词，判断是否为回文，如果是，计数器加一，并将单词添加到输出word里，否则继续搜索下一个单词
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
	JOptionPane.showMessageDialog(null,"There are "+d+" palindromes in the sentence");//输出句子中回文词的数量
	JOptionPane.showMessageDialog(null,"The palindromes are:\n"+word);//输出句子中是回文的单词
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
