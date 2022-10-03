package Book_manage_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Book_CP {
	 static Connection con; // declared global connection
		
	 public static Connection createC() {
	 	//load the driver 
	 	try {
	 		//create the connection
	 		  String url = "jdbc:mysql://localhost:3306/java";
	 		 String user = "root";
	 		 	String pass = "root";
	 		con=DriverManager.getConnection(url,user,pass);
	 	} catch (Exception e) {
	 		// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	}
	 	return con; // return connection
	 }
	 }
