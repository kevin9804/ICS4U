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
	//����Ҫ���ܻ��߽��ܵľ���
	input = JOptionPane.showInputDialog("This program will encrypt or decrypt a phrase using the simple encryption method of rotating the letters.\n\nPlease enter a phrese");
	num = input.length();//��ȡ�ַ�������
	rotation = JOptionPane.showInputDialog("Enter the rotation amount(1-25)");//������ܻ��߽��ܵ�ƫ����
	rotate = (int)Double.parseDouble(rotation);//�������Stringֵת��double��ת��int
	cryption = JOptionPane.showInputDialog("1 - Encryption\n2 - Decryption");//������ܻ��߽���
	crypt = (int)Double.parseDouble(cryption);//�������Stringֵת��double��ת��int
	output = "";//��ʼ�����ֵΪ��
	blank = " ";//����ո�

	for (int i=0;i<num;i++)
	{
	b = input.substring(i,i+1);
	if (b.compareTo(blank)==0)//�ж���ĸ�Ƿ�Ϊ�ո�����ǣ����ֵ����ո�
	output=output+blank;
	else//����ж�ֵΪ��ִ�����²�����м���
	{
	    for (int n=65;n<=90;n++)//����Ϊ��д��ĸ�����ж�
		{
		c=(char)n;//��ȡ��дA-Z����ĸ
		a=c+"";//ת��ΪStringֵ
		if (b.compareTo(a)==0)//�ж��Ƿ�Ϊ��ȡ����ĸ
		{
		    if (crypt==1)//�������ֵ�Ǽ���
			{
			d=n+rotate;//�����������
			if (d>90)//������ܺ����ֵ����90������Z��
			d=d-26;//��26����A��ʼ
			c=(char)d;//��ȡ���ܺ����ĸֵ
			output=output+c;//����ĸ��ӵ����ֵ��ȥ
			}
		    else//������ǽ��ܣ�����ط���̫�Ͻ���ֻҪ����1���жϳɽ��ܣ�
			{
			d=n-rotate;//���з������
			if (d<65)//������ܺ����ֵС��65������A��
			d=d+26;//��26����Z��ʼ
			c=(char)d;//��ȡ���ܺ����ĸֵ
			output=output+c;//����ĸ��ӵ����ֵ
			}
		}
		}
	    for (int n=97;n<=122;n++)//�����Ǽ����Сдa-z���жϣ����д������ͬ�����˷�Χ��65-90�����97-122
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
	JOptionPane.showMessageDialog(null,output);//������ռ��ܺ�Ľ��
    } // main method
} // SimpleEncryption class
