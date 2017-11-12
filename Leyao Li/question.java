//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Projcet

import hsa.*;
import java.io.*;
// The "question" class.
public class question
{
    private String subject;
    private int num;
    private int answernum;
    private int haveread;
    private int messagenum;
    private String[] subjects;
    private String[] question;
    private String[] information;
    private String[] answer;
    private String[] answerinfo;


    public question (String s) throws IOException
    {
	subject = s;
    }


    public question () throws IOException
    {

    }


    //This method will get the question from student
    public void getQuestion (String q, String info)
    {
	subjects [num] = subject;
	question [num] = q;
	information [num] = info;
	answer [num] = "";
	answerinfo [num] = "";
    }


    //This method will get the answer from teacher
    public void getAnswer ()
    {
	String name;
	String ID;
	String date;
	int option;
	for (int i = answernum ; i < num ; i++)
	{
	    option = 0;
	    System.out.print ("\n");
	    System.out.println ("This question is about " + subjects [i] + ".");
	    System.out.println (question [i]);
	    System.out.println (information [i]);
	    System.out.print ("Answer:");
	    answer [i] = Stdin.readLine ();
	    System.out.print ("ID:");
	    ID = Stdin.readLine ();
	    System.out.print ("Name:");
	    name = Stdin.readLine ();
	    System.out.print ("Date:");
	    date = Stdin.readLine ();
	    answerinfo [i] = ID + " " + name + " " + date;
	    answernum++;
	    if (i != num - 1)
		while (option != 1 && option != 2)
		{
		    System.out.println ("Continue answer next question?");
		    System.out.println ("1.Yes");
		    System.out.println ("2.Save and exit");
		    option = Stdin.readInt ();
		    if (option == 2)
		    {
			return;
		    }
		}
	}
	System.out.println ("\nYou have no more questions to answear.\n");
    }


    //This method will show the question and answer to principal
    public void showQuestion ()
    {
	for (int i = 0 ; i < answernum ; i++)
	{
	    System.out.print ("\n");
	    System.out.println (subjects [i]);
	    System.out.println (question [i]);
	    System.out.println (information [i]);
	    System.out.println (answer [i]);
	    System.out.println (answerinfo [i]);
	}
    }


    //This method will get the num of how many questions did students ask
    //and how many questions did teachers answer
    public int readNum () throws IOException
    {
	String inputFileLoc = "question";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	num = Integer.parseInt (infile.readLine ());
	answernum = Integer.parseInt (infile.readLine ());
	haveread = Integer.parseInt (infile.readLine ());
	messagenum = answernum - haveread;
	infile.close ();
	return num;
    }


    //This method will get the question detail from question file
    public void readQuestion (int set) throws IOException
    {
	subjects = new String [set];
	question = new String [set];
	information = new String [set];
	answer = new String [set];
	answerinfo = new String [set];
	String inputFileLoc = "question";
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	infile.readLine ();
	infile.readLine ();
	infile.readLine ();
	for (int i = 0 ; i < num ; i++)
	{
	    infile.readLine ();
	    subjects [i] = infile.readLine ();
	    question [i] = infile.readLine ();
	    information [i] = infile.readLine ();
	    answer [i] = infile.readLine ();
	    answerinfo [i] = infile.readLine ();
	}
	infile.close ();
    }


    //This method will write the question and answer back to question file
    public void writeQuestion (int set) throws IOException
    {
	String outputFileLoc = "question";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (set);
	output.println (answernum);
	output.println (haveread);
	for (int i = 0 ; i < set ; i++)
	{
	    output.println ("");
	    output.println (subjects [i]);
	    output.println (question [i]);
	    output.println (information [i]);
	    output.println (answer [i]);
	    output.println (answerinfo [i]);
	}
	output.close ();
    }


    //This method will return how many new answer of question to student
    public int getNewquestionNum ()
    {
	return (num - answernum);
    }


    //This method will return how many new question that student asked to teacher
    public int getMessagenum ()
    {
	return messagenum;
    }


    //This method will show the question and answer to student
    public void showAnswer ()
    {
	for (int i = haveread ; i < answernum ; i++)
	{
	    System.out.print ("\n");
	    System.out.println (subjects [i]);
	    System.out.println (question [i]);
	    System.out.println (information [i]);
	    System.out.println (answer [i]);
	    System.out.println (answerinfo [i]);
	}
	haveread = answernum;
    }
}


