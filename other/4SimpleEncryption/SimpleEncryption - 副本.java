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
	//输入要加密或者解密的句子
	input = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the simple encryption method of rotating the letters.\n\nPlease enter a phrese");
	num = input.length();//获取字符串长度
	rotation = JOptionPane.showInputDialog("Enter the rotation amount(1-25)");//输入加密或者解密的偏移量
	rotate = (int)Double.parseDouble(rotation);//将输入的String值转成double再转成int
	cryption = JOptionPane.showInputDialog("1 - Encryption\n2 - Decryption");//输入加密或者解密
	crypt = (int)Double.parseDouble(cryption);//将输入的String值转成double再转成int
	output = "";//初始化输出值为空
	blank = " ";//定义空格

	for (int i=0;i<num;i++)
	{
	b = input.substring(i,i+1);
	if (b.compareTo(blank)==0)//判断字母是否为空格，如果是，输出值加入空格
	output=output+blank;
	else//如果判断值为否，执行以下步骤进行加密
	{
	    for (int n=65;n<=90;n++)//假设为大写字母进行判断
		{
		c=(char)n;//获取大写A-Z的字母
		a=c+"";//转换为String值
		if (b.compareTo(a)==0)//判断是否为获取的字母
		{
		    if (crypt==1)//如果输入值是加密
			{
			d=n+rotate;//进行正向加密
			if (d>90)//如果加密后的数值超过90（超过Z）
			d=d-26;//减26返回A开始
			c=(char)d;//获取加密后的字母值
			output=output+c;//将字母添加到输出值里去
			}
		    else//否则就是解密（这个地方不太严谨，只要不是1都判断成解密）
			{
			d=n-rotate;//进行反向解密
			if (d<65)//如果解密后的数值小于65（超过A）
			d=d+26;//加26返回Z开始
			c=(char)d;//获取解密后的字母值
			output=output+c;//将字母添加到输出值
			}
		}
		}
	    for (int n=97;n<=122;n++)//以下是假设对小写a-z的判断，与大写基本相同，除了范围从65-90变成了97-122
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
	JOptionPane.showMessageDialog(null,output);//输出最终加密后的结果
    } // main method
} // SimpleEncryption class
