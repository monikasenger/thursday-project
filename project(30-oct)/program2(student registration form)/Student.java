package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class Student {

	//jdbc code...
	 static String url = "jdbc:mysql://localhost:3306/java";
	 static	String user = "root";
	 static	String pass = "root";
	 //globally declared the variable 
	 static	Scanner sc = new Scanner(System.in);
	 static	String name, address, phone_no,c_name,c_data,new_data,u_name,table,table_a,table_m,table_d,gender;
	 static	int age,no,i,res;

	 /*****************************************/
	 
	//method for create the table
	public static void create() throws Exception {
		try {//jdbc code...
				      Connection conn = DriverManager.getConnection(url,user,pass);
						//createstatement
				      Statement st = conn.createStatement();
				      //query to create the data
				      String sql = "CREATE TABLE student_registration " +
			                   "(id INTEGER not NULL auto_increment, " +
			                   " name VARCHAR(50), " +
			                   " age INTEGER, " + 
			                   "address   VARCHAR(100), " +
			                   " phone_no VARCHAR(50), " +
			                   " PRIMARY KEY ( id ))"; 
			         st.executeUpdate(sql);//execute..
			         System.out.println("Created table in given database...");   
		}
		catch(Exception e) {
			 System.out.println("already created table");
		}
	}
	
	
	/****************************************/
	
	//method for insert  the data after adding gender column
		public static void insert() throws Exception
			 {
				 System.out.println("how many data you want to enter in the registration of student table : " );
				 no = sc.nextInt();
				 for(i=1;i<=no;i++) {
				System.out.println("Enter student name : " );
				 name = sc.next();//accept the name for insert that data
				System.out.println("Enter  student age :  " );
				 age = sc.nextInt();//accept the age for insert that data
				System.out.println("Enter student address : " );
				 address = sc.next();//accept the address for insert that data
				System.out.println("Enter student phone number : " );
				 phone_no = sc.next();	 //accept the phone number for insert that data
			 }}
		
		/*****************************************/
		
		
	//method for insert  the data before adding gender column
	public static void insertbefore() throws Exception {
		System.out.println("how many data you want to enter in the registration of student table : " );
		 no = sc.nextInt();
		 for(i=1;i<=no;i++) {
		System.out.println("Enter student name : " );
		 name = sc.next();//accept the name for insert that data
		System.out.println("Enter  student age :  " );
		 age = sc.nextInt();//accept the age for insert that data
		System.out.println("Enter student address : " );
		 address = sc.next();//accept the address for insert that data
		System.out.println("Enter student phone number : " );
		 phone_no = sc.next();	 //accept the phone number for insert that data
		 //query for insert the data 
	String query = " insert into student_registration (name,age,address, phone_no) values(?,?,?,?)";
	//jdbc code...
		Connection con = DriverManager.getConnection(url,user,pass);
		//preparedstatement
		 PreparedStatement ps = con.prepareStatement(query); 
		//set the value of parameter
		ps.setString(1,name);
		ps.setInt(2,age);
		ps.setString(3, address);
		ps.setString(4, phone_no);	
		 res = ps.executeUpdate();//execute..
		System.out.println(res+ " data is store in the table");
		ps.close();
		con.close();
		 }}
	
	/*****************************************/
	
	//method for insert  the data after adding gender column
	public static void insertafter() throws Exception
		 {
		System.out.println("how many data you want to enter in the registration of student table : " );
		 no = sc.nextInt();
		 for(i=1;i<=no;i++) {
		System.out.println("Enter student name : " );
		 name = sc.next();//accept the name for insert that data
		System.out.println("Enter  student age :  " );
		 age = sc.nextInt();//accept the age for insert that data
		System.out.println("Enter student address : " );
		 address = sc.next();//accept the address for insert that data
		System.out.println("Enter student phone number : " );
		 phone_no = sc.next();	 //accept the phone number for insert that data
			 System.out.println("Enter student gender : " );
			 gender = sc.next();//accept the gender for insert that data
			 //query for insert the data 
		String query = " insert into student_registration (name,age,address, phone_no,gender) values(?,?,?,?,?)";
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			 PreparedStatement ps = con.prepareStatement(query); 
			//set the value of parameter
			ps.setString(1,name);
			ps.setInt(2,age);
			ps.setString(3, address);
			ps.setString(4, phone_no);
			ps.setString(5, gender);
			 res = ps.executeUpdate();//execute..
			System.out.println(res+ " data is store in the table");
			ps.close();
			con.close();
		 }}
		 
	/*****************************************/
	
	//method for select the before adding gender column
	public  static void selectbefore() throws Exception {
		String myQuery = "select * from student_registration";//query for select all the data 
		//jdbc code...
	    	  Connection  con = DriverManager.getConnection(url, user, pass);
	  		//preparedstatement
	    	  PreparedStatement   pstmt = con.prepareStatement(myQuery);
		  ResultSet res = pstmt.executeQuery();
	        System.out.println("**=============**=================**=============**");
	    	 System.out.println("Id\tName\tAge\taddress\t\tphone number");
	         while(res.next()) {
	            System.out.print(res.getInt(1));
	            System.out.print("\t"+res.getString(2));
	            System.out.print("\t"+res.getInt(3));
	            System.out.print("\t"+res.getString(4));
	            System.out.print("\t\t"+res.getString(5));
	            try {
	            System.out.print("\t\t"+res.getString(6));
	            }catch(Exception e) {
	            	 System.out.println( );
	            }
	            System.out.println();  
	         } System.out.println("**=============**=================**=============**");
		}
	
	/*****************************************/
	
	//method for select the after adding gender column
	public  static void selectafter() throws Exception {
		String myQuery = "select * from student_registration";//query for select all the data  
		//jdbc code...
  	  Connection  con = DriverManager.getConnection(url, user, pass);
		//preparedstatement
  	  PreparedStatement   pstmt = con.prepareStatement(myQuery);
			 ResultSet re = pstmt.executeQuery();
		    	 System.out.println("Id\tName\tAge\taddress\t\tphone number\t\tgender");
		         while(re.next()) {
		            System.out.print(re.getInt(1));
		            System.out.print("\t"+re.getString(2));
		            System.out.print("\t"+re.getInt(3));
		            System.out.print("\t"+re.getString(4));
		            System.out.print("\t\t"+re.getString(5));
		            System.out.print("\t\t"+re.getString(6));
		            System.out.println(); 
		         } System.out.println("**=============**=================**=============**");
		}
	
	/*****************************************/
	
	//method for delete the data 
	 public  static void delete_data() throws Exception {
			System.out.println("Enter id to delete the ata : " );
			c_data=sc.next();//accept the id for delete that data
			String query = " delete from student_registration where id=?";//query for delete data
			//jdbc code...
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
			//set the value of parameter
			ps.setString(1,c_data);
			int res = ps.executeUpdate();//execute..
			System.out.println("no of data delete : "+res);
			ps.close();
			con.close();
		
			
	 }
	 /*****************************************/
	 
	 //method for update the phone
	 public  static void update_phone() throws Exception{
			System.out.println("Enter data of phone column to change : " );
			c_data=sc.next();//accept the phone to update
			System.out.println("Enter id data : " );
			new_data=sc.next();//accept the id for update that data
			String query = " update student_registration set phone_no = ? where id = ?";//query for update the phone column
			//jdbc code...
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
			//set the value of parameter
			ps.setString(1,c_data);
			ps.setString(2,new_data);
			int res = ps.executeUpdate();//execute..
			System.out.println("no of data you update : "+res);
			ps.close();
			con.close();
	 }
	 
	 /*****************************************/
	 
	 //method for update the gender
	 public  static void update_gender() throws Exception{
		 try {
			System.out.println("Enter data of gender column to change : " );
			c_data=sc.next();//accept the gender to update
			System.out.println("Enter id data : " );
			new_data=sc.next();//accept the id for update that data
			String query = " update student_registration set gender = ? where id = ?";//query for update the gender column
			//jdbc code...
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
			//set the value of parameter
			ps.setString(1,c_data);
			ps.setString(2,new_data);
			int res = ps.executeUpdate();//execute..
			System.out.println("no of data you update : "+res);
			ps.close();
			con.close();
		 }catch(Exception e) {
			 System.out.println("gender column has been deleted");
		 }		
	 }
	 
	 /*****************************************/
	 
	 //method of update the name
	 public  static void update_name() throws Exception{
			System.out.println("Enter data of name column to change: " );
			c_data=sc.next();//accept the name to update 
			System.out.println("Enter id column : " );
			new_data=sc.next();//accept the id for update that data
			String query = " update student_registration set name = ? where id = ?";//query for update the name column
			//jdbc code...
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
			//set the value of parameter
			ps.setString(1,c_data);
			ps.setString(2,new_data);
			int res = ps.executeUpdate();//execute..
			System.out.println("no of data you update : "+res);
			ps.close();
			con.close();
	 }
	 
	 /*****************************************/
	 
	 //method of update the age
	 public  static void update_age() throws Exception{
			System.out.println("Enter data of age column to change: " );
			c_data=sc.next();//accept the address to update
			System.out.println("Enter id column : " );
			new_data=sc.next();//accept the id for update that data
			String query = " update student_registration set age = ? where id = ?";//query for update the age column
			//jdbc code...
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
			//set the value of parameter
			ps.setString(1,c_data);
			ps.setString(2,new_data);	
			int res = ps.executeUpdate();//execute..
			System.out.println("no of data you update : "+res);
			ps.close();
			con.close();
	 }
	 
	 /*****************************************/
	 
	 //method of update the address
	 public  static void update_address() throws Exception{
			System.out.println("Enter data of address column to change: " );
			c_data=sc.next(); //accept the address to update
			System.out.println("Enter id column : " );
			new_data=sc.next();//accept the id for update that data
			String query = " update student_registration set address = ? where id = ?";//query for update the address column
			//jdbc code...
			Connection con = DriverManager.getConnection(url,user,pass);
			//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
			//set the value of parameter
			ps.setString(1,c_data);
			ps.setString(2,new_data);
			int res = ps.executeUpdate();//execute..
			System.out.println("no of data you update : "+res);
			ps.close();
			con.close();
	 }
	 
	 /*****************************************/
	 
	 //method of delete the table
	 public  static void drop_table() throws Exception{
		String query = "drop table student_registration"; //query for delete table
		//jdbc code...
		Connection con = DriverManager.getConnection(url,user,pass);
	//preparedstatement	
		PreparedStatement ps = con.prepareStatement(query);
	      ps.execute(query);//execute..
	      System.out.println(" table removed.......");
	      ps.close();
			con.close();
	 }
	 
	 /*****************************************/
	 
	 //method of add the gender column
	 public  static void add_col() throws Exception{
		String query = "alter table student_registration add gender varchar(100) "; //query for add column
		//jdbc code...
		Connection con = DriverManager.getConnection(url,user,pass);
		//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
	      ps.execute(query);//execute..
	      System.out.println(" gender column has been added ......");
	      ps.close();
			con.close();
	 }
	 
	 
	 /*****************************************/
	 
	 //method of drop the gender column
	 public  static void drop_col() throws Exception{
		String query = "alter table student_registration drop gender "; //query for drop column
		//jdbc code...
		Connection con = DriverManager.getConnection(url,user,pass);
		//preparedstatement
			PreparedStatement ps = con.prepareStatement(query);
	      ps.execute(query);//execute..
	      System.out.println(" gender column has been delete....");
	      ps.close();
			con.close();
		 }
	 }

