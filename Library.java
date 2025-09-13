package library;

public class Library implements Issuable
{
	Book[] books = new Book[20];
	int count =0;

	public void addNewBook(Book b)
	{
		if (count < books.length)
		{
			books[count]=b;
			count++;
		}
		else
		{
		System.out.println("Sorry! cannot enter more books");	
		}
	}
	public void showTheBooks()
	{
		for(int i=0; i< count; i++)
		{
			System.out.println((i+1) + ". " + books[i]);
		}
	}
	public boolean issueTheBook(int index)
	{
		if (index >=0 && index < count && books[index].available)
		{
			books[index].available=false;
			return true;
		}
		return false;
	}
	
	public boolean returnTheBook(int index)
	{
		if (index>=0 && index < count && !books[index].available)
			{
				books[index].available =true;
				return true;
			}
			return false;
	}

}
