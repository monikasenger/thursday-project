package Book_manage_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookDetails {

	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	//method for add the book details
	public  static void add_book() throws Exception {
		//add
		System.out.println("Enter bookid of book:");
		String bookID=br.readLine();
		
		System.out.println("Enter title of book:");
		String title=br.readLine();
		
		System.out.println("Enter author of book:");
		String author=br.readLine();
		
		System.out.println("Enter category of book:");
		String category=br.readLine();
		
		System.out.println("Enter price of book:");
		String price=br.readLine();
		if(category!="Science" && category!="Fiction"&& category!="Technoloy"&& category!="other")
		{
			throw new Exception("enter valid category.......(CATEGERY SHOULD HAVE SCIENCE,FICTION,TECHNOLOGY,ETC)");
		}
		else if(bookID.charAt(0)!='b' && bookID.charAt(0)!='B')
		{
			throw new Exception("enter valid book id.......(BOOK ID SHOULD START WITH B OR b)");
		}else if(price < 0 ) {
			//this  get caught in catch block
			throw new Exception("enter valid price.......(PRICE SHOULD NOT BE NAGATIVE)");	
		}
		
		//create student object to store student
		Book_const b=new Book_const( bookID,  title,author,  category,  price);
		boolean an=Book.insert(b);
		if(an) {
			System.out.println("book  is added successfully.......");
			
		}else {
			System.out.println("Something went wrong try again ........");	
		}
		System.out.println(b);
	}
	
	/************************************/
	
	//method for show by title
public static void showbytitle() throws Exception {
	System.out.println("Enter book title to search");
	String title=br.readLine();
	boolean f=true;
	if(f) {
		Book.searchTitle(title);
	}else
	{
		System.out.println("Something went wrong try again ........");
	}
}

/************************************/

//method for show by author
public static void showbyauthor() throws Exception
{
	System.out.println("Enter book author to search");
	String bookauthor=br.readLine();
	boolean f=true;
	if(f) {
		Book.searchTitle(bookauthor);
	}else
	{
		System.out.println("Something went wrong try again ........");
	}
}
}

