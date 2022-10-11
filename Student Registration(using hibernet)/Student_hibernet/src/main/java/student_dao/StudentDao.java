package student_dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import student.Student;


public class StudentDao {
	
	//globally declared
	static String firstname,lastname,date,email,age,gender;
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	static Student student =null;
	static StudentDaoImpl dao = new StudentDaoImpl();
	
	
	/******************************************************/
	
	//insert data method
	public static void insertdata() throws Exception {
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
	}
	
	/******************************************************/
	
	//search data method
	public static void searchdata() throws Exception {
		System.out.print("Enter the studentId: ");
    	long id = Long.valueOf(input.readLine());
    	System.out.println(dao.getStudentById(id));
	}
	
	/******************************************************/
	
	//show all method
public static void showall() {
	List<Student> l1 = dao.getAllStudent();
    System.out.println("**=============**=================**=============**");
	l1.forEach(ob5 -> System.out.println("("+ob5.getId()+")id data:\n"+"firstname:"+ob5.getFirstname()+",lastname: "+ ob5.getLastname()+",gender: "
			+ ob5.getGender()+",age: "+ ob5.getAge()+",DOB: "
			+ ob5.getDob()+",email: "+ ob5.getEmail()));
	 System.out.println("**=============**=================**=============**");
}

/******************************************************/

//delete method
public static void delete() throws Exception {
	System.out.println("Enter the userId: ");
	long id = Long.valueOf(input.readLine());
	System.out.println("Deleting the user.......");
	dao.deleteStudentById(id);
	System.out.println("User deleted successfully!");
}

/******************************************************/


//update method
public static void update() throws Exception {
	System.out.println("1. update first name of student ");
    System.out.println("2. update last name of student");
    System.out.println("3. update age of student");
    System.out.println("4. update gender of student");
    System.out.println("5. update email of student");
    System.out.println("6. update DOB of student");
    System.out.println("7. exit");
    System.out.print("Enter your choice: ");
   int ch = Integer.valueOf(input.readLine());

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
}}}


}
