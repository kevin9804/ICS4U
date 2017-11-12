//Leyao Li 2015070006
//Kevin-Lee
//ICS4US2 - Per 5
//Chapter 6 Algorithn Workbench #2

// The "Book" class.
public class Book
{
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    public void setTitle (String tit)
    {
	title = tit;
    }


    public void setAuthor (String aut)
    {
	author = aut;
    }


    public void setPublisher (String pub)
    {
	publisher = pub;
    }


    public void setCopiesSold (int cop)
    {
	copiesSold = cop;
    }


    public String getTitle ()
    {
	return title;
    }


    public String getAuthor ()
    {
	return author;
    }


    public String getPublisher ()
    {
	return publisher;
    }


    public int getCopiesSold ()
    {
	return copiesSold;
    }
} // Book class
