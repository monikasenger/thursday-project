package Book_manage_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Book {
	
	//method of insert the data
	public static boolean insert(Book_const b) {
		boolean f=false;
	try {
			//jdbc code...
		Connection con=Book_CP.createC();
		String q="insert into book(bookID,title,author,category,price ) values(?,?,?,?,?)";  // query for insertion
	//preparedstatement
			PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameter
			pstmt.setString(1, b.getBookID());
			pstmt.setString(2, b.getTitle());
			pstmt.setString(3, b.getAuthor());
			pstmt.setString(4,b.getCategory());
			pstmt.setString(5, b.getPrice());
			//execute..
			pstmt.executeUpdate();
	f=true;
	}
	catch (Exception e) 
	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
	
	/**********************************************/
	
	//method for show by title
	public static boolean searchTitle( String booktitle) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
				//jdbc code...
			Connection con=Book_CP.createC();
			String q="select * from book where title=?"; //query for selection
	PreparedStatement pstmt=con.prepareStatement(q);
	pstmt.setString(1,booktitle);
		ResultSet res=pstmt.executeQuery();
		 System.out.println("**=============**=================**=============**");
		 System.out.println(" bookid\t title\t author\t category\t price");
	     while(res.next()) {
	        System.out.print(res.getString(1));
	        System.out.print("\t"+res.getString(2));
	        System.out.print("\t"+res.getString(3));
	        System.out.print("\t"+res.getString(4));
	        System.out.print("\t"+res.getString(5));
	        System.out.println();  
	     }
	     System.out.println("**=============**=================**=============**");
		f=true;
		} 
		catch (Exception e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
	}

	/**********************************************/
	
	//method for show by author
	public static boolean searchauthor( String bookauthor) {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
				//jdbc code...
			Connection con=Book_CP.createC();
			String q="select * from book where author=?"; //query for selection
	PreparedStatement pstmt=con.prepareStatement(q);
	pstmt.setString(1,bookauthor);
		ResultSet res=pstmt.executeQuery();
		 System.out.println("**=============**=================**=============**");
		 System.out.println(" bookid\t title\t author\t category\t price");
	     while(res.next()) {
	        System.out.print(res.getString(1));
	        System.out.print("\t"+res.getString(2));
	        System.out.print("\t"+res.getString(3));
	        System.out.print("\t"+res.getString(4));
	        System.out.print("\t"+res.getString(5));
	        System.out.println();  
	     }
	     System.out.println("**=============**=================**=============**");
		f=true;
		} 
		catch (Exception e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
	}

	/**********************************************/
	
	//method for show all details
	public static boolean showall() {
		// TODO Auto-generated method stub
		boolean f=false;
		try {
				//jdbc code...
			Connection con=Book_CP.createC();	
			String q="select * from book "; //query for selection
	PreparedStatement pstmt=con.prepareStatement(q);

		ResultSet res=pstmt.executeQuery(q);
		 System.out.println("**=============**=================**=============**");
		 System.out.println(" bookid\t title\t author\t category\t price");
	     while(res.next()) {
	        System.out.print(res.getString(1));
	        System.out.print("\t"+res.getString(2));
	        System.out.print("\t"+res.getString(3));
	        System.out.print("\t"+res.getString(4));
	        System.out.print("\t"+res.getString(5));
	        System.out.println();  
	     }
	     System.out.println("**=============**=================**=============**");
		f=true;
		} 
		catch (Exception e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f;
	}
}
