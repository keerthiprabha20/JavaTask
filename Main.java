package library;

import java.util.Scanner;

public class Main {
 
       public static void main(String[] args) {
		Library lib = new Library();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			
			System.out.println("\n----MY LIBRARY----");
			System.out.println("1. Add New Book");
			System.out.println("2. Show All The Books");
			System.out.println("3. Issue the Books");
			System.out.println("4. Return the taken Book");
			System.out.println("5. Exit the library");
			System.out.println("Enter your selection: ");
			choice= sc.nextInt();
			sc.nextLine();
			
			if(choice==1)
			{
				System.out.println("Enter the title of the book: ");
				String title = sc.nextLine();
				System.out.println("enter the author of the book: ");
				String author =sc.nextLine();
				System.out.println("enter the ISBN: ");
				String ISBN = sc.nextLine();
				lib.addNewBook(new Book(title, author, ISBN));
			}
			else if (choice==2)
			{
				lib.showTheBooks();
				
			}
			else if(choice==3)
			{
				lib.showTheBooks();
				System.out.println("enter the book number to issue: ");
				int i= sc.nextInt();
				if (lib.issueTheBook(i-1))
				{
					System.out.println("Sorry! the book is not available");
				}
			}
			else if(choice==4)
			{
				lib.showTheBooks();
				System.out.println("enter the book to return: ");
				int i=sc.nextInt();
				if(lib.returnTheBook(i-1))
				{
					System.out.println("Book returned!");
				}
				else
				{
					System.out.println("Sorry! , cannot return");
				}
			}
			else if(choice==5)
			{
				System.out.println("THANKYOU!");
			    break;
			}
			else
			{
				System.out.println("Invalid choice.try again later.");
			}
		
	}
		sc.close();

	}

}
