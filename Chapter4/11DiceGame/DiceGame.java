//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 4 Program Challenges #11

import hsa.*;
// The "DiceGame" class.
//��ĿҪ����Ժ��û�����ɫ�ӱ������ɳ����������1~6�����֣���һ�δ�����ԣ��ڶ��δ����û�������ʤ��һ��10�Σ��ۼƵó�����Ӯ��
public class DiceGame
{
    public static void main (String[] args)
    {
	//Variables
	int computer, user;
	int num, count;
	//Input
	num = 0;
	//��num������˫���ֱ�Ӯ�ô������û�Ӯ��num��һ����֮��һ��ƽ�򲻱䣬������num�����ж��˻��˻�ʤ��

	//loop
	for (count = 1 ; count <= 10 ; count++)
	    //��for loopѭ��10����ɫ��
	    {
		computer = 1 + (int) (Math.random () * 6); //��Math�������������
		Stdout.println ("Computer " + count + " times number is " + computer);
		user = 1 + (int) (Math.random () * 6);
		Stdout.println ("User " + count + " times number is " + user);
		if (user > computer)
		    num++;
		else if (user < computer)
		    num--;
		Stdout.println ("Press enter to continue.");
		Stdin.readLine ();
	    }

	if (num > 0)
	    Stdout.println ("User win.");
	else if (num < 0)
	    Stdout.println ("Computer win.");
	else
	    Stdout.println ("Draw");

    } // main method
} // DiceGame class
