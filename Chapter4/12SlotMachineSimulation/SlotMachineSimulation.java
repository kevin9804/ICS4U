//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #12

import hsa.*;
// The "SlotMachineSimulation" class.
//��ĿҪ��дһ���ϻ�����Ҫ���û�����Ͷ���ϻ����Ľ����������������ͬͼ����Ͷ����*2����������ͬͼ����Ͷ����*3
public class SlotMachineSimulation
{
    public static void main (String[] args)
    {
	//Varibales
	int a, b, c;
	int moneyin;
	int use = 0;
	int win = 0;
	int money;
	boolean loop = true;
	int in;
	String aout = "";
	String bout = "";
	String cout = "";

	//loop
	while (loop == true)
	{
	    //Input
	    Stdout.println ("Please enter the money you want to put into the slot machine.");
	    moneyin = Stdin.readInt ();
	    //������
	    use = use + moneyin;
	    a = (int) (Math.random () * 6);
	    b = (int) (Math.random () * 6);
	    c = (int) (Math.random () * 6);
	    //�������������

	    if (a == 0)
		aout = "cherries";
	    else if (a == 1)
		aout = "oranges";
	    else if (a == 2)
		aout = "plums";
	    else if (a == 3)
		aout = "bells";
	    else if (a == 4)
		aout = "melons";
	    else if (a == 5)
		aout = "bars";
	    //��ȡ����������Ķ�Ӧ�ϻ���ͼ��

	    if (b == 0)
		bout = "cherries";
	    else if (b == 1)
		bout = "oranges";
	    else if (b == 2)
		bout = "plums";
	    else if (b == 3)
		bout = "bells";
	    else if (b == 4)
		bout = "melons";
	    else if (b == 5)
		bout = "bars";

	    if (c == 0)
		cout = "cherries";
	    else if (c == 1)
		cout = "oranges";
	    else if (c == 2)
		cout = "plums";
	    else if (c == 3)
		cout = "bells";
	    else if (c == 4)
		cout = "melons";
	    else if (c == 5)
		cout = "bars";

	    Stdout.println (aout);
	    Stdout.println (bout);
	    Stdout.println (cout);
	    //��ʾͼ�����û�


	    if (a == b)
		if (a == c)
		    win = win + 3 * moneyin;
		else
		    win = win + 2 * moneyin;
	    else if (b == c)
		win = win + 2 * moneyin;
	    else if (a == c)
		win = win + 2 * moneyin;
	    //�Ƚ�����ͼ������������Ƿ���ͬ���ж��û��Ƿ��ȡ���𼰽�����

	    Stdout.println ("Do you want to play again?");
	    Stdout.println ("If you want to continue, please enter 0");
	    Stdout.println ("If you want to stop, please enter: 1");
	    in = Stdin.readInt ();
	    if (in == 1)
		loop = false;
	    //ѯ���û��Ƿ������Ϸ
	}
	money = win - use;
	Stdout.println ("You put " + use + " into the machine and you win " + win + " from the machine.");
	Stdout.println ("The total money that you have earned is " + money);
	//���㷴�����
    } // main method
} // SlotMachineSimulation class

