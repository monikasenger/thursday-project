package mysql;

import java.util.Scanner;

public class Student_main extends Student{
	
	 static Scanner sc = new Scanner(System.in);
	static char ans=0,add=0,dis=0;
	static int choice,al,up;
	//main method
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(".......welcome to the student registration form.........");
		do {
			System.out.println("   \n 1: create a student registration table \n"
					+ " 2:insert the data in the table \n 3: delete a row in the table"
				+"\n4: update a row in the table"	+"\n5: select the  table"
					+"\n 6: delete a table"
					+"\n 7: changes in column in table");
			System.out.print("Enter your Order :");
			 choice = sc.nextInt();
			
			switch(choice) 
			{//for create table
			case 1 : create();
			break;
			//for insert data
			case 2:
				{
          System.out.println("can you add new column i.e. gender column or not? Y/N        ");
			add = sc.next().charAt(0); 
			if(add=='y' ||add=='Y') {
				insertafter();//insert when new column is added
			}
         else if(add=='n' ||add=='N')
			{
				insertbefore();//insert when new column is not added
			}
			else
			{
				System.out.println("Something went wrong try again ........");
			}}
			break;
			//delete the data
			case 3: delete_data();
			break;
			//update the column
			case 4:{ System.out.println(" update   :-  \n1:update the age"
					+ "\n2: update the name "
					+ "\n3: update the address"
					+ "\n4: update the phone number "+ "\n5: update the gender");
			System.out.print("Enter the choice for update :-");
			 up = sc.nextInt();
			switch(up){
		     case 1: update_age();//update the age column
		     break;
		     case 2:
		    	 update_name();//update the name column
		    	 break;
		     case 3:
		    	 update_address();//update the address column
		    	 break;
		     case 4:
		    	 update_phone();//update the phone column
		    	 break;
		     case 5:
		    	 update_gender();//update the gender column
		    	 break;
		    	 default:
		    		 System.out.println(" ");
		     }}
			break;
			//display the details
			case 5:
				{
          System.out.println("display the details after adding new column i.e. gender column: Y/N ");
			 dis = sc.next().charAt(0); 
			if(dis=='y' ||dis =='Y') {
				selectafter();//select when new column is added
			}else if(dis=='n' ||dis =='N')
			{
				selectbefore();//insert when new column is not added
			}else 
			{
				System.out.println("Something went wrong try again ........");
			}
				}
			break;
			//delete the table
			case 6: drop_table();
			break;
			//changes in the table
			case 7: {
        System.out.println("alter   :- \n1: add the gender column "
					+ "\n2: delete the gender column");
			System.out.print("Enter the choice for alter :-");
			 al = sc.nextInt();
			switch(al){
		     case 1:
		    	 add_col();//add gender column
		    	 break;
		     case 2:
		    	 drop_col();//delete gender column
		    	 break;
		    	 default:
		    		 System.out.println(" ");
		     }}
			default:
				System.out.println("Something went wrong try again ........");
		}
		System.out.println("Do you want to Add more Items :  Y/N");
			 ans = sc.next().charAt(0); 
		}
    while(ans == 'y'|| ans =='Y');
		
}}
