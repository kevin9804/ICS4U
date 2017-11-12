//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Final Projcet

import hsa.*;
import java.io.*;
// The "suggestion" class.
public class suggestion
{
    private int num;
    private int answernum;
    private int haveread;
    private int messagenum;
    private String[] suggestion;
    private String[] information;
    private String[] answer;
    private String[] answerinfo;

    public void getSuggestion (String s, String info)
    {
	suggestion [num] = s;
	information [num] = info;
	answer [num] = "";
	answerinfo [num] = "";
    }


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
	    System.out.println (suggestion [i]);
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
		    System.out.println ("Continue answer next suggestion?");
		    System.out.println ("1.Yes");
		    System.out.println ("2.Save and exit");
		    option = Stdin.readInt ();
		    if (option == 2)
		    {
			return;
		    }
		}
	}
	System.out.println ("\nYou have no more suggestion to answear.\n");
    }


    public int readNum (String file) throws IOException
    {
	String inputFileLoc = file;
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	num = Integer.parseInt (infile.readLine ());
	answernum = Integer.parseInt (infile.readLine ());
	haveread = Integer.parseInt (infile.readLine ());
	messagenum = answernum - haveread;
	infile.close ();
	return num;
    }


    public void readSuggestion (int set, String file) throws IOException
    {
	suggestion = new String [set];
	information = new String [set];
	answer = new String [set];
	answerinfo = new String [set];
	String inputFileLoc = file;
	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));
	infile.readLine ();
	infile.readLine ();
	infile.readLine ();
	for (int i = 0 ; i < num ; i++)
	{
	    infile.readLine ();
	    suggestion [i] = infile.readLine ();
	    information [i] = infile.readLine ();
	    answer [i] = infile.readLine ();
	    answerinfo [i] = infile.readLine ();
	}
	infile.close ();
    }


    public void writeSuggestion (int set, String file) throws IOException
    {
	String outputFileLoc = file;
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (set);
	output.println (answernum);
	output.println (haveread);
	for (int i = 0 ; i < set ; i++)
	{
	    output.println ("");
	    output.println (suggestion [i]);
	    output.println (information [i]);
	    output.println (answer [i]);
	    output.println (answerinfo [i]);
	}
	output.close ();
    }


    public int getNewsuggestionNum ()
    {
	return (num - answernum);
    }


    public int getMessagenum ()
    {
	return messagenum;
    }


    public void showAnswer ()
    {
	for (int i = haveread ; i < answernum ; i++)
	{
	    System.out.print ("\n");
	    System.out.println (suggestion [i]);
	    System.out.println (information [i]);
	    System.out.println (answer [i]);
	    System.out.println (answerinfo [i]);
	}
	haveread = answernum;
    }
}


