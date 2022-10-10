package run;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.List;

import student.Student;

import student_dao.StudentDaoImpl;




public class Student_start extends StudentDaoImpl
{
	static String firstname,lastname,date,email,age,gender;
	static int ch,choice;
	static Student student =null;
    public static void main( String[] args )
    {
    	StudentDaoImpl dao = new StudentDaoImpl();
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	try {
                System.out.println("=============REGISTRATIONS FORM==============");
                System.out.println("1. Create a new student ");
                System.out.println("2. See a student detail");
                System.out.println("3. See all the students details");
                System.out.println("4. Update a student information");
                System.out.println("5. Delete a student");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                 choice = Integer.valueOf(input.readLine());

                switch(choice) {
        	        case 1://insert data
        	        {
        	        	System.out.print("Enter the firstname: ");
        	        	 firstname = input.readLine().trim();
        	        	System.out.print("Enter the lastname: ");
        	        	 lastname = input.readLine().trim();
        	        	System.out.println();
        	        	System.out.println("Dob format will be yyyy-mm-dd");
        	        	System.out.print("Enter the dob: ");
        	        	 date = input.readLine().trim();
        	        	System.out.print("Enter the age: ");
        	         age = input.readLine().trim();
        	        	System.out.print("Enter the gender: ");
        	        	 gender = input.readLine().trim();
        	        	System.out.print("Enter the email: ");
        	        	 email = input.readLine().trim();
        	         student = new Student(firstname, lastname,date,age,gender,email);
        	        	System.out.println("\nAdding the user.........");
        	        	dao.saveStudent(student);
        	        	System.out.println("Student added successfully!");
        	        	break;
        	        }
        	        case 2:
        	        {//search data
        	        	System.out.print("Enter the studentId: ");
        	        	long id = Long.valueOf(input.readLine());
        	        	System.out.println(dao.getStudentById(id));
        	        	break;
        	        }
        	        case 3:
        	        	//show all
        	        {
        	        	List<Student> l1 = dao.getAllStudent();
        	        System.out.println("**=============**=================**=============**");
        			l1.forEach(ob5 -> System.out.println(ob5.getId()+" -id data:\n"+ob5.getFirstname()+", "+ ob5.getLastname()+", "
        					+ ob5.getGender()+", "+ ob5.getAge()+", "
        					+ ob5.getDob()+", "+ ob5.getEmail()));
        			 System.out.println("**=============**=================**=============**");
        	        	break;
        	        }
        	        case 4:
        	        {
        	        	//update
        	        	 System.out.println("1. update first name of student ");
        	                System.out.println("2. update last name of student");
        	                System.out.println("3. update age of student");
        	                System.out.println("4. update gender of student");
        	                System.out.println("5. update email of student");
        	                System.out.println("6. update DOB of student");
        	                System.out.println("7. exit");
        	                System.out.print("Enter your choice: ");
        	               ch = Integer.valueOf(input.readLine());
     
        	               switch(ch) {
               	        case 1:   
               	        {
               	        	//update first name
        	        	System.out.println("Enter the studentId: ");
        	        	long id = Long.valueOf(input.readLine());
        	        	
        	        	Student student = dao.getStudentById(id);
        	        	if(student == null) {
        	        		System.out.println("Sorry! The student does not exit.");
        	        		break;
        	        	}
        	        	System.out.print("Enter the firstname: ");
        	        	String firstname = input.readLine().trim();
               	        
        	        	if(firstname != ""){
        	        		student.setFirstname(firstname);
        	        	 System.out.println("\nUpdating the student.........");
         	        	dao.updateStudent(student);
         	        	System.out.println("student updated successfully!");
        	        	}
               	        }
               	        break;
               	        case 2:{
               	        	//update last name
            	        	System.out.println("Enter the studentId: ");
            	        	long id = Long.valueOf(input.readLine());
            	        	
            	        	Student student = dao.getStudentById(id);
            	        	if(student == null) {
            	        		System.out.println("Sorry! The student does not exit.");
            	        		break;
            	        	}
               	        System.out.print("Enter the lastname: ");
        	        	String lastname = input.readLine().trim();
        	        	if(lastname != "")
        	        		student.setLastname(lastname);
        	        	 System.out.println("\nUpdating the student.........");
         	        	dao.updateStudent(student);
         	        	System.out.println("student updated successfully!");
               	        }
               	        break;
               	        case 3:
               	        {
               	       //update age
            	        	System.out.println("Enter the studentId: ");
            	        	long id = Long.valueOf(input.readLine());
            	        	
            	        	Student student = dao.getStudentById(id);
            	        	if(student == null) {
            	        		System.out.println("Sorry! The student does not exit.");
            	        		break;
            	        	}
        	        	System.out.print("Enter the age: ");
        	        	String age = input.readLine().trim();
        	        	if(age != "")
        	        		student.setAge(age);
        	        	 System.out.println("\nUpdating the student.........");
         	        	dao.updateStudent(student);
         	        	System.out.println("student updated successfully!");
        	        	}
               	        break;
               	        case 4:
               	        {
               	       //update gender
            	        	System.out.println("Enter the studentId: ");
            	        	long id = Long.valueOf(input.readLine());
            	        	
            	        	Student student = dao.getStudentById(id);
            	        	if(student == null) {
            	        		System.out.println("Sorry! The student does not exit.");
            	        		break;
            	        	}
        	        	System.out.print("Enter the gender: ");
        	        	String gender = input.readLine().trim();
        	        	if(gender != "")
        	        		student.setGender(gender);
       	        	 System.out.println("\nUpdating the student.........");
        	        	dao.updateStudent(student);
        	        	System.out.println("student updated successfully!");
        	        	}
               	     break;
               	        case 5:{
               	       //update email
            	        	System.out.println("Enter the studentId: ");
            	        	long id = Long.valueOf(input.readLine());
            	        	
            	        	Student student = dao.getStudentById(id);
            	        	if(student == null) {
            	        		System.out.println("Sorry! The student does not exit.");
            	        		break;
            	        	}
        	        	System.out.print("Enter the email: ");
        	        	String email = input.readLine().trim();
        	        	if(email != "")
        	        		student.setGender(email);
        	        	}
               	     break;
               	        case 6:
               	        {
               	       //update dob
            	        	System.out.println("Enter the studentId: ");
            	        	long id = Long.valueOf(input.readLine());
            	        	
            	        	Student student = dao.getStudentById(id);
            	        	if(student == null) {
            	        		System.out.println("Sorry! The student does not exit.");
            	        		break;
            	        	}
        	        	System.out.print("Enter the DOB: ");
        	        	String DOB = input.readLine().trim();
        	        	if(DOB != "")
        	        		student.setGender(DOB);
        	        	}
               	       
        	        break;
        	        case 7:{//exit
        	        	System.exit(0);
        	        }
        	        }
        	               }
        	       break; 
        	        case 5:
        	        {
        	        	//delete 
        	        	System.out.println("Enter the userId: ");
        	        	long id = Long.valueOf(input.readLine());
        	        	System.out.println("Deleting the user.......");
        	        	dao.deleteStudentById(id);
        	        	System.out.println("User deleted successfully!");
        	        	break;
        	        }
        	        case 6://exit
        	        	System.exit(0);
                }
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        }
    }
}