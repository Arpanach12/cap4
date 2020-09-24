package Book;
import java.util.*;
public class bookMain {
	static Scanner scanner = new Scanner(System.in);
	static int i,j;
	public static void main(String[] args) {
			
		System.out.print("Enter number of books : ");
		int n = scanner.nextInt();
		BookStore[] bs = new BookStore[n];
		
		bs = setBooks(bs);  // setting the values 
		
		getBooks(bs);		//displaying all the details
		
		System.out.println("Enter the book name to be searched : ");
		String search = scanner.nextLine();
		BookStore bsearch = new BookStore();
		bsearch = bookdetails(bs,search,n);
		if(bsearch!=null)
			{
			System.out.println("Book is present ");
			System.out.println("Book's Title : "+bsearch.getTitle());
			System.out.println("Book's Price : $ "+bsearch.getPrice());
			System.out.println("Year of publication : "+bsearch.getYearOfPublication());
			System.out.println("Book's Author : "+bsearch.getAuthor());
			}
		else
			System.out.println("Book not found ");
	}
	
	private static void getBooks(BookStore[] bs) {
		for( i=0;i<bs.length;i++)
		{
			System.out.println("Book's Title : "+bs[i].getTitle());
			
			System.out.println("Book's Price : $ "+bs[i].getPrice());
			
			System.out.println("Year of publication : "+bs[i].getYearOfPublication());
			
			System.out.println("Book's Author : "+bs[i].getAuthor());
		}
	}

	private static BookStore[] setBooks(BookStore[] bs) {
		for( i=0;i<bs.length;i++)
		{
			bs[i] = new BookStore();
			System.out.println("Enter Book "+(i+1)+" details : ");
			System.out.print("Enter Book's Title : "); scanner.nextLine();
			String booktitle = scanner.nextLine();   bs[i].setTitle(booktitle);
			
			System.out.print("Enter Book's Price : ");
			double bookprice = scanner.nextDouble(); bs[i].setPrice(bookprice);
			
			System.out.print("Enter year of publication : ");
			int year = scanner.nextInt();         bs[i].setYearOfPublication(year);
			scanner.nextLine();
			System.out.print("Enter Book's Author : ");
			String author = scanner.nextLine();   bs[i].setAuthor(author);
		}
		return bs;
	}

	private static BookStore bookdetails(BookStore[] bs, String search,int n) {
		
		 BookStore check = new BookStore();
		for(i=0;i<bs.length;i++)
		{
			if(bs[i].getTitle().equalsIgnoreCase(search))
				check = bs[i];
		}
		System.out.println(check);
		return check;
	}

}
