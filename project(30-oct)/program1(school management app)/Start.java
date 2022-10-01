package StudentManagementApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
  
//main method
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("Welcome to student Management app");
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    //check the condition
while(true)
{
	System.out.println("PRESS 1 to ADD Student");
	System.out.println("PRESS 2 to DELETE Student");
	System.out.println("PRESS 3 to DISPLAY Student");
	System.out.println("PRESS 4 to UPDATE Student");
	System.out.println("PRESS 5 to EXIT App");
	int c=Integer.parseInt(br.readLine());//enter user choice for student
	
	if(c==1)  //for user 1 choice i.e. add the student
	{
		//add  the student
		System.out.println("Enter student name:");
		String name=br.readLine();
		
		System.out.println("Enter student phone:");
		String phone=br.readLine();
		
		System.out.println("Enter student city:");
		String city=br.readLine();
		
		//create student object to store student
		Student st=new Student(name, phone, city);
		boolean ans=StudentDao.insertStudentToDB(st);
		if(ans) {
			System.out.println("Student is added successfully.......");
			
		}else {
			System.out.println("Something went wrong try again ........");
			
		}
		System.out.println(st);
		
	}
  else if(c==2)   //for user 2 choice i.e. delete the student
	{
		//delete  the student
		System.out.println("Enter student id to delete");
		int userID=Integer.parseInt(br.readLine());
		boolean f=StudentDao.deleteStudent(userID);
		if(f) {
			System.out.println("Deleted ......");
			
		}else {
			System.out.println("Something went wrong......");
		}
	}else if(c==3)     //for user 3 choice i.e. show the student
	{
		//display  the student
		StudentDao.showAllStudent();
	}
	else if(c==4)     //for user 1 choice i.e. update the student
  {
		//update  the student
		System.out.println("PRESS 1 to update student name");
		System.out.println("PRESS 2 to update student phone number");
		System.out.println("PRESS 3 to update student city");
		System.out.println("PRESS 4 to EXIT from update statement");
		int ch=Integer.parseInt(br.readLine());   //enter user choice for update student
		if(ch==1)    //for user 1 choice  in update i.e. update the name of student
		{
			//update student name
			
			System.out.println("Enter student id in which you update the user name: ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter student name to update:");
			String name=br.readLine();
			boolean ans=StudentDao.updatestudentname(id, name);
			if(ans) {
				System.out.println("Student name update  successfully.......");
				
			}else {
				System.out.println("Something went wrong try again ........");
				
			}
			
		}else if(ch==2)  //for user 2 choice  in update i.e. update the phone of student
		{
			//update student phone number
			
			System.out.println("Enter student id in which you update the student phone number: ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter student phone number to update:");
			String phone=br.readLine();
			boolean ans=StudentDao.updatestudentphone( id,phone);
			if(ans) {
				System.out.println("Student phone number update  successfully.......");
				
			}else {
				System.out.println("Something went wrong try again ........");
				
			}
		}
    else if(ch==3)    //for user 3 choice  in update i.e. update the city of student
		{
			//update student city number
			
			System.out.println("Enter student id in which you update the student city: ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter student city to update:");
			String city=br.readLine();
			boolean ans=StudentDao.updatestudentcity(id,city);
			if(ans) {
				System.out.println("Student city update  successfully.......");
				
			}else {
				System.out.println("Something went wrong try again ........");
				
			}
		}
		else if(ch==4)//for user 4 choice  in update i.e. exit from update  student
		{
			//exit
			break;
		}else
		{
			
		}
	}
  else if(c==5)  //for user 5 choice  i.e. exit student
	{
		//exit
		break;
	}else
	{
		
	}
}
System.out.println("Thank you for using application......");
System.out.println("See you soon.... bye bye");
	}

}
