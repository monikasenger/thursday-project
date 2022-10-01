package StudentManagementApp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	// method for insert the data in student table
public static boolean insertStudentToDB(Student st) {
	boolean f=false;
try {
		//jdbc code...
	Connection con=CP.createC();
	String q="insert into students(sname,sphone,scity) values(?,?,?)";  // query for insertion
//preparedstatement
		PreparedStatement pstmt=con.prepareStatement(q);
	//set the value of parameter
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
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

/*****************************************/

//method for delete the data in student table
public static boolean deleteStudent(int userID) {
	// TODO Auto-generated method stub
	boolean f=false;
	try {
			//jdbc code...
		Connection con=CP.createC();
		String q="delete from students where sid=?"; // query for deletetion
	//preparedstatement
			PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameter
			pstmt.setInt(1, userID);
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

/*****************************************/

//method for show all the data in student table
public static boolean showAllStudent() {
	// TODO Auto-generated method stub
	boolean f=false;
	try {
			//jdbc code...
		Connection con=CP.createC();
		String q="select * from students"; //query for selection
	Statement stmt=con.createStatement();
	ResultSet res=stmt.executeQuery(q);
	 System.out.println("**=============**=================**=============**");
	 System.out.println("Id\tName\t\tphone number\tcity");
     while(res.next()) {
        System.out.print(res.getInt(1));
        System.out.print("\t"+res.getString(2));
        System.out.print("\t\t"+res.getString(3));
        System.out.print("\t"+res.getString(4));
        System.out.println();  
     }
     System.out.println("**=============**=================**=============**");
	} 
	catch (Exception e) 
	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
}

/*****************************************/

//method for update the student name in student table
public static boolean updatestudentname( int userID,String name) {
	// TODO Auto-generated method stub
	boolean f=false;
	try {
			//jdbc code...
		Connection con=CP.createC();
		String q="update students set sname = ? where sid = ?"; //query of updation in name
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameter
			pstmt.setString(1, name);
			pstmt.setInt(2, userID);
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

/*****************************************/

//method for update the student phone number  in student table
public static boolean updatestudentphone( int userID,String phone) {
	// TODO Auto-generated method stub
	boolean f=false;
	try {
			//jdbc code...
		Connection con=CP.createC();
		String q="update students set sphone = ? where sid = ?";//query of updation in phone number
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameter
			pstmt.setString(1, phone);
			pstmt.setInt(2, userID);
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

/*****************************************/

//method for update the student city in student table
public static boolean updatestudentcity(int userID,String city) {
	// TODO Auto-generated method stub
	boolean f=false;
	try {
			//jdbc code...
		Connection con=CP.createC();
		String q="update students set scity = ? where sid = ?"; //query of updation in city
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameter
			pstmt.setString(1, city);
			pstmt.setInt(2, userID);
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
}
