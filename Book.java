package library;

public class Book 
{
		String title;
		String author;
		String ISBN;
		boolean available= true;
		
		public Book(String title, String author, String ISBN)
		{
			this.title = title;
			this.author = author;
			this.ISBN = ISBN;
		}
		public boolean isAvailable()
		{
			return available;
		}
		public String toString()
		{
			return title + "by" + author + "(ISBN: "+ ISBN + ") -" + (available ? "Available": "issued");
			
		}
}