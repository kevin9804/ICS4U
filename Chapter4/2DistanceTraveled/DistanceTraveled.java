//Leyao Li 2015070006
//Kevin-Lee
//ICS4U - Per 5
//Chapter 4 Progrannming Challenges # 2

import hsa.*;
// The "DistanceTraveled" class.
//��ĿҪ���û�������ʻ�ٶȣ�mph����ʱ�䣨h���������ʽ��·�̣�����Ҫ���ж��û��ٶȲ�Ϊ������ʱ�䲻С��1
public class DistanceTraveled
{
    public static void main (String[] args)
    {
	//Variables
	double speed, time, num, distance;

	//Input
	num = 1;
	Stdout.print ("Please enter the speed (in miles per hour): ");
	speed = Stdin.readDouble ();

	while (speed < 0)
	    //���ٶ�ֵΪ����ʱҪ���û��������룬ֱ������Ҫ��Ϊֹ��
	    {
		Stdout.print ("Please enter a possitve number of speed: ");
		speed = Stdin.readDouble ();
	    }

	Stdout.print ("Please enter the time: ");
	time = Stdin.readDouble ();
	while (time < 1)
	    //��ʱ��С��1hʱҪ���û��������룬ֱ������Ҫ��Ϊֹ��
	    {
		Stdout.print ("Please enter a number bigger than 1 of time: ");
		time = Stdin.readDouble ();
	    }

	//Output
	Stdout.println ("hour\tDistance Traveled");
	Stdout.println ("-------------------------");
	for (int hour = 1 ; hour <= time ; hour++)
	    //ѭ������ÿСʱ�߹���·��
	    {
		distance = hour * speed;
		Stdout.println (hour + "\t" + distance);
	    }

    } // main method
} // DistanceTraveled class
