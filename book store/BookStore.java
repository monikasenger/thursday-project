package Book_manage_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookStore {

	 static Scanner sc = new Scanner(System.in);
	static char ans;
	static int c;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Welcome to book store app");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.println("PRESS 1 to ADD book details");
			System.out.println("PRESS 2 to select by title from book");
			System.out.println("PRESS 3 to select by author from book");
			System.out.println("PRESS 4 to display book");
			System.out.println("PRESS 5 to EXIT App");
			c=Integer.parseInt(br.readLine());
			switch(c)
			{
			case 1:{
				BookDetails.add_book();//for insert details
			}
			break;
			case 2: {
				BookDetails.showbytitle();//for show by title
			}
			break;
			case 3: {
				BookDetails.showbyauthor();//for show by author
			}
			break;
			case 4: {
				Book.showall();//for show all details
			}
			break;
			case 5:
			{
				//for exit
			}
			break;
			default:
				System.out.println("Something went wrong try again ........");
		}
		System.out.println("Do you want to Add more Items :  Y/N");
			 ans =  sc.next().charAt(0); 
		
			}while(ans == 'y'|| ans =='Y');
		System.out.println("Thank you for using application......");
		System.out.println("See you soon.... bye bye");
	}}

		

	
